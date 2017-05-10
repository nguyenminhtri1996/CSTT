/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import static javafx.application.Platform.exit;

/**
 *
 * @author Minh Tri
 */
public class TimLoiGiai {
   private static Vector loigiai = new Vector();
   public TimLoiGiai(){} // construction
   
   public static boolean kiemtra_chuoicon(String cha, String con)
   {
       boolean t = false;
       int lc = 0;
       int i = 0;
       for(i = 0; i < con.length(); i++)
       {
           for(int j = 0; j < cha.length(); j++)
           {
               if(con.charAt(i) == cha.charAt(j))
               {
                   lc = 1;
                   break;
               }
           }
           if(lc == 1)
               lc = 0;
           else
               break;
       }
       if(i < con.length())
           t = false;
       else
           t = true;
       return t;
   }
   
   public static boolean kiemtra_chua(String s, String a)
   {
       boolean lc = false;
       for(int i = 0; i < s.length(); i++)
       {
           if(s.equals(a))
               lc = true;
       }
       return lc;
   }
   
   public static void ThucHien(Vector giathiet, Vector ketluan, String loaimach) throws SQLException
   {
       String chuoi_giathiet = "";
       String chuoi_ketluan = "";
       for(int i = 0; i < giathiet.size(); i++)
       {
           chuoi_giathiet += (String) giathiet.get(i)+" ";
       }
       for(int i = 0; i < ketluan.size(); i++) // Kiểm tra kết luận đã có trong giả thiết chưa
       {
           if(kiemtra_chua(chuoi_giathiet, (String) ketluan.get(i)) == true)
           {
               ketluan.remove(i);
           }
       }
       if(!ketluan.isEmpty())
       {
           for(int i = 0; i < ketluan.size(); i++)
           {
               chuoi_ketluan += (String) ketluan.get(i)+" ";
           }
           ResultSet rs = KetNoi.Connect(loaimach);
           while(rs.next())
           {
               
               String ma = rs.getString("ma");
               String gt = rs.getString("giathiet"); // giả thiết trong CSTT
               String kl = rs.getString("ketluan"); // kết luận trong CSTT
               if(kiemtra_chuoicon(chuoi_giathiet, gt) == true) // Kiểm tra xem giả thiết trong CSTT có thuộc giả thiết đề bài cho
               {
                   chuoi_giathiet += kl+" ";
                   //
                   System.out.println(chuoi_giathiet);
                   //
                   loigiai.add(ma);
                   if(kiemtra_chuoicon(chuoi_giathiet, chuoi_ketluan) == true)
                   {
                       break;
                   }
               }
               
           }  
       }
       
       // Rút gọn lời giải/////////////////////////////////
       
       
   }
   public static Vector LayLoiGiai()
   {
       return loigiai;
   }
   public static void main(String args[]) throws SQLException
   {   
       
       
   }
   
   
    
}

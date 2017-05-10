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
   private static int kiemtra_timduoc;
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
       String chuoi_gt = chuoi_giathiet;
       
       
       
       if(!ketluan.isEmpty())
       {
           for(int i = 0; i < ketluan.size(); i++)
           {
               chuoi_ketluan += (String) ketluan.get(i)+" ";
           }
           String chuoi_kl = chuoi_ketluan;
           ResultSet rs = KetNoi.Connect(loaimach);
           int flag_timduoc = 0; // Cờ kiểm tra xem bài toán có giải được không
           while(rs.next())
           {
               
               String ma = rs.getString("ma");
               String gt = rs.getString("giathiet"); // giả thiết trong CSTT
               String kl = rs.getString("ketluan"); // kết luận trong CSTT
               if(kiemtra_chuoicon(chuoi_giathiet, gt) == true) // Kiểm tra xem giả thiết trong CSTT có thuộc giả thiết đề bài cho
               {
                   chuoi_giathiet += kl+" ";                   
                   loigiai.add(ma);
                   if(kiemtra_chuoicon(chuoi_giathiet, chuoi_ketluan) == true)
                   {
                       flag_timduoc = 1; // Cờ xác định bài toán giải được
                       break;
                   }
               }
               
           }  
           kiemtra_timduoc = flag_timduoc;
           if(kiemtra_timduoc == 1)
           {
               // Rút gọn lời giải/////////////////////////////////
               // Đã nhận được Vector loigiai chứa các lời giải của bài toán nhưng chưa được rút gọn 
               for(int i = 0; i < loigiai.size(); i++)
               {
                   int lc = i;
                   int flag2 = 0;
                   String loigiai_loaibo = (String)loigiai.get(lc);
                   loigiai.remove(lc);
                   for(int j = 0; j < loigiai.size(); j++)
                   {   
                       int flag1 = 0;
                       ResultSet _rs = KetNoi_RutGon.Connect(loaimach, (String) loigiai.get(j));
                       while(_rs.next())
                       {

//                            String ma = rs.getString("ma");
                            String gt = rs.getString("giathiet"); // giả thiết trong CSTT
                            String kl = rs.getString("ketluan"); // kết luận trong CSTT
                            if(kiemtra_chuoicon(chuoi_gt, gt) == true) // Kiểm tra xem giả thiết trong CSTT có thuộc giả thiết đề bài cho
                            {
                                chuoi_gt += kl+" ";                   
                                
                                if(kiemtra_chuoicon(chuoi_gt, chuoi_kl) == true)
                                {   
                                    flag1 = 1;
                                    break;                                    
                                }
                            }
                       } 
                       
                       if(flag1 == 1)
                       {
                           flag2 = 1;
                           break;
                       }
                   }
                   if(flag2 == 0)
                   {
                       loigiai.add(lc, loigiai_loaibo);
                   }
               }
           }
             
       }
       
       
       
       
       
   }
   public static Vector LayLoiGiai()
   {
       return loigiai;
   }
   public static int KiemTra_TimDuoc()
   {
       return kiemtra_timduoc;
   }
   public static void main(String args[]) throws SQLException
   {   
       
       
       
   }
   
   
    
}

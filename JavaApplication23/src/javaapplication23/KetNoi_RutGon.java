/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Minh Tri
 */
public class KetNoi_RutGon {
    public static Connection conn;
    public static Statement stmt;    
    public static ResultSet Connect(String _tenbang, String _dk)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vatlymotchieu","root","haohao0501");
            stmt = conn.createStatement();
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
        ResultSet _rs = null;
        try
        {
            _rs = stmt.executeQuery("select * from "+_tenbang+"where ma=\""+_dk+"\"");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return _rs;
    }
}

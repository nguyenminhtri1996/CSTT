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

/**
 *
 * @author Minh Tri
 */
public class TimLoiGiai {
   private Vector loigiai = new Vector();
   public TimLoiGiai(){} // construction
   public Vector ThucHien()
   {
       return loigiai;
   }
   
   
    
}

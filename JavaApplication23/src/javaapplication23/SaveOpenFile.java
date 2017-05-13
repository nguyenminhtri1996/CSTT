/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Minh Tri
 */
public class SaveOpenFile {
    
    public SaveOpenFile(){}
    public static void ThucHien_Luu(String De, String BaiLam) throws IOException
    {
        JFileChooser c = new JFileChooser();
        int rVal = c.showSaveDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) 
        {
            String filename = c.getSelectedFile().getName();
            String dir = c.getCurrentDirectory().toString();
            
            File file = new File(dir+"\\"+filename+".txt");
            file.createNewFile();
            FileWriter writer = new FileWriter(file); 
            
//            writer.write("Day\n la\n mot\n vi\n du\n"); 
            //Thực hiện ghi file
            writer.write("ĐỀ BÀI: \n");
            writer.write(De+"\n");
            writer.write("\n");
            writer.write("BÀI LÀM: \n");
            writer.write(BaiLam+"\n");
            writer.flush();
            writer.close();                     
        }
    }
    public static void ThucHien_Mo()
    {
        
    }
    
}

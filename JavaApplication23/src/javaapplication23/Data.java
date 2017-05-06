/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Vector;

/**
 *
 * @author Minh Tri
 */
public class Data {
    private static Vector giathiet = new Vector();
    private static Vector ketluan = new Vector();
    public Data(Vector _giathiet, Vector _ketluan)
    {
        for(int i = 0; i < _giathiet.size(); i++)
        {
            giathiet.add(_giathiet.get(i));
        }
        for(int j = 0; j < _ketluan.size(); j++)
        {
            ketluan.add(_ketluan.get(j));
        }
    }
    public Vector get_giathiet()
    {
        return giathiet;
    }
    public Vector get_ketluan()
    {
        return giathiet;
    }   
}

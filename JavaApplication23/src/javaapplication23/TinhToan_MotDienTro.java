/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Minh Tri
 */
public class TinhToan_MotDienTro {
    private static double I = 0;
    private static double U = 0;
    private static double R = 0;
    private static double P = 0;
    private static double A = 0;
    private static double Q = 0;
    private static double q = 0;
    private static double t = 0;
    public static void Gan_GiaTri(Vector giathiet, Vector giatri)
    {
        for(int i = 0; i < giathiet.size(); i++)
        {
            switch((String)giathiet.get(i))
            {
                case "I":
                    I = (int)giatri.get(i);
                    break;
                case "U":
                    U = (int)giatri.get(i);
                    break;
                case "R":
                    R = (int)giatri.get(i);
                    break;
                case "P":
                    P = (int)giatri.get(i);
                    break;
                case "A":
                    A = (int)giatri.get(i);
                    break;
                case "Q":
                    Q = (int)giatri.get(i);
                    break;
                case "q":
                    q = (int)giatri.get(i);
                    break;
                case "t":
                    t = (int)giatri.get(i);
                    break;
            }
        }
    }
    public static String In_CongThuc(Vector loigiai)
    {
        String baigiai = "";
        for(int i = 0; i < loigiai.size(); i++)
        {   
            switch((String)loigiai.get(i))
            {
                case "M001":
                    baigiai += "Áp dụng công thức: I = q/t\n";
                    I = q/t;
                    baigiai += "=> Tìm được: I ="+I+" (A)\n";
                    break;
                case "M002":
                    baigiai += "Áp dụng công thức: I = U/R\n";
                    I = U/R;
                    baigiai += ("=> Tìm được: I ="+I+" (A)\n");
                    break;
                case "M003":
                    baigiai += "Áp dụng công thức: I = A/(U.t)\n";
                    I = A/(U*t);
                    baigiai += ("=> Tìm được: I ="+I+" (A)\n");
                    break;
                case "M004":
                    baigiai += "Áp dụng công thức: I = P/U\n";
                    I = P/U;
                    baigiai += ("=> Tìm được: I ="+I+" (A)\n");
                    break;
                case "M005":
                    baigiai += "Áp dụng công thức: U = I.R\n";
                    U = I*R;
                    baigiai += ("=> Tìm được: U ="+U+" (V)\n");
                    break;
                case "M006":
                    baigiai += "Áp dụng công thức: U = P/I\n";
                    U = P/I;
                    baigiai += ("=> Tìm được: U ="+U+" (V)\n");
                    break;
                case "M007":
                    baigiai += "Áp dụng công thức: U = A/(I.t)\n";
                    U = A/(I*t);
                    baigiai += ("=> Tìm được: U ="+U+" (V)\n");
                    break;
                case "M008":
                    baigiai += "Áp dụng công thức: U = A/q\n";
                    U = A/q;
                    baigiai += ("=> Tìm được: U ="+U+" (V)\n");
                    break;
                case "M009":
                    baigiai += "Áp dụng công thức: R = U/I\n";
                    R = U/I;
                    baigiai += ("=> Tìm được: R ="+R+" (Ω)\n");
                    break;
                case "M010":
                    baigiai += "Áp dụng công thức: R = A/((I^2).t)\n";
                    R = A/((Math.pow(I, 2))*t);
                    baigiai += ("=> Tìm được: R ="+R+" (Ω)\n");
                    break;
                case "M011":
                    baigiai += "Áp dụng công thức: R = ((U^2).t)/A\n";
                    R = ((Math.pow(U, 2))*t)/A;
                    baigiai += ("=> Tìm được: R ="+R+" (Ω)\n");
                    break;
                case "M012":
                    baigiai += "Áp dụng công thức: R = ((U^2).t)/Q\n";
                    R = ((Math.pow(U, 2))*t)/Q;
                    baigiai += ("=> Tìm được: R ="+R+" (Ω)\n");
                    break;
                case "M013":
                    baigiai += "Áp dụng công thức: R = P/(I^2)\n";
                    R = P/(Math.pow(I, 2));
                    baigiai += ("=> Tìm được: R ="+R+" (Ω)\n");
                    break;
                case "M014":
                    baigiai += "Áp dụng công thức: A = U.q\n";
                    A = U*q;
                    baigiai += ("=> Tìm được: A ="+A+" (J)\n");
                    break;
                case "M015":
                    baigiai += "Áp dụng công thức: A = U.I.t\n";
                    A = U*I*t;
                    baigiai += ("=> Tìm được: A ="+A+" (J)\n");
                    break;
                case "M016":
                    baigiai += "Áp dụng công thức: A = P.t\n";
                    A = P*t;
                    baigiai += ("=> Tìm được: A ="+A+" (J)\n");
                    break;
                case "M017":
                    baigiai += "Áp dụng công thức: A = ((U^2).t)/R\n";
                    A = ((Math.pow(U, 2))*t)/R;
                    baigiai += ("=> Tìm được: A ="+A+" (J)\n");
                    break;
                case "M018":
                    baigiai += "Áp dụng công thức: P = A/t\n";
                    P = A/t;
                    baigiai += ("=> Tìm được: P ="+P+" (W)\n");
                    break;
                case "M019":
                    baigiai += "Áp dụng công thức: P = U.I\n";
                    P = U*I;
                    baigiai += ("=> Tìm được: P ="+P+" (W)\n");
                    break;
                case "M020":
                    baigiai += "Áp dụng công thức: P = Q/t\n";
                    P = Q/t;
                    baigiai += ("=> Tìm được: P ="+P+" (W)\n");
                    break;
                case "M021":
                    baigiai += "Áp dụng công thức: P = R.(I^2)\n";
                    P = R*(Math.pow(I, 2));
                    baigiai += ("=> Tìm được: P ="+P+" (W)\n");
                    break;  
                case "M022":
                    baigiai += "Áp dụng công thức: Q = R.I.t\n";
                    Q = R*I*t;
                    baigiai += ("=> Tìm được: Q ="+Q+" (J)\n");
                    break;
                case "M023":
                    baigiai += "Áp dụng công thức: Q = ((U^2).t)/R\n";
                    Q = ((Math.pow(U, 2))*t)/R;
                    baigiai += ("=> Tìm được: Q ="+Q+" (J)\n");
                    break;
                case "M024":
                    baigiai += "Áp dụng công thức: Q = P.t\n";
                    Q = P*t;
                    baigiai += ("=> Tìm được: Q ="+Q+" (J)\n");
                    break;
                case "M025":
                    baigiai += "Áp dụng công thức: q = I.t\n";
                    q = I*t;
                    baigiai += ("=> Tìm được: q ="+q+" (C)\n");
                    break;
            }
        }
        return baigiai;
    }
    
//    public static void main(String args[]) throws SQLException
//   {
//        Vector _giathiet = new Vector();
//        Vector _ketluan = new Vector();
//        Vector _giatri = new Vector();
//        Vector _loigiai = new Vector();
//        _giathiet.add("U");
//        _giathiet.add("I");
//        _giathiet.add("t");
//        _giatri.add(10);
//        _giatri.add(1);
//        _giatri.add(100);
//        _loigiai.add("M009");
//        _loigiai.add("M019");
//        _loigiai.add("M024");
//        _loigiai.add("M016");
//        _loigiai.add("M025");
//        TinhToan_MotDienTro.Gan_GiaTri(_giathiet, _giatri);
//        System.out.println(TinhToan_MotDienTro.In_CongThuc(_loigiai));
//   }
    
}

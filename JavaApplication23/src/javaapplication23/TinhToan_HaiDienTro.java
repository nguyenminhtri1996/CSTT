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
public class TinhToan_HaiDienTro {
    private static double I = 0;
    private static double U = 0;
    private static double R = 0;
    private static double P = 0;
    private static double A = 0;
    private static double Q = 0;
    private static double q = 0;
    private static double t = 0;
    private static double I1 = 0;
    private static double U1 = 0;
    private static double I2 = 0;
    private static double U2 = 0;
    private static double R1 = 0;
    private static double R2 = 0;
    
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
                case "R1":
                    R1 = (int)giatri.get(i);
                    break;
                case "I1":
                    I1 = (int)giatri.get(i);
                    break;
                case "U1":
                    U1 = (int)giatri.get(i);
                    break;
                case "R2":
                    R2 = (int)giatri.get(i);
                    break;
                case "I2":
                    I2 = (int)giatri.get(i);
                    break;
                case "U2":
                    U2 = (int)giatri.get(i);
                    break;
            }
        }
    }
  
    public String In_CongThuc(Vector giathiet, Vector giatri, String tc)
    {
        String baigiai = "";
        for(int i = 0; i < giathiet.size(); i++)
        {
            switch((String)giathiet.get(i))
            {
                case "H001":
                    if(tc.equals("noitiep"))
                    {
                        baigiai += "Áp dụng công thức: I = I1 = I2\n";
                        if(I1 != 0)
                            I = I1;
                        else
                            I = I2;
                        baigiai += "=> Tìm được: "+I+"\n";
                        break;
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: I = I1 + I2\n";
                        I = I1 + I2;
                        baigiai += "=> Tìm được: "+I+"\n";
                        break;
                    }
                case "H002":
                    baigiai += "Áp dụng công thức: I = U/R";
                    I = U/R;
                    baigiai += "=> Tìm được: "+I+"\n";
                    break;
                case "H003":
                    baigiai += "Áp dụng công thức: I = A/(U.t)\n";
                    I = A/(U*t);
                    System.out.println("=> Tìm được: "+I+"\n");
                    break;
                case "H004":
                    baigiai += "Áp dụng công thức: I = P/U\n";
                    I = P/U;
                    System.out.println("=> Tìm được: "+I+"\n");
                    break;
                case "H005":
                    baigiai += "Áp dụng công thức: I = q/t\n";
                    I = q/t;
                    baigiai += "=> Tìm được: "+I+"\n";
                    break;
                case "H006":
                    baigiai += "Áp dụng công thức: I1 = U1/R1\n";
                    I = U1/R1;
                    baigiai += "=> Tìm được: "+I1+"\n";
                    break;
                case "H007":
                    if(tc.equals("noitiep"))
                    {
                        baigiai += "Áp dụng công thức: I1 = I2 = I\n";
                        if(I != 0)
                            I1 = I;
                        else
                            I1 = I2;
                        baigiai += "=> Tìm được: "+I1+"\n";
                        break;
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: I1 = I - I2\n";
                        I1 = I - I2;
                        baigiai += "=> Tìm được: "+I1+"\n";
                        break;
                    }
                case "H008":
                    baigiai += "Áp dụng công thức: I2 = U2/R2\n";
                    I2 = U2/R2;
                    baigiai += "=> Tìm được: "+I2+"\n";
                    break;
                case "H009":
                    if(tc.equals("noitiep"))
                    {
                        baigiai += "Áp dụng công thức: I2 = I1 = I\n";
                        if(I != 0)
                            I2 = I;
                        else
                            I2 = I1;
                        baigiai += "=> Tìm được: "+I1+"\n";
                        break;
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: I2 = I - I1\n";
                        I2 = I - I1;
                        baigiai += "=> Tìm được: "+I2+"\n";
                        break;
                    }
                case "H010":
                    if(tc.equals("noitiep"))
                    {
                        baigiai += "Áp dụng công thức: U = U1+U2\n";
                        U = U1+U2;
                        baigiai += "=> Tìm được: "+U+"\n";
                        break;
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: U = U1 = U2\n";
                        if(U1 != 0)
                            U = U1;
                        else
                            U = U2;
                        baigiai += "=> Tìm được: "+U+"\n";
                        break;
                    }
                case "H011":
                    baigiai += "U = I.R\n";
                    U = I*R;
                    baigiai += "=> Tìm được: "+U+"\n";
                    break;
                case "H012":
                    baigiai += "U = P/I\n";
                    U = P/I;
                    baigiai += "=> Tìm được: "+U+"\n";
                    break;
                case "H013":
                    baigiai += "U = A/(I.t)\n";
                    U = A/(I*t);
                    baigiai += "=> Tìm được: "+U+"\n";
                    break;
                case "H014":
                    baigiai += "U = A/q";
                    U = A/q;
                    baigiai += "=> Tìm được: "+U+"\n";
                    break;
                case "H015":
                    baigiai += "U1 = I1*R1";
                    U1 = I1*R1;
                    baigiai += "=> Tìm được: "+U+"\n";
                    break;
                case "H016":
                    if(tc.equals("noitiep"))
                    {
                        baigiai += "Áp dụng công thức: U1 = U - U2\n";
                        U1 = U-U2;
                        baigiai += "=> Tìm được: "+U1+"\n";
                        break;
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: U1 = U = U2\n";
                        if(U != 0)
                            U1 = U;
                        else
                            U1 = U2;
                        baigiai += "=> Tìm được: "+U1+"\n";
                        break;
                    }
                case "H017":
                    baigiai += "U2 = I2*R2";
                    U2 = I2*R2;
                    baigiai += "=> Tìm được: "+U2+"\n";
                    break;
                case "H018":
                    if(tc.equals("noitiep"))
                    {
                        baigiai += "Áp dụng công thức: U2 = U - U1\n";
                        U2 = U-U1;
                        baigiai += "=> Tìm được: "+U2+"\n";
                        break;
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: U2 = U = U1\n";
                        if(U != 0)
                            U2 = U;
                        else
                            U2 = U1;
                        baigiai += "=> Tìm được: "+U2+"\n";
                        break;
                    }
                case "H019":
                    baigiai += "R = U*I";
                    R = U*I;
                    baigiai += "=> Tìm được: "+R+"\n";
                    break;
                case "H020":
                    baigiai += "Áp dụng công thức: R = A/((I^2).t)\n";
                    R = A/((Math.pow(I, 2))*t);
                    System.out.println("=> Tìm được: "+R+"\n");
                    break;
                case "H021":
                    baigiai += "Áp dụng công thức: R = ((U^2).t)/A\n";
                    R = ((Math.pow(U, 2))*t)/A;
                    System.out.println("=> Tìm được: "+R+"\n");
                    break;  
                case "H022":
                    baigiai += "Áp dụng công thức: R = ((U^2).t)/Q\n";
                    R = ((Math.pow(U, 2))*t)/Q;
                    System.out.println("=> Tìm được: "+R+"\n");
                    break;
                case "H023":
                    baigiai += "Áp dụng công thức: R = P/(I^2)\n";
                    R = P/(Math.pow(I, 2));
                    System.out.println("=> Tìm được: "+R+"\n");
                    break;
                case "H024":
                    if(tc.equals("noitiep"))
                    {
                        baigiai += "Áp dụng công thức: R = R1+R2\n";
                        R = R1+R2;
                        baigiai += "=> Tìm được: "+R+"\n";
                        break;
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: R = (R1.R2)/(R1+R2)\n";
                        R = (R1*R2)/(R1+R2);
                        baigiai += "=> Tìm được: "+R+"\n";
                        break;
                    }
                case "H025":
                    baigiai += "R1 = U1/I1\n";
                    R1 = U1/I1;
                    baigiai += "=> Tìm được: "+R1+"\n";
                    break;
                case "H026":
                    if(tc.equals("noitiep"))
                    {
                        baigiai += "Áp dụng công thức: R1 = R-R2\n";
                        R1 = R-R2;
                        baigiai += "=> Tìm được: "+R1+"\n";
                        break;
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: R1 = (R2.R)/(R2-R)\n";
                        R1 = (R2*R)/(R2-R);
                        baigiai += "=> Tìm được: "+R1+"\n";
                        break;
                    }
                case "H027":
                    baigiai += "R2 = U2/I2\n";
                    R2 = U2/I2;
                    baigiai += "=> Tìm được: "+R2+"\n";
                    break;
                case "H028":
                    if(tc.equals("noitiep"))
                    {
                        baigiai += "Áp dụng công thức: R2 = R-R1\n";
                        R2 = R-R1;
                        baigiai += "=> Tìm được: "+R1+"\n";
                        break;
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: R2 = (R1.R)/(R1-R)\n";
                        R2 = (R1*R)/(R1-R);
                        baigiai += "=> Tìm được: "+R2+"\n";
                        break;
                    }
                case "H029":
                    baigiai += "Áp dụng công thức: A = U.q\n";
                    A = U*q;
                    System.out.println("=> Tìm được: "+A+"\n");
                    break;
                case "H030":
                    baigiai += "Áp dụng công thức: A = U.I.t\n";
                    A = U*I*t;
                    System.out.println("=> Tìm được: "+A+"\n");
                    break;
                case "H031":
                    baigiai += "Áp dụng công thức: A = P.t\n";
                    A = P*t;
                    System.out.println("=> Tìm được: "+A+"\n");
                    break;
                case "H032":
                    baigiai += "Áp dụng công thức: A = ((U^2).t)/R\n";
                    A = ((Math.pow(U, 2))*t)/R;
                    System.out.println("=> Tìm được: "+A+"\n");
                    break;
                case "H033":
                    baigiai += "Áp dụng công thức: P = A/t\n";
                    P = A/t;
                    System.out.println("=> Tìm được: "+P+"\n");
                    break;
                case "H034":
                    baigiai += "Áp dụng công thức: P = U.I\n";
                    P = U*I;
                    System.out.println("=> Tìm được: "+P+"\n");
                    break;
                case "H035":
                    baigiai += "Áp dụng công thức: P = Q/t\n";
                    P = Q/t;
                    System.out.println("=> Tìm được: "+P+"\n");
                    break;
                case "H036":
                    baigiai += "Áp dụng công thức: P = R.(I^2)\n";
                    P = R*(Math.pow(I, 2));
                    System.out.println("=> Tìm được: "+P+"\n");
                    break; 
                case "H037":
                    baigiai += "Áp dụng công thức: Q = R.I.t\n";
                    Q = R*I*t;
                    System.out.println("=> Tìm được: "+Q+"\n");
                    break;
                case "H038":
                    baigiai += "Áp dụng công thức: Q = ((U^2).t)/R\n";
                    Q = ((Math.pow(U, 2))*t)/R;
                    System.out.println("=> Tìm được: "+Q+"\n");
                    break;
                case "H039":
                    baigiai += "Áp dụng công thức: Q = P.t\n";
                    Q = P*t;
                    System.out.println("=> Tìm được: "+Q+"\n");
                    break;
                case "H040":
                    baigiai += "Áp dụng công thức: q = I.t\n";
                    q = I*t;
                    System.out.println("=> Tìm được: "+q+"\n");
                    break;
            }
        } 
        return baigiai;
    }
}

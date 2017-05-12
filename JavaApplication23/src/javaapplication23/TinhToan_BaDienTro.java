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
public class TinhToan_BaDienTro {
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
    private static double I3 = 0;
    private static double U3 = 0;
    private static double R1 = 0;
    private static double R2 = 0;
    private static double R3 = 0;
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
                case "R3":
                    R3 = (int)giatri.get(i);
                    break;
                case "I3":
                    I3 = (int)giatri.get(i);
                    break;
                case "U3":
                    U3 = (int)giatri.get(i);
                    break;
            }
        }
    }
    public static String In_CongThuc(Vector loigiai, String tc)
    {
        String baigiai = "";
        for(int i = 0; i < loigiai.size(); i++)
        {
            switch((String)loigiai.get(i))
            {
                case "B001":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I=I1=I2=I3\n";
                        if(I1 != 0)
                            I = I1;
                        if(I2 != 0)
                            I = I2;
                        else
                            I = I3;
                        baigiai += "=> Tìm được: "+I+" (A)\n";
                        
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: I = I1+I2+I3\n";
                        I = I1+I2+I3;
                        baigiai += "=> Tìm được: "+I+" (A)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: I=I1=I2+I3\n";
                        if(I1 != 0)
                            I = I1;
                        else
                            I = I2+I3;
                        baigiai += "=> Tìm được: "+I+" (A)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        baigiai += "Áp dụng công thức: I=I2=I1+I3\n";
                        if(I2 != 0)
                            I = I2;
                        else
                            I = I1+I3;
                        baigiai += "=> Tìm được: "+I+" (A)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I=(I1=I2)+I3\n";
                        if(I1 != 0)
                            I = I1+I3;
                        else
                            I = I2+I3;
                        baigiai += "=> Tìm được: "+I+" (A)\n";
                    }
                    else if(tc.equals("motbanoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I=(I1=I3)+I2\n";
                        if(I1 != 0)
                            I = I1+I2;
                        else
                            I = I2+I3;
                        baigiai += "=> Tìm được: "+I+" (A)\n";
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: I=I3=I1+I2\n";
                        if(I3 != 0)
                            I = I3;
                        else
                            I = I1+I2;
                        baigiai += "=> Tìm được: "+I+" (A)\n";
                    }
                case "B002":
                    baigiai += "Áp dụng công thức: I = U/R\n";
                    I = U/R;
                    baigiai += "=> Tìm được: "+I+" (A)\n";
                    break;
                case "B003":
                    baigiai += "Áp dụng công thức: I = A/(U.t)\n";
                    I = A/(U*t);
                    System.out.println("=> Tìm được: "+I+" (A)\n");
                    break;
                case "B004":
                    baigiai += "Áp dụng công thức: I = P/U\n";
                    I = P/U;
                    System.out.println("=> Tìm được: "+I+" (A)\n");
                    break;
                case "B005":
                    baigiai += "Áp dụng công thức: I = q/t\n";
                    I = q/t;
                    baigiai += "=> Tìm được: "+I+" (A)\n";
                    break;
                case "B006":
                    baigiai += "Áp dụng công thức: I1 = U1/R1\n";
                    I = U1/R1;
                    baigiai += "=> Tìm được: "+I1+" (A)\n";
                    break;
                case "B007":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I1=I2=I3=I\n";
                        if(I2 != 0)
                            I1 = I2;
                        if(I3 != 0)
                            I1 = I3;
                        else
                            I1 = I;
                        baigiai += "=> Tìm được: "+I1+" (A)\n";
                        
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: I1=I-(I2+I3)\n";
                        I1=I-I2-I3;                     
                        baigiai += "=> Tìm được: "+I1+" (A)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: I1=I=I2+I3\n";
                        if(I != 0)
                            I1 = I;
                        else
                            I1 = I2+I3;
                        baigiai += "=> Tìm được: "+I1+" (A)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        baigiai += "Áp dụng công thức: I1=I-I3=I2-I3\n";
                        if(I!=0)
                            I1=I-I3;
                        else
                            I1=I2-I3;
                        baigiai += "=> Tìm được: "+I1+" (A)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I1=I2=I-I3\n";
                        if(I2!=0)
                            I1=I2;
                        else
                            I1 = I-I3;                       
                        baigiai += "=> Tìm được: "+I1+" (A)\n";
                    }
                    else if(tc.equals("motbanoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I1=I3=I-I2\n";
                        if(I3!=0)
                            I1=I3;
                        else
                            I1 = I-I2;
                        baigiai += "=> Tìm được: "+I1+" (A)\n";
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: I1=I-I2=I3-I2\n";
                        if(I!=0)
                            I1=I-I2;
                        else
                            I1=I3-I2;
                        baigiai += "=> Tìm được: "+I1+" (A)\n";
                    }
                case "B008":
                    baigiai += "Áp dụng công thức: I2 = U2/R2\n";
                    I2 = U2/R2;
                    baigiai += "=> Tìm được: "+I2+" (A)\n";
                    break;
                case "B009":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I2=I1=I3=I\n";
                        if(I1 != 0)
                            I2 = I1;
                        if(I3 != 0)
                            I2 = I3;
                        else
                            I2 = I;
                        baigiai += "=> Tìm được: "+I2+" (A)\n";
                        
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: I2=I-(I1+I3)\n";
                        I2=I-I1-I3;
                        baigiai += "=> Tìm được: "+I2+" (A)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: I2=I-I3=I1-I3\n";
                        if(I!=0)
                            I2=I-I3;
                        else
                            I2=I1-I3;
                        baigiai += "=> Tìm được: "+I2+" (A)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        baigiai += "Áp dụng công thức: I2=I1=I-I3\n";
                        I2=I-I3;
                        baigiai += "=> Tìm được: "+I2+" (A)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I2=I1=I-I3\n";
                        if(I1!=0)
                            I2=I1;
                        else
                            I2=I-I3;
                        baigiai += "=> Tìm được: "+I2+" (A)\n";
                    }
                    else if(tc.equals("motbanoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I2=I-(I1=I3)\n";
                        if(I1!=0)
                            I2=I-I1;
                        else
                            I2=I-I3;
                        baigiai += "=> Tìm được: "+I2+" (A)\n";
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: I2=I-I1=I3-I1\n";
                        if(I!=0)
                            I2 = I-I1;
                        else
                            I2 = I3+I1;
                        baigiai += "=> Tìm được: "+I2+" (A)\n";
                    }
                case "B010":
                    baigiai += "I3=U3/R3\n";
                    I3=U3/R3;
                    baigiai += "=> Tìm được: "+I3+" (A)\n";
                    break;
                case "B011":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I3=I1=I2=I\n";
                        if(I1 != 0)
                            I3 = I1;
                        if(I2 != 0)
                            I3 = I2;
                        else
                            I3 = I;
                        baigiai += "=> Tìm được: "+I3+" (A)\n";
                        
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: I3=I-(I1+I2)\n";
                        I3=I-I2-I1;
                        baigiai += "=> Tìm được: "+I3+" (A)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: I3=I-I2=I1-I2\n";
                        if(I!=0)
                            I3=I-I2;
                        else
                            I3=I1-I2;
                        baigiai += "=> Tìm được: "+I3+" (A)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        baigiai += "Áp dụng công thức: I3=I-I1=I2-I1\n";
                        if(I!=0)
                            I3=I-I1;
                        else
                            I3=I2-I1;
                        baigiai += "=> Tìm được: "+I3+" (A)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I3=I-(I1=I2)\n";
                        if(I1!=0)
                            I3=I-I1;
                        else
                            I3=I-I2;
                        baigiai += "=> Tìm được: "+I3+" (A)\n";
                    }
                    else if(tc.equals("motbanoitiep"))
                    {
                        baigiai += "Áp dụng công thức: I3=I1=I-I2\n";
                        if(I1!=0)
                            I3=I1;
                        else
                            I3=I-I2;
                        baigiai += "=> Tìm được: "+I3+" (A)\n";
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: I3=I=(I1+I2)\n";
                        if(I!=0)
                            I3 = I;
                        else
                            I3 = I1+I2;
                        baigiai += "=> Tìm được: "+I3+" (A)\n";
                    }
                case "B012":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: U=U1+U2+U3\n";
                        U=U1+U2+U3;
                        baigiai += "=> Tìm được: "+U+" (V)\n";
                        
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: U=U1=U2=U3\n";
                        if(U1!=0)
                            U = U1;
                        if(U2!=0)
                            U = U2;
                        else
                            U = U3;
                        baigiai += "=> Tìm được: "+U+" (V)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: U=U1+(U2=U3)\n";
                        if(U2!=0)
                            U=U1+I2;
                        else
                            U=U1+U3;
                        baigiai += "=> Tìm được: "+U+" (V)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        baigiai += "Áp dụng công thức: U=U2+(U1=U3)\n";
                        if(U1!=0)
                            U=U2+U1;
                        else
                            I3=U2+U3;
                        baigiai += "=> Tìm được: "+U+" (V)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: U=U3=U1+U2\n";
                        if(U3!=0)
                            U=U3;
                        else
                            U=U1+U2;
                        baigiai += "=> Tìm được: "+U+" (V)\n";
                    }
                    else if(tc.equals("motbanoitiep"))
                    {
                        baigiai += "Áp dụng công thức: U=U2=U1+U3\n";
                        if(U2!=0)
                            U=U2;
                        else
                            U=U1+U3;
                        baigiai += "=> Tìm được: "+U+" (V)\n";
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: U=U3+(U1=U2)\n";
                        if(U1!=0)
                            U=U3+U1;
                        else
                            U=U3+U2;
                        baigiai += "=> Tìm được: "+U+" (V)\n";
                    }
                    break;
                case "B013":
                    baigiai += "U=I.R\n";
                    U=I*R;
                    baigiai += "=> Tìm được: "+U+" (V)\n";
                    break;
                case "B014":
                    baigiai += "U = P/I\n";
                    U = P/I;
                    baigiai += "=> Tìm được: "+U+" (V)\n";
                    break;
                case "B015":
                    baigiai += "U = A/(I.t)\n";
                    U = A/(I*t);
                    baigiai += "=> Tìm được: "+U+" (V)\n";
                    break;
                case "B016":
                    baigiai += "U = A/q";
                    U = A/q;
                    baigiai += "=> Tìm được: "+U+" (V)\n";
                    break;
                case "B017":
                    baigiai += "U1 = I1*R1";
                    U1 = I1*R1;
                    baigiai += "=> Tìm được: "+U1+" (V)\n";
                    break;
                case "B018":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: U1=U-(U2+U3)\n";
                        U1=U-(U2+U3);
                        baigiai += "=> Tìm được: "+U1+" (V)\n";                       
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: U1=U2=U3=U\n";
                        if(U!=0)
                            U1 = U;
                        if(U2!=0)
                            U1 = U2;
                        else
                            U1 = U3;
                        baigiai += "=> Tìm được: "+U1+" (V)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: U1=U-(U2=U3)\n";
                        if(U2!=0)
                            U1=U-U2;
                        else
                            U1=U-U3;
                        baigiai += "=> Tìm được: "+U1+" (V)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        baigiai += "Áp dụng công thức: U1=U-U2\n";
                        U1=U-U2;
                        baigiai += "=> Tìm được: "+U1+" (V)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: U1=U-U2=U3-U2\n";
                        if(U3!=0)
                            U1=U3-U2;
                        else
                            U1=U-U2;
                        baigiai += "=> Tìm được: "+U1+" (V)\n";
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: U1=U-U3\n";
                        U1=U-U3;
                        baigiai += "=> Tìm được: "+U1+" (V)\n";
                    }
                    break;
                case "B019":
                    baigiai += "U2 = I2*R2";
                    U2 = I2*R2;
                    baigiai += "=> Tìm được: "+U2+" (V)\n";
                    break;   
                case "B020":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: U2=U-(U1+U3)\n";
                        U2=U-(U1+U3);
                        baigiai += "=> Tìm được: "+U2+" (V)\n";                       
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: U2=U1=U3=U\n";
                        if(U!=0)
                            U2 = U;
                        if(U1!=0)
                            U2 = U1;
                        else
                            U2 = U3;
                        baigiai += "=> Tìm được: "+U2+" (V)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: U2=U-U1\n";
                        U2=U-U1;
                        baigiai += "=> Tìm được: "+U2+" (V)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        baigiai += "Áp dụng công thức: U2=U-(U1=U3)\n";
                        if(U1!=0)
                            U2=U-U1;
                        else
                            U2=U-U3;
                        baigiai += "=> Tìm được: "+U2+" (V)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: U2=U-U1=U3-U1\n";
                        if(U3!=0)
                            U2=U3-U1;
                        else
                            U2=U-U1;
                        baigiai += "=> Tìm được: "+U2+" (V)\n";
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: U2=U-U3\n";
                        U2=U-U3;
                        baigiai += "=> Tìm được: "+U2+" (V)\n";
                    }
                    break;
                case "B021":
                    baigiai += "Áp dụng công thức: U3=I3*R3\n";
                    U3=I3*R3;
                    System.out.println("=> Tìm được: "+U3+" (V)\n");
                    break;  
                case "B022":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: U3=U-(U1+U2)\n";
                        U3=U-(U1+U2);
                        baigiai += "=> Tìm được: "+U3+" (V)\n";                       
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: U3=U1=U2=U\n";
                        if(U!=0)
                            U3 = U;
                        if(U2!=0)
                            U3 = U2;
                        else
                            U3 = U1;
                        baigiai += "=> Tìm được: "+U3+" (V)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: U3=U-U1\n";
                        U3=U-U1;
                        baigiai += "=> Tìm được: "+U3+" (V)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        baigiai += "Áp dụng công thức: U3=U-U2\n";
                        U3=U-U2;
                        baigiai += "=> Tìm được: "+U3+" (V)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: U3=U=U1+U2\n";
                        if(U!=0)
                            U3=U;
                        else
                            U3=U1+U2;
                        baigiai += "=> Tìm được: "+U3+" (V)\n";
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: U3=U-(U1=U2)\n";
                        if(U1!=0)
                            U3=U-U1;
                        else
                            U3=U-U2;
                        baigiai += "=> Tìm được: "+U3+" (V)\n";
                    }
                    break;
                case "B023":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: R=R1+R2+R3\n";
                        R=R1+R2+R3;
                        baigiai += "=> Tìm được: "+R+" (Ω)\n";                       
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: R = (R1*R2*R3)/(R1*R2+R2*R3+R1*R3)\n";
                        R = (R1*R2*R3)/(R1*R2+R2*R3+R1*R3);
                        baigiai += "=> Tìm được: "+R+" (Ω)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: R=R1+((R2*R3)/(R2+R3))\n";
                        R=R1+((R2*R3)/(R2+R3));
                        baigiai += "=> Tìm được: "+R+" (Ω)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        baigiai += "Áp dụng công thức: R=R2+((R1*R3)/(R1+R3))\n";
                        R=R2+((R1*R3)/(R1+R3));
                        baigiai += "=> Tìm được: "+R+" (Ω)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: R=R3.(R1+R2)/(R1+R2+R3)\n";
                        R=R3*(R1+R2)/(R1+R2+R3);
                        baigiai += "=> Tìm được: "+R+" (Ω)\n";
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: R=R3+((R1*R2)/(R1+R2))\n";
                        R=R3+((R1*R2)/(R1+R2));
                        baigiai += "=> Tìm được: "+R+" (Ω)\n";
                    }
                    break;
                case "B024":
                    baigiai += "Áp dụng công thức: R=U/I\n";
                    R=U/I;
                    baigiai += "=> Tìm được: "+R+" (Ω)\n";   
                case "B025":
                    baigiai += "Áp dụng công thức: R = A/((I^2).t)\n";
                    R = A/((Math.pow(I, 2))*t);
                    System.out.println("=> Tìm được: "+R+" (Ω)\n");
                    break;
                case "B026":
                    baigiai += "Áp dụng công thức: R = ((U^2).t)/A\n";
                    R = ((Math.pow(U, 2))*t)/A;
                    System.out.println("=> Tìm được: "+R+" (Ω)\n");
                    break;
                case "B027":
                    baigiai += "Áp dụng công thức: R = ((U^2).t)/Q\n";
                    R = ((Math.pow(U, 2))*t)/Q;
                    System.out.println("=> Tìm được: "+R+" (Ω)\n");
                    break;
                case "B028":
                    baigiai += "Áp dụng công thức: R = P/(I^2)\n";
                    R = P/(Math.pow(I, 2));
                    System.out.println("=> Tìm được: "+R+" (Ω)\n");
                    break;
                case "B029":
                    baigiai += "R1 = U1/I1\n";
                    R1 = U1/I1;
                    baigiai += "=> Tìm được: "+R1+" (Ω)\n";
                    break;
                case "B030":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: R1=R-(R2+R3)\n";
                        R1=R-R2-R3;
                        baigiai += "=> Tìm được: "+R1+" (Ω)\n";                       
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: R1=(R.R2.R3)/(R2.R3-R.R3-R.R2)\n";
                        R1 = (R*R2*R3)/(R2*R3-R*R3-R*R2);
                        baigiai += "=> Tìm được: "+R1+" (Ω)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: R1=R-(R2.R3)/(R2+R3)\n";
                        R1=R-(R2*R3)/(R2+R3);
                        baigiai += "=> Tìm được: "+R1+" (Ω)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        baigiai += "Áp dụng công thức: R1 = R3.(R-R2)/(R3-R+R2)\n";
                        R1=1/(1/(R-R2)-1/R3);
                        baigiai += "=> Tìm được: "+R1+" (Ω)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: R1=(R.R3/(R3-R))-R2\n";
                        R1=(R*R3/(R3-R))-R2;
                        baigiai += "=> Tìm được: "+R1+" (Ω)\n";
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: R1 = R2.(R-R3)/(R2-R+R3)\n";
                        R1=1/(1/(R-R3)-1/R2);
                        baigiai += "=> Tìm được: "+R1+" (Ω)\n";
                    }
                    break;
                case "B031":
                    baigiai += "R2 = U2/I2\n";
                    R2 = U2/I2;
                    baigiai += "=> Tìm được: "+R2+" (Ω)\n";
                    break;                    
                case "B032":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: R2=R-(R1+R3)\n";
                        R2=R-R1-R3;
                        baigiai += "=> Tìm được: "+R2+" (Ω)\n";                       
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: R2 = (R.R1.R3)/(R1.R3-R.R3-R.R1)\n";
                        R2 = (R*R1*R3)/(R1*R3-R*R3-R*R1);
                        baigiai += "=> Tìm được: "+R2+" (Ω)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: R2=R3.(R-R1)/(R3-R+R1)\n";
                        R2=1/(1/(R-R1)-1/R3);
                        baigiai += "=> Tìm được: "+R2+" (Ω)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        
                        baigiai += "Áp dụng công thức: R2=R-(R1.R3)/(R1+R3)\n";
                        R2=R-(R1*R3)/(R1+R3);
                        baigiai += "=> Tìm được: "+R2+" (Ω)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: R2=(R.R3/(R3-R))-R1\n";
                        R2=(R*R3/(R3-R))-R1;
                        baigiai += "=> Tìm được: "+R2+" (Ω)\n";
                    }
                    else
                    {
                        baigiai += "Áp dụng công thức: R2=R1.(R-R3)/(R1-R+R3)\n";
                        R2=1/(1/(R-R3)-1/R1);
                        baigiai += "=> Tìm được: "+R2+" (Ω)\n";
                    }
                    break;
                case "B033":
                    baigiai += "R3 = U3/I3\n";
                    R3 = U3/I3;
                    baigiai += "=> Tìm được: "+R3+" (Ω)\n";
                    break;
                case "B034":
                    if(tc.equals("banoitiep"))
                    {
                        baigiai += "Áp dụng công thức: R3=R-(R1+R2)\n";
                        R3=R-R1-R2;
                        baigiai += "=> Tìm được: "+R3+" (Ω)\n";                       
                    }
                    else if(tc.equals("basongsong"))
                    {
                        baigiai += "Áp dụng công thức: R3=(R.R1.R2)/(R1.R2-R.R2-R.R1)\n";
                        R3 = (R*R1*R2)/(R1*R2-R*R2-R*R1);
                        baigiai += "=> Tìm được: "+R3+" (Ω)\n";
                    }
                    else if(tc.equals("mot"))
                    {
                        baigiai += "Áp dụng công thức: R3=R2.(R-R1)/(R2-R+R1)\n";
                        R3=1/(1/(R-R1)-1/R2);
                        baigiai += "=> Tìm được: "+R3+" (Ω)\n";
                    }
                    else if(tc.equals("hai"))
                    {
                        
                        baigiai += "Áp dụng công thức: R3=R1.(R-R2)/(R1-R+R2)\n";
                        R3=1/(1/(R-R2)-1/R1);
                        baigiai += "=> Tìm được: "+R3+" (Ω)\n";
                    }
                    else if(tc.equals("mothainoitiep"))
                    {
                        baigiai += "Áp dụng công thức: R3=R.(R1+R2)/(R1+R2-R)\n";
                        R3=R*(R1+R2)/(R1+R2-R);
                        baigiai += "=> Tìm được: "+R3+" (Ω)\n";
                    }
                    else
                    {
                        
                        baigiai += "Áp dụng công thức: R3=R-(R1.R2)/(R1+R2)\n";
                        R3=R-(R1*R2)/(R1+R2);
                        baigiai += "=> Tìm được: "+R3+" (Ω)\n";
                    }
                    break;
                case "B035":
                    baigiai += "Áp dụng công thức: A = U.q\n";
                    A = U*q;
                    System.out.println("=> Tìm được: "+A+" (J)\n");
                    break;
                case "B036":
                    baigiai += "Áp dụng công thức: A = U.I.t\n";
                    A = U*I*t;
                    System.out.println("=> Tìm được: "+A+" (J)\n");
                    break;
                case "B037":
                    baigiai += "Áp dụng công thức: A = P.t\n";
                    A = P*t;
                    System.out.println("=> Tìm được: "+A+" (J)\n");
                    break;
                case "B038":
                    baigiai += "Áp dụng công thức: A = ((U^2).t)/R\n";
                    A = ((Math.pow(U, 2))*t)/R;
                    System.out.println("=> Tìm được: "+A+" (J)\n");
                    break;
                case "B039":
                    baigiai += "Áp dụng công thức: P = A/t\n";
                    P = A/t;
                    System.out.println("=> Tìm được: "+P+" (W)\n");
                    break;
                case "B040":
                    baigiai += "Áp dụng công thức: P = U.I\n";
                    P = U*I;
                    System.out.println("=> Tìm được: "+P+" (W)\n");
                    break;
                case "B041":
                    baigiai += "Áp dụng công thức: P = Q/t\n";
                    P = Q/t;
                    System.out.println("=> Tìm được: "+P+" (W)\n");
                    break;
                case "B042":
                    baigiai += "Áp dụng công thức: P = R.(I^2)\n";
                    P = R*(Math.pow(I, 2));
                    System.out.println("=> Tìm được: "+P+" (W)\n");
                    break;
                case "B043":
                    baigiai += "Áp dụng công thức: Q = R.I.t\n";
                    Q = R*I*t;
                    System.out.println("=> Tìm được: "+Q+" (J)\n");
                    break;
                case "B044":
                    baigiai += "Áp dụng công thức: Q = ((U^2).t)/R\n";
                    Q = ((Math.pow(U, 2))*t)/R;
                    System.out.println("=> Tìm được: "+Q+" (J)\n");
                    break;
                case "B045":
                    baigiai += "Áp dụng công thức: Q = P.t\n";
                    Q = P*t;
                    System.out.println("=> Tìm được: "+Q+" (J)\n");
                    break;
                case "B046":
                    baigiai += "Áp dụng công thức: q = I.t\n";
                    q = I*t;
                    System.out.println("=> Tìm được: "+q+" (C)\n");
                    break;
            }
        }
        return baigiai;
    }
    
    public static void main(String args[])
    {
        
    }
}

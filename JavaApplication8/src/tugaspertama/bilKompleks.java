/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertama;

import java.util.Scanner;

/**
 *
 * @author User All
 */
public class bilKompleks {
    static int riil, imajiner;
    
    public static void mencariNum(String Z, int riil1, int riil2, int img1, int img2){
        if (riil1==0 && riil2==0){
            riil = mengubahNum("0");
        }
        else {
            String real  = Z.substring(riil1,riil2);
            riil = mengubahNum(real);
        }
        String imaginer = Z.substring(img1,img2);
        imajiner = mengubahNum(imaginer);
    }
    public static int mengubahNum(String huruf){
        int num = Integer.parseInt(huruf);
        return num;
    }
    
    public static void print(int i1, int i2, int r1, int r2){
        int hasilRiil = (r1*r2) - (i1*i2);
        int hasilImajiner = (r1*i2) + (i1*r2);
        System.out.println(hasilRiil + " + " + hasilImajiner + "i" );
    }
    public static void main(String[] args) {
        System.out.println("Input : ");
        Scanner input = new Scanner(System.in);
        String X = input.nextLine();
        String Y = input.nextLine();
        
        char[] arrayX = X.toCharArray();
        int jmlX = arrayX.length;
        char[] arrayY = Y.toCharArray();
        int jmlY = arrayY.length;
        System.out.println("");
        
        if(jmlX == 4 && jmlY == 4){
            mencariNum (X,0,1,1,3);
            int r1 = riil;
            int i1 = imajiner;
            mencariNum (Y,0,1,1,3);
            int r2 = riil;
            int i2 = imajiner;
            print(i1,i2,r1,r2);
        }
        else if (jmlX == 2 && jmlY ==4){
            mencariNum(X,0,0,0,1);
            int r1=0;
            int i1=imajiner;
            mencariNum(Y,0,1,1,3);
            int r2=riil;
            int i2=imajiner;
            print(i1,i2,r1,r2);
        }
    }
}

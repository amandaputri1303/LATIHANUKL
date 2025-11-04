/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.faktorial2b;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class Faktorial2b {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      double phi = 3.14;
      
      System.out.println("Masukkan jari jari : ");
      double jarijari = input.nextDouble();
      System.out.println("Masukkan tinggi : ");
      double tinggi = input.nextDouble();
      
      double luas = 0;
      luas = 2*phi * jarijari*(jarijari * tinggi);
      System.out.println("Hasilnya adalah :"+ luas);
    }
}

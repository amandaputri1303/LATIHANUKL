/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan3a;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class Latihan3a {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double n1;
        double n2;
        double n3;
        
        System.out.println("Masukkan nilai1 : ");
        n1 = input.nextDouble();
        
        System.out.println("Masukkan nilai2 : ");
        n2 = input.nextDouble();
        
        System.out.println("Masukkan nilai3 : ");
        n3 = input.nextDouble();
        
        double jumlah = n1+n2+n3;
        double bagi = jumlah/3;
        
        System.out.println("Hasilnya adalah :"+ bagi);
                
    }
}

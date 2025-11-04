/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.belajarukl1b;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class BelajarUKL1B {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int bilangan;        
        System.out.print("Masukkan bilangan :");
        bilangan = input.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan Genap");
            System.out.println("Bilangan ini bisa dibagi 2");            
    }else{
       System.out.println("Bilangan Ganjil");
       System.out.println("Bilangan ini tidak bisa dibagi 2");
       System.out.println("Karena hasil bagi sisa 1");

        }
    }
}
             
    


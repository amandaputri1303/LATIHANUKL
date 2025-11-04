/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.belajarukl2a;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class BelajarUKL2a {

    public static void main(String[] args) {
    Scanner inputan = new Scanner(System.in);
    int nilai = 0;
    System.out.println("Masukkan nilai :");
    nilai = inputan.nextInt();
    int hasil = 1;
    int faktorial = 10;
    while (faktorial >=1 ){
          hasil *= faktorial;  
          System.out.println("faktor ke -"+ faktorial);
          faktorial--;
          
    }
    System.out.println("faktorial dari."+ nilai + "adalah." + hasil);
    }   
    }


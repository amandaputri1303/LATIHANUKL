/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarukl;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class BelajarUkl {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan panjang :");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan lebar :");
        int lebar = input.nextInt();
        
        System.out.print("Masukkan tinggi :");
        int tinggi = input.nextInt();
             
        int volume = 0;
        volume = panjang * lebar * tinggi;
        
        System.out.println("hasil"+ volume);
                
        System.out.print("Masukkan jarak :");
        int jarak = input.nextInt();
        
        System.out.print("Masukkan berat :");
        int berat = input.nextInt();
                
         int hargaPerKg = 0;
         
        if (jarak <=10) {
            hargaPerKg = jarak*4250;
         
        }else{
           hargaPerKg = jarak*6000;
        }
        int harga = berat*hargaPerKg;
        System.out.println("Hasilnya"+harga);
    }
    
}

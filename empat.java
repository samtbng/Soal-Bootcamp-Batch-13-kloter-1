/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dumbways;
import java.util.Scanner;
/**
 *
 * @author Samuel-
 */
public class empat {
    public static void main(String[] args) {
        int parkir = 0,
            biayaparkir = 0;
        Scanner keyboard = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("fungsi ini digunakan untuk menentukan biaya parkir");
        System.out.println("biaya parkir 3 jam pertama 2000/jam dan per jam berikutnya 1000/jam maksimal 10000");
        System.out.print("Masukkan lama parkir : ");
        parkir = keyboard.nextInt();
        if(parkir < 0){
            System.out.println("Nilai yang dimasukkan salah, silakan diulang");
            System.exit(0);
        }
        if(parkir == 0){
            biayaparkir = 2000;
        }else if(parkir < 4){
            biayaparkir = parkir * 2000;
        } else {
            parkir = parkir-3;
            biayaparkir = 6000+(parkir*1000);
        }
        if(biayaparkir >10000){
            biayaparkir = 10000;
        }
        System.out.println("Biaya parkir yang harus dibayar adalah = "+biayaparkir);
    }
}

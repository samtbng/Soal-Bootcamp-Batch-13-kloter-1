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
public class lima {
    public static void main(String[] args) {
        String nama, NIM, Grade;
        int absen = 0,
            tugas = 0,
            UTS = 0,
            UAS = 0,
            total = 0;
        Scanner keyboard = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Di Universitas Dumbways seorang dosen ingin menginput nilai ujian mahasiswa,"
                + "agar lebih efektif dab efisien, harus dibuat program sederhana untuk menghitung nilai mahasiswa");
        System.out.println("SELAMAT DATANG DI UNIVERSITAS DUMBWAYS");
        //fungsi input nilai
        System.out.print("Masukkan nama mahasiswa/i : ");
        nama = keyboard.nextLine();
        System.out.print("Masukkan NIM : ");
        NIM = keyboard.nextLine();
        System.out.print("Masukkan kehadiran : ");
        absen = keyboard.nextInt();
        System.out.print("Masukkan nilai tugas: ");
        tugas = keyboard.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        UTS = keyboard.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        UAS = keyboard.nextInt();
        if(absen > 15 || tugas > 100 || UTS > 100 || UAS > 100){
            System.out.println("Nilai yang dimasukkan salah, silakan diulang");
            System.exit(0);
        }
        //proses penilaian
        if(absen == 0 || tugas == 0 || UTS == 0 || UAS == 0){
            total = 0;
        }else{
            int nilaiabsen = (absen/14)*100;
            absen = (nilaiabsen*10)/100;
            tugas = (tugas*20)/100;
            UTS = (UTS*30)/100;
            UAS = (UAS*40)/100;
            total = absen+tugas+UTS+UAS;
        }
        if(total < 50){
            Grade = "E";
        }else if(total <= 60){
            Grade = "D";
        }else if(total <= 70){
            Grade = "C";
        }else if(total < 80){
            Grade = "B";
        }else{
            Grade = "A";
        }
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+NIM);
        System.out.println("Nilai : "+Grade);
    }
}
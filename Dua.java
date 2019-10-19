/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dumbways2;

    import java.util.Scanner;

    /**
     *
     * @author Samuel-
     */
    public class Dua {    
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            //fungsi dapat dicompile di onlinegdb.com
            int saldo = 0,
                totalbelanja = 0,
                kembalian = 0;
            int limapuluh = 0,
                duapuluh = 0,
                sepuluh = 0,
                lima = 0;
            Scanner keyboard = new Scanner(System.in); 
            // TODO code application logic here
            System.out.println("Sebuah vending machine DumbWays mempunyai stock kembalian 5.000, 10.000, 20.000, 50.000");
            System.out.print("Masukkan jumlah uang yang dimasukkan ke vending machine : ");
            //memasukkan nilai awal
            try {
                saldo = keyboard.nextInt();
                System.out.println("saldo : "+saldo);
            } catch (Exception e) {
                System.out.println(e);
            }
            //memasukkan nilai total belanja
            System.out.print("Masukkan total belanja : ");
            try {
                totalbelanja = keyboard.nextInt();
                System.out.println("Total : "+ totalbelanja);
            } catch (Exception e) {
                System.out.println(e);
            }

            kembalian = saldo-totalbelanja;
            System.out.println("Kembalian : "+kembalian);
            for(;kembalian >5000;){
                if(kembalian > 50000){
                    limapuluh++;
                    kembalian = kembalian - 50000;
                }else if(kembalian > 20000){
                    duapuluh++;
                    kembalian = kembalian - 20000;
                }else if(kembalian > 10000){
                    sepuluh++;
                    kembalian = kembalian - 10000;
                }else if(kembalian > 5000){
                    lima++;
                    kembalian = kembalian - 5000;
                }
            }
            System.out.println("Maka uang kembalian yang keluar adalah :");
            System.out.println(limapuluh+"x 50000");
            System.out.println(duapuluh+"x 20000");
            System.out.println(sepuluh+"x 10000");
            System.out.println(lima+"x 5000");
            System.out.println(kembalian+" Disumbangkan");
        }   
    }

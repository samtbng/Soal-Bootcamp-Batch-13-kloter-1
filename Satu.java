/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dumbways;

/**
 *
 * @author Samuel-
 */
public class Satu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //fungsi dapat dicompile menggunakan complivejava.net
        System.out.println("Mencocokkan setiap value yang terdapat pada array dengan sebuah string, hasil akan True"
                + "jika semua karakter pada setiap value pada string yang dicocokkan.");
        System.out.println("Array =(dumb, ways, the, best)");
        System.out.println("String = dumbways");
        String arr[] = {"dumb","ways","the","best"};
        String word = "dumbways";
        for(int i=0; i<4; i++){
            if(word.matches("(.*)"+arr[i].toString()+"(.*)")){
                System.out.println(arr[i]+" = true");
            }else{
                System.out.println(arr[i]+" = false");
            }
        }
    }
}

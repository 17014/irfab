/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursif;

import java.util.Scanner;

/**
 *
 * @author IRFAN
 */
public class Rekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i;
        int nilai;
        System.out.print("Masukan nila awal  : ");
        i = input.nextInt();
        System.out.print("Masukan nilai akhir : ");
        nilai = input.nextInt();
        bilangan (nilai, i);
    }
        
    public static void bilangan(int a, int i) {
        
            if(a>=i){
                if(i%2==0){
                    System.out.println(i+" Genap");
                    i++;
                    bilangan(a, i);
                }
                else{
                    System.out.println(i+" Ganjil");
                    i++;
                    bilangan(a, i);
                }
                
            }
        
        System.out.println("");
    }

    private static void bilangan(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
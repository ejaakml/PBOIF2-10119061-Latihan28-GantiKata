/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboif2.pkg10119061.latihan28.gantikata;

/**
 *
 * @author Rheiza
 * NAMA  : Rheiza Akaml R
 * KELAS : IF2   
 * NIM   : 1011906
 */
import java.util.Scanner;
public class PBOIF210119061Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in=new Scanner(System.in);
     String text,cari,ganti;
     System.out.print("Masukan Kalimat: ");
     text=in.nextLine();
     System.out.print("Kalimat yang diganti: ");
     cari=in.nextLine();
     System.out.print("Diganti dengan: ");
     ganti=in.nextLine();
     System.out.println("========HASIL NYA ADA LAHHH========");
     System.out.println("SEBELUM : "+text);
     System.out.println("SESUDAH : "+text.replace(cari, ganti));
    }
    
}

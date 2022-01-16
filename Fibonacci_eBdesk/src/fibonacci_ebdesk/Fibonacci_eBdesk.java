/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci_ebdesk;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Fibonacci_eBdesk {

    public static void main(String[] args) {
        
        int n0=0;
        int n1=1;
        int counter=6;
        
        System.out.println("Silahkan masukkan n (berapa kali pengurangannya)");
        System.out.print(n0+" "+n1);
        
        for (int i = 1; i <= counter-2; i++) {
            int fibn = n0 + (n1*n1);
            System.out.print(" "+fibn);
            n0=n1;
            n1=fibn;
        }             
    }

}

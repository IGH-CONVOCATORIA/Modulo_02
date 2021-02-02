/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secuenciales;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int num;
        String cond;
        
        System.out.println("Ingrese el número a comprobar:");
        num=reader.nextInt();
        
        cond="IMPAR";
        
        if(num%2==0){
            cond="PAR";
        }
        System.out.println("El número es:" + cond);    
    }
}

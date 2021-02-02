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
public class Problema05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //1.
        int num1,num2,num3,num4,mayor;
        
        //2.
        System.out.println("Ingrese el primer número:");
        num1=reader.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2=reader.nextInt();
        System.out.println("Ingrese el tercer número:");
        num3=reader.nextInt();
        System.out.println("Ingrese el cuarto número:");
        num4=reader.nextInt();
        
        //3.
        mayor=num1;
        if(num2>mayor){
            mayor=num2;
        }
        if(num3>mayor){
            mayor=num3;
        }
        if(num4>mayor){
            mayor=num4;
        }
        
        //4.
        System.out.println("El mayor número es:" + mayor);
        
       
    }
}

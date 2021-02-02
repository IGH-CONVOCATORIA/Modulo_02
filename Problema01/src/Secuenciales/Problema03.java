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
public class Problema03 {
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         //1:
         double n1,n2,result=0;
         int op;
         
         //2:
        System.out.println("Ingrese el primer número:");
        n1=reader.nextDouble();
        System.out.println("Ingrese el segundo número:");
        n2=reader.nextDouble();
        System.out.println("(1)SUMA:");
        System.out.println("(2)RESTA:");
        System.out.println("(3)MULTIPLICACIÓN:");
        System.out.println("(4)DIVISIÓN:");
        System.out.println("Ingrese la operación a realizar:");
        op=reader.nextInt();
       
        //3:
        switch(op){
            case 1:result=n1+n2;
            break;
            case 2:result=n1-n2;
            break;
            case 3:result=n1*n2;
            break;
            case 4:result=n1/n2;
            break;
            default:
            break;
        }
        
        
        //4:
        System.out.println("El resultado es:"+result);
        
        
         
         
        
        
    }
}

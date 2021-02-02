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
public class Problema09 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        
        int horasT,horasE;
        double aum,sueldoN = 0,precioH,aumF,sueldoB,desc;
        
        System.out.println("Ingresar el número de horas trabajadas:");
        horasT=reader.nextInt();
        System.out.println("Ingresar el precio por hora del trabajador:");
        precioH=reader.nextInt();
        if(horasT>0&&horasT<40){
            sueldoB=precioH*horasT;
            sueldoN=sueldoB;
            System.out.println("El sueldo Neto del trabajador es: " + sueldoN);
        }
        if(horasT>=40){ 
          horasE=horasT-40;  
          sueldoB=precioH*horasT;
          aum=precioH*0.5;
          aumF=horasE*aum;
          sueldoN=sueldoB+aumF;
          System.out.println("El sueldo Neto del trabajador es: " + sueldoN);
          
            if(sueldoN>2000){
             desc=sueldoN*0.08; 
             sueldoB=precioH*horasT;
             sueldoN=sueldoB-desc;
            System.out.println("El sueldo Neto del trabajador con impuesto a la renta es: " + sueldoN);
            } 
            
       } 
       
       
    }
}

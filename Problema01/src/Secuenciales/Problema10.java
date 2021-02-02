/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secuenciales;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema10 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        
        int dia,mes;
        String signo = null;
        System.out.println("Ingresa tu día de nacimiento:");
        dia=reader.nextInt();
        System.out.println("Ingresa tu Mes de nacimiento:");
        mes=reader.nextInt();
    
   
    if((dia>=22 && mes == 12)||(dia<=19 && mes == 1 )){
        signo =  "Capricornio"; 
    }   
     if((dia>=20 && mes == 1)||(dia<=18 && mes == 2 )){
        signo =  "Acuario"; 
    }   
     if((dia>=19 && mes == 2)||(dia<=20 && mes == 3 )){
        signo =  "Piscis"; 
    }   
    if((dia>=21 && mes == 3)||(dia<=19 && mes == 4 )){
        signo =  "Aries"; 
    } 
    if((dia>=20 && mes == 4)||(dia<=20 && mes == 5 )){
        signo =  "Tauro"; 
    }
    if((dia>=21 && mes == 5)||(dia<=20 && mes == 6 )){
        signo =  "Geminis"; 
    }
    if((dia>=21 && mes == 6)||(dia<=22 && mes == 7 )){
        signo =  "Cancer"; 
    }
    if((dia>=23 && mes == 7)||(dia<=22 && mes == 8 )){
        signo =  "Leo"; 
    }
    if((dia>=23 && mes == 8)||(dia<=22 && mes == 9 )){
        signo =  "Virgo"; 
    }
    if((dia>=23 && mes == 9)||(dia<=22 && mes == 10 )){
        signo =  "Libra"; 
    }
    if((dia>=23 && mes == 10)||(dia<=21 && mes == 11 )){
        signo =  "Escorpio"; 
    }
    if((dia>=22 && mes == 11)||(dia<=21 && mes == 12 )){
        signo =  "Sagitario"; 
    }   

   
        System.out.println("Tu signo del zodiaco es:"+signo);

    
    }
}

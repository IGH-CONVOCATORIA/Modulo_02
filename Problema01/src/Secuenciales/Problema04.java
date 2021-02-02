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
public class Problema04 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        
        int nota;
        String carrera="";
        
        System.out.println("Ingrese el puntaje del alumno: ");
        nota=reader.nextInt();
        
        if(nota<=50 && nota>=0){
            carrera="MECANICA";
        }
        if(nota<=60 && nota>50){
            carrera="INDUSTRIAL";
        }
        if(nota<=70 && nota>60){
            carrera="ELECTRÓNICA";
        }
        if(nota<=80 && nota>70){
            carrera="SISTEMAS";
        }
        
        
        System.out.println("A la carrera que se ingresó fue :" + carrera);
        
        
        
          
    }
}

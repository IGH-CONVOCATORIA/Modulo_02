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
public class Problema06 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
       
        int tam;   
        int i,j;
        double aux,prom;
        String estado;
        System.out.println("Ingrese el tamaño del arreglo:");
        tam=reader.nextInt();
        
        Double array[]=new Double [tam];    
       
        for(i=0;i<tam;i++){
            System.out.println((i+1)+". Digite una nota:");
            array[i]=reader.nextDouble();
        }
        
        for (j=0;j<4;j++){
            for(i=0;i<3;i++){ 
                if(array[i]>array[i+1]){
                    aux=array[i];
                    array[i]=array[i+1];
                    array[i+1]=aux;
                }
            }
        }
        
      prom=(array[tam-1]+array[tam-2]+array[tam-3])/3;
      
      estado="APROBADO";
      if(prom<14&&prom>=0 && prom<20){
         estado="DESAPROBADO"; 
      }
        
        for(i=0;i<tam;i++){
            System.out.println((i+1)+ ". Escribir el número"+array[i]);
        }
        System.out.println("El promedio de las 3 primeras notas más altas es:" + prom);
        System.out.println("El estado del alumno es: " + estado);
        
        
    }
}

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
public class Problema08 {
    public static void main(String[] args) {
        
        Scanner reader= new Scanner(System.in);
        
        
        double importeV,desc = 0,precio,descF,total;
        int op = 0,peso,costo = 0,km;
        System.out.println("Peso del producto: ");
        peso=reader.nextInt();
        System.out.println("Número de kilometros: ");
        km=reader.nextInt();
        if (peso>1 && peso<=5){
            op=1;
        }else if(peso>5 && peso<=10){
            op=2;
        }else if(peso>10 && peso<=999){
            op=3;
        }
        
        switch(op){
            case 1:
                costo=8;
                break;
            case 2:
                costo=6;
                break;
            case 3:
                costo=4;
                break;
        }
        
        
        importeV=costo*km;
        
        System.out.println("El importe de venta final es: "+importeV);
        
        
    }
}

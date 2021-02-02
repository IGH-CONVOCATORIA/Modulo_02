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
public class Problema07 {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
       
        double importeV,desc = 0,precio,descF,total;
        int cant,op = 0;
        System.out.println("Cantidad de productos: ");
        cant=reader.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        precio=reader.nextDouble();
        
        if (cant>1 && cant<=12){
            op=1;
        }else if(cant>12 && cant<=24){
            op=2;
        }else if(cant>24 && cant<=36){
            op=3;
        }else if(cant>36 && cant<=999){
            op=4;
        }
        
        switch(op){
            case 1:
                desc=1;
                break;
            case 2:
                desc=0.05;
                break;
            case 3:
                desc=0.1;
                break;
            case 4:
                desc=0.15;
                break;
        }
        total=precio*cant;
        descF=total*desc;
        importeV=total-descF;
        
        System.out.println("El importe de venta final es: "+importeV);
        System.out.println("El descuento fue de: "+desc);
        
    }
}

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
public class Problema02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        double ganancia,pCosto,dif,pVenta;
        String cond;
        
        System.out.println("Ingrese el precio de Costo:");
        pCosto=reader.nextDouble();
        System.out.println("Ingrese el precio de la venta:");
        pVenta=reader.nextDouble();
        
        cond="BARATO";
        
        ganancia=pVenta-pCosto;
        dif=pCosto*0.5;
        if(ganancia>dif){
            cond="CARO";
        }
        
        
        System.out.println("El producto es:" + cond);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerjavaempresa;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Ejerjavaempresa {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int aux;
        String salir="salir";
        System.out.println("Hello World!");
        String teatro [][] = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                teatro[i][j]= "L";
              
            }
        }
       System.out.println("TEATRO CONSTANTINO");
        while (!salir.equalsIgnoreCase("s")){
            System.out.println("Presione 1 para ver los disponibles ");
            System.out.println("Presione 2 para reservar un asiento");
            System.out.println("para salir apriete 3");
            aux= input.nextInt();
            if (aux==1){
            for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(teatro[i][j]);
            }
                System.out.println("");
            }
        } 
            if(aux==2){
               System.out.println("Ingrese el numero de fila y luego el numero del asiento");
               System.out.println("recuerde q son 10 filas que contienen 10 asientos");
               int fila= input.nextInt();
               int columna=input.nextInt();
               if (teatro[fila][columna].equalsIgnoreCase("L")) {
                   System.out.println("reservado");
                   teatro[fila][columna]=("X");
               } else System.out.println("No esta disponible");
            }
               
                   if(aux==3){
                    System.out.println("perdera los datos, para confirmae presione y");
                    salir=input.next();
                  
               }
       
        } 
    
    
        System.out.println("salio");
    
    
    
    
    
    
    
       
       
}
    
        }


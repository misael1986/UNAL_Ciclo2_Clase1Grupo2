/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.holamundo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 * @version
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        System.out.println("Hola a todos, todas y todes como sea");

        int entero;//aqui escribo y nada de esto se ejecuta
        entero = 10;

        String Entero = "Benitez";
        char letra='\u0001';
        System.out.println("valor de variable: " + entero);
        System.out.println("valor de variable: " + Entero);

        String ruta_imagen="C:\\Users\\tabernademoe\\Documents\\Apowersoft?";
        System.out.println(ruta_imagen);
        
        int i = 0;
        byte j = 1;
        long n = 1234567890987654321L;
        short t = -10;
        int p = -1;

        float f = 0;//cast  -
        double d = 0.7987985765465d;//cast  - 
        System.out.println(f);
        System.out.println(d);

        boolean TrueOrFalse;
        
        boolean b = true;
        boolean bool = false;
        boolean flag = true;
        boolean bln = false;
        boolean isPrime = false;
        boolean isEven = true;
        boolean True = false;
         */

        Scanner leerTeclado = new Scanner(System.in);
        String nombre = null;
        int edad = 0;
        System.out.println("Digite su nombre: ");

        nombre = leerTeclado.nextLine();
        System.out.println("Hola, " + nombre);
        System.out.println("Digite su edad: ");
        edad = leerTeclado.nextInt();
        System.out.println("Usted tiene: " + edad + " a\u00F1os");

// instancia del objeto Scanner
        Scanner sc = new Scanner(System.in);
// leer datos de tipo byte
        byte b = Byte.parseByte(sc.next());
// leer datos de tipo short
        short s = Short.parseShort(sc.nextLine());
// leer datos de tipo int
        int i = Integer.parseInt(sc.nextLine());
        
        
        System.out.println(b+"\n"+s+"\n"+i);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        String operacion;
        System.out.println("Numero 1:");
        x=Integer.parseInt(sc.nextLine());
        System.out.println("Numero 2:");
        y=Integer.parseInt(sc.nextLine());
        /*System.out.println("Operacion:");
        operacion=sc.nextLine();
        switch(operacion){
            case "sumar":
                System.out.println("Suma: "+sumar(x,y));
                break;
            case "restar":
                System.out.println("Restar: "+restar(x,y));
                break;
            case "multiplicar":
                System.out.println("Multi: "+multiplicar(x,y));
                break;
            case "dividir":
                System.out.println("Div: "+dividir(x,y));
                break;
        }*/
        System.out.println("Suma: "+sumar(x,y));
        System.out.println("Restar: "+restar(x,y));
        System.out.println("Multi: "+multiplicar(x,y));
        System.out.println("Div: "+dividir(x,y));
        
        
    }
    
    public static int sumar(int a, int b){
        int s=a+b;
        return s;
    }
    public static int restar(int a, int b){
        int s=a-b;
        return s;
    }
    public static int multiplicar(int a, int b){
        int s=a*b;
        return s;
    }
    public static int dividir(int a, int b){
        int s=a/b;
        return s;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio02 {
     public static void main(String[] args) {
        double c;
        double f;
        int contador=0; 

        for (f = 20; f >= 100; f+=4) { //
            contador +=+1;
            c = (5/9)*(f-32);
            System.out.printf("Operación(%d) Fahrenheit: %.2f ===> "
                    + "Celcius: %.2f", contador , f , c);
            
                
        }
     }
}
        
       
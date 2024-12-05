/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class ejercicio01 {
     public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4; 
        String mensajeFinal = "";

        for (num1 = 30; num1 >= 10; num1--) { //
            num2 = num1 + num1;
            num3 = num2 + num1;
            num4 = num3 + num1;
            System.out.printf("%d-%d-%d-%d\n",
                    num1, num2, num3 , num4);
            

                
        } // termina for 01
     }
}
        
       
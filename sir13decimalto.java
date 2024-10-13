/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nadeemsir31;

import java.util.Scanner;

/**
 *
 * @author shadm
 */
public class sir13decimalto {
public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("enter the decimal number ");
    String binary = "";
         int decimal = sc.nextInt();    
while(decimal>0){
    binary =  decimal%2 + binary;
    decimal/=2;
}
    System.out.println(" the binary number is " + binary);
        
        
}}

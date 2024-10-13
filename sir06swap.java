/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nadeemsir31;

/**
 *
 * @author shadm
 */
import java.util.Scanner;
public class sir06swap {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("enter the first number ");
     int a = sc.nextInt();
         System.out.println("enter the second number ");
int b = sc.nextInt();
int temp = a;
a = b ;
b = temp;
         System.out.println("after swaping the number  are ");
         System.out.println(" first number  = " + a );
         System.out.println(" second number = " + b );
     }}

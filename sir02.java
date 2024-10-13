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
public class sir02 {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("enter the first number ");
     int a = sc.nextInt();
     System.out.println("enter the second number ");
     int b = sc.nextInt();
     int sum = a+b;
     int subtract = a - b;
             int multiply = a*b;
             double divide = a/b;
             int remainder = a%b;
             System.out.println("the sum is " + sum);
     System.out.println("the subtraction is " + subtract);
     System.out.println("the multiplication is " + multiply);
     System.out.println("the divison is " + divide);
     System.out.println("the remainder is " + remainder);
     
     }
}

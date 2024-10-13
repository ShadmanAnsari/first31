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
public class sir10min {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("enter the first number ");
     int a = sc.nextInt();   
        System.out.println("enter the second number ");
     int b = sc.nextInt();   
      System.out.println("enter the thirs number ");
     int c = sc.nextInt();   
if(c<b)
{
    if(c<a)
        System.out.println("the minimum is  " + c);
    else 
        System.out.println("the minimum is " + a);
}
else if (b<c)
{if(b<a)
        System.out.println("the minimum is " + b);
else 
        System.out.println("the minimum is " + a);
    }
     }}

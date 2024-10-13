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
public class sir04circle {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("enter the radius of circle ");
     int r = sc.nextInt();
double area = Math.PI*r*r;
double paramter = 2*Math.PI*r;
         System.out.println(" the area of circle is " + area );
         System.out.println(" the parameter of circle is " + paramter );
     }
}

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
public class sir14digitsum {
 public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("enter the  number ");
     int num = sc.nextInt();   
 int sum =0 ;
 while(num>0){
    int rem=num%10;
 sum = sum + rem; 
         num/=10;
 }
     System.out.println("the sum of digits is " + sum);
 }}

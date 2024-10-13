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
public class sir18reverse {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("enter the string ");
     String str = sc.next();      
     String str2="";
    char temp;
     int len = str.length();
for(int i =0 ; i<len;i++){
    str2=str.charAt(i)+str2;
}
        System.out.println("the reverse string is: " + str2);
    }}

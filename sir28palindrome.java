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
public class sir28palindrome {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.next();
        
        int len;
        boolean flag = true;
        len = str.length();
  for(int i =0 ; i<len/2 ; i++){
      if (str.charAt(i)!=str.charAt(len-1-i))
  flag = false ;
          }
  if(flag==true)
            System.out.println("the string is palindrome");
  else 
            System.out.println("the string is not palindrome");
}}

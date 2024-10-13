/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shadm
 */
import java.util.Scanner;
public class sir21 {
    public static void main(String[] args) {
        // TODO code application logic here
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
            
    for(int i=1;i<=num;i++){
        
            
        if (num%i==0)
           
        count=count+1;
    }
    if(count==2){
            
System.out.println("the number is prime");
    }
    else System.out.println("it is not prime");
    }}
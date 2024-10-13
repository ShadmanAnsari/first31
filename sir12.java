
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shadm
 */
public class sir12 {
  public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbet till which you want the sum of");
        int N=sc.nextInt();
        int i;
        int sum=0;
        for(i=1;i<=N;i++){
            
            
            sum=sum+i;
            }
        System.out.println("The sum is"+sum);
        
    }   
}

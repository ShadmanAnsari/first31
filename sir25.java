
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shadm
 */
public class sir25 {
        public static void main(String[] args){
        int temp;
        Scanner sc = new  Scanner (System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        System.out.println("enter the array");
        int[] arr = new int[size];
    for(int i =0 ; i<size;i++){
      arr[i]= sc.nextInt();   
    }
        temp=arr[0];
        arr[0]=arr[size-1];
        arr[size-1]=temp;
         System.out.println("after swapping first and last term");
        for(int i =0 ; i<size;i++){
           
      System.out.println(arr[i]);
    }
    }
    
}

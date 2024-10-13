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
public class sir26maxmin {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("enter the array elements ");   
        for(int i = 0 ;i<size ; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0 ; j<size ; j++){
            if(arr[j]>max)
                max = arr[j];
        if(arr[j]<min)
                min = arr[j];
        }
        System.out.println("the max number is " + max);
        System.out.println("the minimum number is " + min);    
    }
        
}


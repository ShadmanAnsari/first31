
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shadm
 */
public class sir31 {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        } for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=  temp;
            }}  System.out.println("the sorted array is ");
        for(int k=0;k<size;k++){
            System.out.println(arr[k]);
        }
           
}}}

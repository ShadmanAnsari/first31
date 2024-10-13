
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shadm
 */
public class sir23 {
     public static void main(String[] args) {
int sum =0;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the array size");
int size = sc.nextInt();
        int [] array = new int[size];
     System.out.print("enter the array elements" );   
    for(int i =0;i<size ; i++){
        array[i]= sc.nextInt();
       
}
    for(int i =0;i<size ; i++){
        sum = sum + array[i];
    }
 System.out.print("the sum of thee array elements is  " + sum);}}
    



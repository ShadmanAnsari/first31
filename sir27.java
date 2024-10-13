
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shadm
 */
public class sir27 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size = sc.nextInt();
       int even=0;
       int odd=0;
        int arr[]= new int[size];
    for (int i =0; i<size; i++){
        arr[i]=sc.nextInt();}
for(int j=0;j<size;j++){
    if(arr[j]%2==0)
        even++;
    else odd++;
}
        System.out.println("the odd are "+ odd); 
        System.out.println("the even numbers are "+ even);
    
    }}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shadm
 */
public class sir24 {
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
           
        }
        if(arr[0]==arr[size-1])
        {System.out.println("the numbers are same ");
        }       else 
        System.out.println("the numbes ara not same");
        }
            
}

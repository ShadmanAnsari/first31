/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shadm
 */
import java.util.Scanner ;
public class sir30checkprime {
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[10];
        System.out.println("entr the 10 elements of the array");
        for (int i = 0; i<10;i++){
           arr[i]=sc.nextInt();
}
        int count ;
        int num ; 
    for(int i=0;i<10;i++){
         num = arr[i];
          count =0 ;
        
         
    for(int j=1;j<=num;j++){
         
        if (num%j==0)
            count++;
        
    
   

    }
     if(count==2)
System.out.println("the number " + num + " is prime number");
    
   // if(count!=2)
     else       System.out.println("the number " + num + " is not prime");
           }}}




import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shadm
 */
public class sir5 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        Double a=sc.nextDouble();
        System.out.println("Enter the second number");
        Double b=sc.nextDouble();
        System.out.println("Enter the second number");
        Double c=sc.nextDouble();
        Double average=(a+b+c)/3;
        System.out.println("the average of the"+average);
    }
}


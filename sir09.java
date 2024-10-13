
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shadm
 */
public class sir09 {
      public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
          System.out.println("enter the first point");
    int a1=sc.nextInt();
    int a2=sc.nextInt();
          System.out.println("enter the second point");
    int b1=sc.nextInt();
    int b2=sc.nextInt();
    int distance=(a2-a1)*(a2-a1)+(b2-b1)*(b2-b1);
    double dis=Math.sqrt(distance);
    System.out.println(dis);
      }
}

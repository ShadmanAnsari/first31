
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shadm
 */
public class sir19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
    int ch;
    int letter =0;
int digit=0;
int space=0;
    int len = str.length();
    for(int i=0;i<len;i++){
        ch=str.charAt(i);
        if((ch>65&&ch<91)||(ch>97&&ch<122)){
            letter++;
        }
        if((ch>47&&ch<58)){
            digit++;
        }
        if(ch==32)
            space++;
    }
        System.out.println("the number of letters are " + letter);
    
        System.out.println("the number of digits are " + digit);
        
        System.out.println("the number of spaces are " + space);
        
    
    }
}

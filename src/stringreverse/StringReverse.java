/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package stringreverse;
import java.util.Scanner;
/**
 *
 * @author Tanya Chowdhary  2023
 */
public class StringReverse {


/**
* @param args the command line arguments
*/
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a word: ");
String s=sc.nextLine();

char[] arr=new char[s.length()];

for(int i=0;i<arr.length;i++)
{
arr[i]=s.charAt(i);
}

for(int i=arr.length-1;i>=0;i--)
{
System.out.print(arr[i]);
}
System.out.println("");
}

 
    }



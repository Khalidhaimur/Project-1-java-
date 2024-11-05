/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
public class Project5method {
    public static void main(String[] args) {
        //This code in Java reads two numbers from the user, calculates their sum, and displays the result.
        int n1=readnumber();
        int n2=readnumber();
        int sum = n1 + n2;
        System.out.println("sum =" +sum);

    }
public static int readnumber(){
   //In this code, the method is the additional function declared as readnumber().
    // This function is responsible for reading and returning an integer from the user
    //it simplifies the input request process so that it can be reused in the program.
Scanner s=new Scanner(System.in);
    System.out.println("Enter your number");
    int n =s.nextInt();
    return n;
}
}

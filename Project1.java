/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.project1;

import java.util.Scanner;  // استيراد مكتبة Scanner لقراءة المدخلات من المستخدم

/**
 * This program enters two variables from the user and adds them together.
 */
public class Project1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n1");  // عرض رسالة للمستخدم لإدخال الرقم الأول
        int n1 = s.nextInt();             // قراءة الرقم الأول
        System.out.println("Enter n2");   // عرض رسالة للمستخدم لإدخال الرقم الثاني
        int n2 = s.nextInt();             // قراءة الرقم الثاني
        int sum = n1 + n2;                // حساب المجموع
        System.out.println("sum = " + sum); // عرض نتيجة المجموع
        s.close();                        // إغلاق كائن Scanner بعد الاستخدام
    }
}

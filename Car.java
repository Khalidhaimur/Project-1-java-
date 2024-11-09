/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Car {
    // الخصائص
    int year;
    String make;
    String model;

    // تعريف طريقة start
    public void start() {
        System.out.println(make + " is starting.");
    }

    // تعريف طريقة stop
    public void stop() {
        System.out.println(make + " is stopping.");
    }

    public static void main(String[] args) {
        //car : Datatype (classname)
        //c: reference
        //new cart(): construction
        Car c = new Car();
        c.year = 2020;
        c.make = "chevy";
        c.model = "corvette";

        c.start();
        c.stop();

        // إنشاء كائن آخر من فئة Car2
        Car c2 = new Car();
        c2.year = 2018;
        c2.make = "kawasaki";
        c2.model = "h2";

        c2.start();
        c2.stop();

        // طباعة القيم الفعلية
        System.out.println(c.make);
        System.out.println(c2.make);
    }
}

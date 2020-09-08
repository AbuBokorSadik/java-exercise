package com.bat;

public class SubClass extends SuperClass{
    public int number = 10;

    public void display(){
        System.out.println("Sub Class");
    }

    public void superSub(){
        SuperClass sub = new SubClass();
        sub.display();
        super.display();
        System.out.println("Sub class number = " + number);
        System.out.println("Super class number = " + super.number);
    }
}

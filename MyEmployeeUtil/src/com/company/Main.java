package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyEmployeeUtil<ComAZap> empA
                = new MyEmployeeUtil<ComAZap>(new ComAZap("Ram", 20000));
        MyEmployeeUtil<ComBZap> empB
                = new MyEmployeeUtil<ComBZap>(new ComBZap("Krish", 30000));
        MyEmployeeUtil<ComAZap> empC
                = new MyEmployeeUtil<ComAZap>(new ComAZap("Nagesh", 20000));
        System.out.println("Is salary same? "+empA.isSalaryEqual(empB));
        System.out.println("Is salary same? "+empA.isSalaryEqual(empC));
    }
}

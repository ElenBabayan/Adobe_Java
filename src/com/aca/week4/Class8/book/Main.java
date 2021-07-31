package com.aca.week4.Class8.book;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
//        PagePrinter schoolBook1 = new SchoolBook1("***Seal***");
//        PagePrinter schoolBook2 = new SchoolBook2("***Zangak***");
//
//        schoolBook1.print(17,"content1");
//        System.out.println();
//        schoolBook2.print(5,"content2");

        Scanner kb = new Scanner(System.in);

        System.out.println("Please specify what printer do you want: 1 - SchoolBookPage OR 2 - BookPagePrint");
        int printer = kb.nextInt();
        PagePrinter obj = decision(printer);
        printTwoPages(obj,1,"c1");
        printTwoPages(obj,16,"c2");

    }

    // if not static, the method belongs to Main class, therefore should call on Main obj
    public static void printTwoPages(PagePrinter obj, int number, String content) {
        obj.print(number,content);
    }

    public static PagePrinter decision(int printer) throws Exception {
        if(printer == 1) {
            return new SchoolBook1("***Seal***");
        }
        else if( printer == 2) {
            return new SchoolBook2("***Zangak***");
        }
        else {
            throw new Exception();
        }
    }
}

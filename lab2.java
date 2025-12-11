////1. Aim of the program : Accept 10 numbers from command line and check how many of them are even and how many are odd.
////        Input: Enter 10 number from keyboard
////Output:  Display number of even and odd number
//import java.util.Scanner;
//
//public class evenodd{
//    public static void main (String[] args ) {
//    int even=0, odd=0 ;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter 10 number from the keyboard .");
//    for(int i=0;i<10;i++){
//        int no=sc.nextInt() ;
//
//        if(no%2==0) {
//            even++;
//            System.out.println("even");
//        }
//        else odd ++ ;
//
//    }
//    System.out.println("No of even nos are :- "+even);
//        System.out.println("No of odd nos are :- "+odd);
//
//    }
//}
//




////Aim of the program:  Program to find no. of objects created out of a class using ‘static’ modifier.
////        Input:   No of objects created
////Output: Display the number of objects created (e.g. no of objects=3)
//import java.util.Scanner;
//
//class MyClass {
//    private static int count = 0;
//
//    public MyClass() {
//        count++;
//    }
//
//    public static int getCount() {
//        return count;
//    }
//}
//
//public class lab2 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            new MyClass();
//        }
//
//        System.out.println("no of objects = " + MyClass.getCount());
//    }
//}

//
////Write a class file – box with three data members(length, width, height) and a method volume() .
////Also implement the application class Demo where an object of the box class is created with user entered
////        dimensions and volume is printed
////
////
//import java.util.Scanner;
//
//class Box {
//    private int length;
//    private int width;
//    private int height;
//
//    Box(int l, int w, int h) {
//        length = l;
//        width = w;
//        height = h;
//    }
//
//    int volume() {
//        return length * width * height;
//    }
//}
//
//public class lab2{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int l = sc.nextInt();
//        int w = sc.nextInt();
//        int h = sc.nextInt();
//
//        Box b = new Box(l, w, h);
//
//        System.out.println("Volume = " + b.volume());
//    }
//}
//
//
//
//





////Write a program in Java to create a class Rectangle having data members length and breadth and three methods called read, c
/// calculate and display to read the values of length and breadth,
///calculate the area and perimeter of the rectangle and display the result   respectively.

//import java.util.Scanner;
//
//class Rectangle {
//    private int length;
//    private int breadth;
//    private int area;
//    private int perimeter;
//
//    void read() {
//        Scanner sc = new Scanner(System.in);
//        length = sc.nextInt();
//        breadth = sc.nextInt();
//    }
//
//    void calculate() {
//        area = length * breadth;
//        perimeter = 2 * (length + breadth);
//    }
//
//    void display() {
//        System.out.println("Area of Rectangle = " + area);
//        System.out.println("Perimeter of Rectangle = " + perimeter);
//    }
//}
//
//public class lab2 {
//    public static void main(String[] args) {
//        Rectangle r = new Rectangle();
//        r.read();
//        r.calculate();
//        r.display();
//    }
//}




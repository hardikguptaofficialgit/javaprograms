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
//Aim of the program:  Program to find no. of objects created out of a class using ‘static’ modifier.
//        Input:   No of objects created
//Output: Display the number of objects created (e.g. no of objects=3)
import java.util.Scanner;
public class objectcounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <n; i++) {
            new MyClass();
        }
        System.out.println("no of objects=" + MyClass.getCount());
    }
}
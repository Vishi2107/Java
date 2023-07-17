//package com.company;
//import java.util.Scanner;
//
//public class LargeNumber {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        int max = a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println(max);
//    }
//}
//
//Second method

//package com.company;
//import java.util.Scanner;
//
//public class LargeNumber{
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        int max = 0;
//        if(a>b){
//            max = a;
//        }
//        else{
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println(max);
//    }
//}

//third method

import java.util.Scanner;

public class LargeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}

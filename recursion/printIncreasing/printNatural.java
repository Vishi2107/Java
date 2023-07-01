import java.util.Scanner;

public class printNatural {
    static void printIncreasing(int n){
        if(n == 1){
            System.out.println(1);
            return;
        } 
        printIncreasing(n - 1); //1,2,...,n-1
        System.out.println(n);
    }

    static void printDecreasing(int n){
        if(n == 1){
            System.out.println(1);
            return;
        } 
        System.out.println(n);
        printDecreasing(n - 1); //n-1,...,2,1
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Increasing order of " + n + " natural numbers are: ");
        printIncreasing(n);
        System.out.println("Decreasing order of " + n + " natural numbers are: ");
        printDecreasing(n);
    }
}

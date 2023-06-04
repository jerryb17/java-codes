import java.util.Scanner;

public class Recursion {
    /* //addition of n natural numbers
    public static void PrintSum(int i, int n, int sum){
        //if(i==n) {
            sum += i;
            System.out.println("Sum = " +sum);
            return;
        }
        sum += i;
        PrintSum(i+1, n, sum);

    }
    public static void main(String[] args){


        PrintSum(1, n, 0);
    }*/

    /* //factorial of n number
    public static int Calfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1 = Calfactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        int ans = Calfactorial(n);
        System.out.println(ans);
    }*/
    //fibonacci series of n numbers
    public static void Fibo(int a, int b, int n){
        if(n==0){
            return;
        }

        int c=a+b;
        System.out.println(c);
        Fibo(b, c, n-1);

    }
    public static void main(String[] args){
        int $ = 10;
        int a= 0;
        int b= 1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter n:");
        int n= scanner.nextInt();
        System.out.println(a);
        System.out.println($);
        Fibo(a, b, n-2);

    }
}

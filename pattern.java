import java.util.*;

public class pattern {
    public static void hollow(int row, int colm) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= colm; j++) {
                if (i == 1 || row == i || j == 1 || colm == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pyramid(int n) {

        for (int i = n; i >= 1; i--) {

//            for (int j=1; j<=n-i;j++){
//                System.out.print(" ");
//            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);


            }
            System.out.println();


        }
    }

    public static void floyd(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            //space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            //space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void rhombus(int n) {
        for (int i = 1; i <= 5; i++) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //hollow rectangle(stars)
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void number_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pallamdrome_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void charss(int n) {
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2){
            return true;
        }
            for (int i = 2; i <=n-1; i++) {
                if (n % i == 0) {
                    return false;
                }

            }
        return true;
    }

    public static void primerange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void bintodec(int number){
        int dec=0;
        int pow=0;
        while (number>0){
            int lastdigit=number%10;
            dec= dec + lastdigit*(int)(Math.pow(2, pow));
            pow++;
            number/=10;
        }
        System.out.print(dec);
    }
    public static void dectobinary(int n){
        int pow=0;
        int bin=0;
        while (n>0){
            int rem=n%2;
            bin= bin+ rem*(int)(Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.print(bin);
    }
    public static void h_r(int row, int cols){
        for (int i=1; i<=row;i++){
            for(int j=1; j<=cols; j++){
                if(i==1 || i ==row || j==1 || j==cols){
                    System.out.print("*"+ " ");
                }
                else {
                    System.out.print(" "+" ");
                }

            }
            System.out.println();
        }
    }
    public static void inv_hp(int n){

        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void floyyd(int n){
        int counter = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_tri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterflynew(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            for (int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for (int l=1; l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            for (int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for (int l=1; l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void rhombus_new(int n){
        for (int i=1; i<=n;i++){
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Hollow_rhombus_new(int n){
        for (int i=1; i<=n;i++){
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n;j++){
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void diamond_new(int n){
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void number_pyra(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void palamdrome_pattern(int n){
        for (int i=1; i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=i; k>=1; k--){
                System.out.print(k);
            }
            for (int l=2; l<=i; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palamdrome_pattern(7);




    }
}
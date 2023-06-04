import java.util.Scanner;

public class JavaCourse {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeRange(int n){
        for (int i=2; i<=n; i++){
            if (isPrime(i)){
                System.out.print(i+ " ");
            }
        }System.out.println();
    }
    public static void binaryno(int binno){
       int myno = binno;
       int dec = 0;
       int power = 0;
       while (binno>0){
           int lastno = binno%10;
           dec= dec + (lastno*(int)Math.pow(2, power));
           power++;
           binno=binno/10;
       }
       System.out.println("Decimal of "+ myno + "= "+ dec);
    }
    public static void dectobin(int decn){
        int myno = decn;
        int binary = 0;
        int pow = 0;
        while (decn>0){
            int remainder = decn%2;
            binary = binary + (int) (remainder * Math.pow(10, pow));
            pow++;
            decn/=2;
        }
        System.out.println("binary of "+ myno + "= " + binary);

    }

    public static void main(String[] args) {
        dectobin(56);

       binaryno(10100011);
    }
}
import java.util.*;
public class string {
    public static boolean isPalindrome(String str){
        for (int i = 0; i<str.length()/2; i++){
            int n = str.length();
            if (str.charAt(i)!= str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static float shortestpath(String path){
        int x= 0, y=0;
        for (int i=0; i<path.length(); i++){
            char direction = path.charAt(i);
            if (direction=='S'){
                y--;
            } else if (direction=='N') {
                y++;

            } else if (direction=='E') {
                x++;
            }
            else {
                x--;
            }
        }
        int X2= x*x;
        int Y2= y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static String Substring(String str, int start, int end){
        String substring = "";
        for (int i=start; i<end; i++){
            substring += str.charAt(i);

        }
        return substring;
    }


    public static void main(String[] args){
        String fruit[] = {"apple", "mango", "banana"};
        String largest = fruit[0];
        for (int i = 1; i<fruit.length; i++){
            if (largest.compareTo(fruit[i])<0){
                largest= fruit[i];
            }
        }
        System.out.print(largest);
//        String str = "HelloWorld";
//        System.out.print(Substring(str, 4, 6));


        //String path = "WNEENESENNN";
        //System.out.print(shortestpath(path));


    }
}


import java.util.*;
public class array {

    public static int LargeValue(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i< numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];

            }
            if (smallest>numbers[i]){
                smallest= numbers[i];

            }

        }
        System.out.println("smallest value is: "+ smallest);

        return largest;
    }
    public static int BinarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;


        while (start<=end){
            int mid = (start + end)/ 2;

            if(numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]>key){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void reverse(int numbers[]){
       int first=0, end=numbers.length-1;
       while (first<end){
           int temp= numbers[end];
           numbers[end]= numbers[first];
           numbers[first]=temp;

           first++;
           end--;
       }
    }
    public static void Pairs(int numbers[]){
        for (int i=0; i<numbers.length; i++){
            int curr= numbers[i];
            for (int j=i+1; j<numbers.length; j++){
                System.out.print("("+ curr + ", "+ numbers[j]+") ");
            }
            System.out.println();
        }
    }
    public static void Subarray(int numbers[]){
        for (int i=0; i< numbers.length; i++){
            for (int j=i; j<numbers.length;j++){
                for (int k=i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
        }
            System.out.println();
    }}
    public static void MaxSumSubarray(int numbers[]){
        int curr = 0;
        int maxSum= Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++){
            for (int j=i; j<numbers.length;j++){
                 curr=0;
                for (int k=i; k<=j;k++){
                    curr+=numbers[k];

                }
                System.out.println(curr);
                    if (curr>maxSum){
                        maxSum=curr;
                    }



            }
        }
        System.out.print("max sum of subarray: "+maxSum);
    }
    public static void maxSUMPrefix(int numbers[]){
        int max= Integer.MIN_VALUE;
        int curr = 0;
        int prefix[] = new int[numbers.length];
        prefix[0]= numbers[0];
        for (int i=1; i< numbers.length;i++){
            prefix[i]= prefix[i-1]+ numbers[i];
        }
        for (int i=0; i<numbers.length; i++){
            for (int j=i; j<numbers.length; j++){
                curr= i==0? prefix[j]: prefix[j]- prefix[i-1];
                if (max<curr){
                    max=curr;
                }

            }
        }
        System.out.print("Max sum= "+max);
    }
    public static int kadans(int numbers[]){
        int curr = 0;
        int maxValue= Integer.MIN_VALUE;
        for (int i=0; i<numbers.length;  i++){
            curr= curr+numbers[i];

        if (curr<0){
            curr=0;
        }
        maxValue= Math.max(curr, maxValue);
            if (maxValue<0){
                return Math.max(curr, maxValue);
            }

    }
        System.out.println("max sum: "+ maxValue);
    return -1;
    }
    public static int trappedwater(int height[]){

        //leftmax of bars
        int leftmax[] = new int[height.length];
        leftmax[0]= height[0];

        for (int i=1; i<height.length; i++){
            leftmax[i]= Math.max(height[i],leftmax[i-1]);
        }
        //rightmax of bars
        int rightmax[]= new int[height.length];
        rightmax[height.length-1]= height[height.length-1];
        for (int i=height.length-2; i>=0; i--){
            rightmax[i]= Math.max(height[i], rightmax[i+1]);
        }
        int trapwater =0;
        for (int i=0; i < height.length; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += waterlevel- height[i];
        }
        return trapwater;

    }
    public static int buyORsell(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i< prices.length; i++){
            if (buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit , maxProfit);

            }
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){

        int prices[]= {7,1,5,6,3,4};

        //int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println(buyORsell(prices));


    }
}

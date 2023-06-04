import java.util.*;
public class ContainerMaxWater {
    public static int maxwater(ArrayList<Integer> list){
        int maxWater = 0;
        for (int i=0; i<list.size(); i++){
            for (int j=i+1; j<list.size();j++){
                int height = Math.min(list.get(i) , list.get(j));
                int width = j-i;
                int currentW= height*width;
                maxWater= Math.max(currentW, maxWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        //1 8 6 2 5 4 8 3 7
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.print(maxwater(list));

    }
}

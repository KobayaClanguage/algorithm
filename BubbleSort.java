import java.util.*;

public class BubbleSort {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(7);
        System.out.println(list);
        
        
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size()-1; j++){
                if(list.get(j) > list.get(j+1)){
                    int temp_first = list.get(j), temp_second = list.get(j+1);
                    list.set(j, temp_second);
                    list.set(j+1, temp_first);
                    
                }
            }
        }
        System.out.println(list);

    }
}

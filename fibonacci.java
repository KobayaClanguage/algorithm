import java.util.*;

public class fibonacci{
    public static void main(String[] args){
        int num_result;
        List <Integer> result_list = new ArrayList<>();

        result_list.add(0);
        result_list.add(1);

        for(int i = 0; i < 9; i++){
            num_result = result_list.get(i) + result_list.get(i+1);
            result_list.add(num_result);
        }
        
        System.out.println(result_list);
    }
}
import java.util.*;
import static java.lang.System.*;

public class bin_search{
    public static void main(String[] args){
        int[] target_ar = {0,2,4,6,7,9,10,11,13,15,17};

        int left = 0;
        int right = target_ar.length;
        int target_num = 7;

        while(left < right){
            int mid = (left + right)/2;

            if(target_ar[mid] == target_num){
                System.out.println(mid + 1);
                break;
            
            }else if(target_num < target_ar[mid]){
                right = mid;
            
            }else if(target_num > target_ar[mid]){
                left = mid + 1;

            }
        }
        }
}
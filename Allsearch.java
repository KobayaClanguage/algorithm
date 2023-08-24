import java.util.*;

public class Allsearch{
    public static void main(String[] args){
        int count = 0;
        int total = 0;
        int N = 5;
        int M = 7;

        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= N; j++){
                for (int k = 1; k <= N; k++){
                    total = i + k + j;
                    if(total == M){
                        count += 1;
                    }
                }
            }
        }
    System.out.println(count);    
    }
    
}
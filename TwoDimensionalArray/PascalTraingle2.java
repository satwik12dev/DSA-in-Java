package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle2 {
    public static void main(String[] args) {
        generate(5);
    }

    static void generate(int rowIndex){
        int n = rowIndex+1;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i =0 ; i< n; i++){
            ans.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i){ ans.get(i).add(1);}
                else {
                    int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    ans.get(i).add(val);
                }
            }
        }

        System.out.println(ans.get(rowIndex));
    }
}

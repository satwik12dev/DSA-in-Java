package Arrays;

public class Segregateo0sand1s {



    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,0};
        segregate(arr);
        System.out.println();
        segregate2(arr);
    }
    static void segregate(int[] arr){

        //this solution is two pass solution
        int numberofZeroes = 0;
        int n = arr.length;
        for(int ele:arr){
            if(ele==0) numberofZeroes++;
        }
        for(int i = 0; i < numberofZeroes; i++){
            arr[i]=0;
        }
        for (int i  = numberofZeroes; i< n; i++){
            arr[i]=1;
        }
        for(int ele:arr) System.out.print(ele);
    }

    static void segregate2(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for (int ele:arr){
            System.out.print(ele);
        }
    }
}

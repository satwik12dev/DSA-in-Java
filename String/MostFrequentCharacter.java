package String;

import java.util.Arrays;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s = "character";
        bruteforce(s);
        sorting(s);
        frequencyArray(s);
    }

    static void bruteforce(String s){
        int n = s.length();
        int maxFre = 1;
        char max = s.charAt(0);
        for (int i = 0; i < n; i++) {
            int count = 1;
            char ch = s.charAt(i);
            for (int j = i+1; j < n; j++) {
                if(s.charAt(j)==ch) count++;
            }
            if(count>maxFre){
                maxFre =count;
                max = ch;
            }else if(count==maxFre && ch<max){
                max = ch;
            }
        }
        System.out.println(max);
    }

    static  void sorting(String s){
        int i =0,j=0;
        int maxfre = 1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        while(j<s.length()){
            if(arr[i]==arr[j]) j++;
            else{
                int freq = j-i;
                if(freq>maxfre){
                    maxfre = freq;
                    ans = arr[i];
                }
                i=j;
            }
        }
        int freq = j-i;
        if(freq>maxfre){
            maxfre = freq;
            ans = arr[i];
        }
        System.out.println(ans);
    }

    static void frequencyArray(String s){
        int n = s.length();
        int maxfreq = 0;
        char ans = s.charAt(0);

        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = ch-'a';
            freq[idx]++;
        }
        for (int i = 0; i < 26; i++) {
            if(freq[i]>maxfreq){
                maxfreq = freq[i];
                ans = (char) (i+97);
            }
        }
        System.out.println(ans);
    }
}

package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        //do keyboard input for the number of pairs of brackets
        System.out.println("please enter the number of opening and closing brackets");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //call our method "numberOfCombinations" and display the result on the screen
        System.out.println(numberOfCombinations(n));
    }
    //create a method that calculates the Catalan number
    static long numberOfCombinations (int n) {
        long[] combinations = new long[n + 1];
        combinations[0] = 1;
        for (int i=1; i<=n; i++) {
            combinations[i]=0;
            for (int j=0; j<i; j++)
                combinations[i]+=combinations[j]*combinations[i-1-j];
        }
        return combinations[n];
    }
}

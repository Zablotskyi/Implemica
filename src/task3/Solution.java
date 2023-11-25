package task3;

public class Solution {
    public static void main(String[] args) {
        //call the function factorial
        System.out.println("factorial: " + factorial(10));
        //call the function sum of numbers
        System.out.println("sum of numbers: " + sumFactorial(100));
    }
    //create a method for finding the factorial from the passed number to the method
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i ++) {
            result = result * i;
        }
        return result;
    }
    //create a method for finding the sum of numbers from one to the passed number in the method
    static int sumFactorial(int n) {
        int result = 1;
        for (int i = 0; i < n; i ++) {
            result += i;
        }
        return result;
    }
}

import java.util.ArrayList;

public class BasicJava{
    // 1. Print 1-255
    // Write a method that prints all the numbers from 1 to 255.
    public static void print1To255(){
        for(int i=1; i<=255;i++ ){
            System.out.println(i);
        }

    }

    // 2. Print odd numbers between 1-255
    // Write a method that prints all the odd numbers from 1 to 255.
    public static void printOdd1To255(){
        for(int i=1; i<=255; i+=2){
            System.out.println(i);
        }
    }


    // 3. Print Sum
    // Write a method that prints the numbers from 0 to 255, but this 
    // time print the sum of the numbers that have been printed so far. 
    // For example, your output should be something like this:
    public static void printNumSum0To255(){
        int sum = 0;
        for(int i=0; i<=255; i++){
            sum = sum + i;
            System.out.printf("New number: %d Sum: %d%n", i, sum);
        }
    }
    // 4.Iterating through an array
    // Given an array X, say [1,3,5,7,9,13], 
    // write a method that would iterate through each member of the array 
    // and print each value on the screen.
    public static void iterateArr(int[] X){
        for(int i=0; i<X.length; i++){
            System.out.println(X[i]);
        }

    }
    // 5.Find Max
    // Write a method (sets of instructions) that takes any array and prints the maximum value in the array.
    //  Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]),
    //   or even a mix of positive numbers, negative numbers and zero.
    public static void findMax(int[] X){
        if(X.length ==0){
            System.out.println("No array given");
            return;
        }
        int max =X[0];
        for(int i=1; i<X.length;i++){
            if(X[i] > max){
                max=X[i];
            }
            
            System.out.println(max);
        }
    }
        // 6.Get Average
        // Write a method that takes an array, and prints the AVERAGE 
        // of the values in the array. For example for an array [2, 10, 3], 
        // your method should print an average of 5. Again, make sure you 
        // come up with a simple base case and write instructions to solve 
        // that base case first, then test your instructions for other complicated cases.
    public static void average(int[] Y){
        int sum=0;
        int average=0;
        for(int i=0; i<Y.length; i++){
            sum=sum+Y[i];
            System.out.println(sum);
            average=sum/Y.length;
        }
        System.out.println(average);
    }
    
        // 7.Array with Odd Numbers
        // Write a method that creates an array 'y' that contains all the 
        // odd numbers between 1 to 255. When the method is done, 'y' 
        // should have the value of [1, 3, 5, 7, ... 255].
    public static void oddNumbers(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i=1; i<=255; i+=2){
            y.add(i);
            
        }
        System.out.println(y);
        
    }

    public static void main(String[] args) {
        // System.out.println("HELLO");
        // print1To255();
        // printOdd1To255();
        // printNumSum0To255();
        // iterateArr(new int[]{1,3,5,7,9,13});
        // findMax(new int[] {});
        // average(new int[] {1,4,-4,6,0,7});
        oddNumbers();
    }


}
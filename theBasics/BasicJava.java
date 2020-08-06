import java.util.ArrayList;
import java.util.Arrays;


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
        // #8 Greater Than Y
        // Write a method that takes an array 
        // and returns the number of values in that array whose value is greater than a given value y.
        //  For example, if array = [1, 3, 5, 7] and y = 3,
        //  after your method is run it will print 2 (since there are two values in the array that are greater than 3).
        public static void greaterThanY(int[] y, int z){
            int greater = z;
            for(int i=1; i<y.length; i++){
                if(y[i] > greater){
                    greater=y[i];
                }
            }
            System.out.println(greater);
        }
        
        // #9 Square the values
        // Given any array x, say [1, 5, 10, -2],
        //  write a method that multiplies each value in the array by itself.
        //   When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
        public static void square(int[] x){
            int temp=0;
            for(int i=0; i<x.length; i++){
                temp = x[i]*x[i];
                x[i]=temp;
            }
            System.out.println(Arrays.toString(x));
        }
        // #10 Eliminate Negative Numbers
        // Given any array x, say [1, 5, 10, -2],
        //  write a method that replaces any negative number with the value of 0.
        //   When the method is done, x should have no negative values, say [1, 5, 10, 0].
        public static void negativeNum(int[] x){
            for(int i=0; i<x.length; i++){
                if(x[i]<0){
                    x[i]=0;
                }
                System.out.println(Arrays.toString(x));
            }
        }
        
        // #11 Max, Min, and Average
        // Given any array x, say [1, 5, 10, -2],
        //  write a method that returns an array with the maximum number in the array
        //  , the minimum value in the array, and the average of the values in the array.
        //   The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
        // Assumption: array arr is not empty
        public static double[] minMaxAverage(int[] arr){
            int min= arr[0];
            int max= arr[0];
            int sum= 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]<min){
                    min=arr[i];
                } 
                if (arr[i]>max) {
                    max=arr[i];
                }
                sum=sum+arr[i];   
                              
            }
            double ave= (double)sum/arr.length;
            System.out.println(ave);                

            double[] resultArray = new double[] {max, min, ave};
            System.out.println(Arrays.toString(resultArray));
            return(resultArray);
        }
        // #12 Shifting the Values in the Array
        // Given any array x, say [1, 5, 10, 7, -2], 
        // write a method that shifts each number by one to the front. 
        // For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0].
        //  Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
        public static void shiftArr(int[] x){
            int holdOne=x[0];
            int holdTwo=x[1];
            for(int i=1; i<x.length;i++){
                x[i-1]=x[i];
                System.out.println(Arrays.toString(x));
            }
            x[x.length-1]=0;
            System.out.println(Arrays.toString(x));
        }
        
        public static void main(String[] args) {
        // System.out.println("HELLO");
        // print1To255();
        // printOdd1To255();
        // printNumSum0To255();
        // iterateArr(new int[]{1,3,5,7,9,13});
        // findMax(new int[] {});
        // average(new int[] {1,4,-4,6,0,7});
        // oddNumbers();
        // greaterThanY(new int[] {1, 3, 5, 7},3);
        // square(new int[] {1, 25, 100, 4, 4,6}); 
        // negativeNum(new int[] {1,5,10,-2});
        // minMaxAverage(new int[] {1, 5, 10, -2});
        int[] theArr = new int[] {1, 5, 10, 7, -2};
        System.out.println("Before: " + Arrays.toString(theArr));
        shiftArr(theArr);
        System.out.println("After: " + Arrays.toString(theArr)); // Original array is modified!
    }


}





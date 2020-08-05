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


    // 3. Print Sum
    // Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far. For example, your output should be something like this:

    // New number: 0 Sum: 0
    // New number: 1 Sum: 1
    // New number: 2 Sum: 3
    // New number: 3 Sum: 6
    // ...
    // New number: 255 Sum: ___
    // Do NOT use an array to do this exercise.

    public static void main(String[] args) {
        System.out.println("HELLO");
        print1To255();

        
    }
}
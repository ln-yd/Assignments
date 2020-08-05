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

    public static void main(String[] args) {
        System.out.println("HELLO");
        print1To255();
        printOdd1To255();
        printNumSum0To255();


        
    }
}
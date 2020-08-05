import java.io.*; 

public class StringTest{
    private static boolean testTrim() {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        // System.out.println(str);
        return str.equals("HelloWorld");
    }

    private static boolean testIndexOrNull() {
        StringManipulator manipulator = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        // System.out.println(a); // 1
        // System.out.println(b); // 4
        // System.out.println(c); // null
        return a == 1 && 4 == b && c == null;
    }

    private static boolean testIndexOrNullSubstring() {
        StringManipulator manipulator = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer a = manipulator.getIndexOrNull(word, subString);
        Integer b = manipulator.getIndexOrNull(word, notSubString);
        // System.out.println(a); // 2
        // System.out.println(b); // null
        return a == 2 && b == null;
    }

    private static boolean testConcatenateSubstring() {
        StringManipulator manipulator = new StringManipulator();
        String word = manipulator.concatSubstring("Hello", 1, 2, "world");
        // System.out.println(word); // eworld
        return word.equals("eworld");
    }

    public static void main(String[] args) {
        boolean a = testTrim();
        boolean b = testConcatenateSubstring();
        boolean c = testIndexOrNull();
        boolean d = testIndexOrNullSubstring();

        for(boolean passed : new boolean[]{a, b, c, d}) {
            if (passed) {
                System.out.println("YOU. ROCK.");
            } else {
                System.out.println("You dun eff'd up");
            }
        }
    }
}
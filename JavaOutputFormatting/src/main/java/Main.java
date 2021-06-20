import java.util.Scanner;

/*
Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100
cpp            065
python         050
================================
Explanation

Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th character, and each integer that was less than  digits now has leading zeroes.
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next("[a-zA-Z]*");
        int number1 = scanner.nextInt();
        String string2 = scanner.next("[a-zA-Z]*");
        int number2 = scanner.nextInt();
        String string3 = scanner.next("[a-zA-Z]*");
        int number3 = scanner.nextInt();
        System.out.println("================================");
        System.out.printf("%-15s", string1);
        System.out.printf("%03d%n", number1);
        System.out.printf("%-15s", string2);
        System.out.printf("%03d%n", number2);
        System.out.printf("%-15s", string3);
        System.out.printf("%03d%n", number3);
        scanner.close();
        System.out.println("================================");
    }


}



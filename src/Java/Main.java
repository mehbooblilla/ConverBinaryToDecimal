package Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Java Program to convert binary to Decimal:
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a binary number:");
        String binaryString=scanner.nextLine();
        System.out.println("output: "+Integer.parseInt(binaryString,2));
        //Java Program to Convert Decimal to Binary:
        System.out.println("Enter a decimal number to convert into Binary:");
        int decimalNumber=scanner.nextInt();
        System.out.println("Output: "+Integer.toBinaryString(decimalNumber));
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class BigDigit{
    static Integer c = 0;
    public static void main(String args[]){
        
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the two big-digit number(The two numbers which must have the same digit):");
    	String s1 = input.nextLine();
        String s2 = input.nextLine();
        add(s1, s2);
    }

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class BigDigit{
    static Integer c = 0;
    public static void main(String args[]){
        
    	Scanner input = new Scanner(System.in);
    	
    	//prompt the user to enter the numbers
    	System.out.println("Enter the two big-digit number(The two numbers which must have the same digit):");
    	String s1 = input.nextLine();
        String s2 = input.nextLine();
        add(s1, s2);
    }
    //set the add method
    public static void add(String a, String b){
        ArrayList<String> re = new ArrayList<String>();
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(true){
            int i1 = Integer.parseInt(Character.toString(a.charAt(i)));
            int i2 = Integer.parseInt(Character.toString(b.charAt(j)));
            Integer i3  = i1 + i2 + c;
            //the top digit condition
            if(i3 > 9){
                c = 1;
                i3 = i3 - 10;
            }else c = 0;
            re.add(i3.toString());
            i--;
            j--;
            if(i < 0){
                re.add(c.toString());
                break;
            }
        }
        Collections.reverse(re);
        for(String r : re){
            System.out.print(r);
        }
    }
} 

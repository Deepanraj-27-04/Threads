package Valid_Number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        sc.close();
        boolean isvalid=sol.validNumber(number);
        if(isvalid)
            System.out.println("The given number "+number+" is valid");
        else
            System.out.println("The given number "+number+" is not valid");
    }
}

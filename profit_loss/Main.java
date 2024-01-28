package profit_loss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n= sc.nextInt();
        Investment in = new Investment(n);
        Sales s= new Sales(n);
        in.start();
        Sales.yield();;
        try {
            in.join();
            s.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Integer profit=s.sum-in.sum;
        System.out.println(" profit is "+profit);
        sc.close();
    }

}

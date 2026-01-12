// A small coffee shop tracks its daily sales. They sell three sizes of coffee: small, medium, and large.

// The prices are:
// small: $2.00
// medium: $3.50
// Large: $5.00 

// Write a program that takes the number of small, medium, and large coffees sold as input from the user. The program should then calculate the total revenue from coffee sales for today.

// The program should then calculate an 8% sales tax on the total revenue. Finally, the program should print the total revenue (before tax), the tax amount, and the net revenue (after tax).

// Calculate the total revenue from coffee sales given the number of small, medium, and large coffees sold (taken as user input), and their respective prices. Calculate 8%(or 0.08f;) sales tax, and display the revenue before tax, tax amount, and net revenue.


import java.io.*;
import java.util.*;

public class Solution3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int small = sc.nextInt();
        int medium = sc.nextInt();
        int large = sc.nextInt();

        double priceSmall = 2.00;
        double priceMedium = 3.50;
        double priceLarge = 5.00;

        double totalRevenue = (small * priceSmall) + (medium * priceMedium) + (large * priceLarge);

        double tax = totalRevenue * 0.08;
        double netRevenue = totalRevenue - tax;

        System.out.printf("Total Revenue (before tax): $%.2f%n", totalRevenue);
        System.out.printf("Sales Tax (8%%): $%.2f%n", tax);
        System.out.printf("Net Revenue (after tax): $%.2f%n", netRevenue);


        
    }
}
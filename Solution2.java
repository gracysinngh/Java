/*A weather station records temperatures in Celsius. They want a program that can convert Celsius to Fahrenheit and Kelvin.

Write a program that takes the temperature in Celsius (as a double) as input from the user. The program should then calculate the equivalent temperatures in Fahrenheit (as a double) and Kelvin (as a double).

Finally, the program should display the original Celsius temperature and the converted Fahrenheit and Kelvin temperatures, each formatted to one decimal place, in the following format:

Input format:
Temperature in Celsius(as double)

Output format:
Celsius: [Celsius]
Fahrenheit: [Fahrenheit]
Kelvin: [Kelvin]*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double celsius=sc.nextDouble();
        double fahrenheit=(celsius * 9/5)+32;
        double kelvin=celsius+273.15;
        System.out.printf("Celsius: %.1f\n", celsius);
        System.out.printf("Fahrenheit: %.1f\n", fahrenheit);
        System.out.printf("Kelvin: %.1f\n", kelvin);

    }
}
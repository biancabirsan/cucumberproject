package com.biancabirsan.cucumbermavenproject;

import java.util.Scanner;

public class InterestCalculator {
	
	public static double CalculateInterestRate(int principal, double interestRate, int time) {
		
        
        double totalcost = (principal * interestRate * time)/ 100 + principal;
             
        System.out.println("The total cost owned is  : " + totalcost );
        
        return totalcost;
		
	}

}

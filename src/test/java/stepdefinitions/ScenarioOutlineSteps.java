package stepdefinitions;

import static org.junit.Assert.assertTrue;

import com.biancabirsan.cucumbermavenproject.InterestCalculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ScenarioOutlineSteps {
	
	int principal;
	double interestRate;
	int time;
	double totalcost;
	
	
	@Given("I have a Customer")
	public void i_have_a_Customer() {
	   
	}

	@Given("user enters principal {int}")
	public void user_enters_principal(Integer principal) {
		this.principal = principal;
		System.out.println("The amount borrowed is " + principal);
	   
	}

	@Given("Interest rate is {int}")
	public void interest_rate_is_percent(int interestRate) {
	    this.interestRate = interestRate;
	    System.out.println("The interest rate is " + interestRate);
	}

	@Given("period time {int} years")
	public void period_time_years(int time) {
	    this.time = time;
	    System.out.println("The number of years " + time);
	}

	@Then("final total cost owned is {double}")
	public void final_total_cost_owned_is(Double expectedValue) {
	   double SysteCalcValue = InterestCalculator.CalculateInterestRate(principal, interestRate, time);
	   
	   System.out.println("Expected Value: " + expectedValue );
		  System.out.println("Calculated Value: " + SysteCalcValue);
		  assertTrue(expectedValue == SysteCalcValue);	
	}
	
	@Then("final total cost owned is {int}")
	public void final_total_cost_owned_is(Integer expectedValue) {
		 double SysteCalcValue = InterestCalculator.CalculateInterestRate(principal, interestRate, time);
		  System.out.println("Expected Value: " + expectedValue );
		  System.out.println("Calculated Value: " + SysteCalcValue);
		  assertTrue(expectedValue == SysteCalcValue);	
	    
	}



}

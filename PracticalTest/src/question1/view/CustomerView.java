package question1.view;
import question1.model.Customer;
import question1.service.CustomerService;
public class CustomerView {
	public static void main(String args[]) {
	   
	   	 Customer customer = new Customer(1,"Shweta", 2);
    	 CustomerService custservice = new CustomerService();
	   	boolean eligible = custservice.checkEligibility(customer);
	   	 if(eligible == true) {
	   		 System.out.println("You are eligible for voting");
	   	 }
	   	 else {
	   		 System.out.println("You are not eligible for voting");
	   	 }
	   	 
	    }
}

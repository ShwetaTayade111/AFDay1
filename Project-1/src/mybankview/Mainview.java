package mybankview;

import com.mybank.service.LoanAccountService;

public class Mainview {
 
	 public static void main(String args[]) {
    	
    	 LoanAccountService obj1 = new LoanAccountService();
    	 int interest = obj1.calculateInterst(1, 100, 10 ,5);
    	 System.out.println(interest);
    	
     }

}	

	

	

	

	



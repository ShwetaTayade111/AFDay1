package customerview;

import customermodel.Customer;
import customermodel.Product;

public class main {

	int getcustomerIdFromCustomer(Customer custObj) {
		return(custObj.getCustomerId());
	}
	
	void getcustomerIdFromCustomer1(Customer custObj) {
		String custName = custObj.getCustomerName();
		System.out.println("Customer Name : " + custName);
	}
	
	String getproductNameFromProduct(Product proObj) {
		return(proObj.getProductName());
	}
	
	
    int getPriceFromProduct(Product proObj) {
    	return(2*proObj.getPrice());
    }

	public static void main(String args[]) {
    	main mainObj = new main();

		Customer customer1 = new Customer(1,"Shweta");
		int custId = mainObj.getcustomerIdFromCustomer(customer1); 
		System.out.println("Customer Id : "+custId);
mainObj.getcustomerIdFromCustomer1(customer1);
		
		Product product1 = new Product(2, "Rice", 500);
		String proName = mainObj.getproductNameFromProduct(product1);
		System.out.println("Product Name : " + proName);
		
		
		int proPrice = mainObj.getPriceFromProduct(product1);
		System.out.println("Product Price : " + proPrice);
		
		
		
    	
    }
}

package org.service;
import java.util.Scanner;
import org.service.ArrayService;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		int arr[] = new int[5];
		for(int i=0; i<5 ; i++)  {
			arr[i]= sc.nextInt();
		}
		ArrayService service = new ArrayService();
		System.out.println(service.calculateAverage(arr));

	}

}


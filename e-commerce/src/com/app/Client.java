package com.app;

import java.util.Scanner;

import com.service.Flipkart;
import com.utility.ScannerUtility;

public class Client {

	public static void main(String[] args) {
		Scanner sc = ScannerUtility.getScanner();
		Flipkart flipkart = new Flipkart();
		while (true) {

			System.out.println("1} Add Color");
			System.out.println("2} Add Size");
			System.out.println("3} Add Price");
			System.out.println("4} Add Product");
			System.out.println("5} Display Color");
			System.out.println("6} Display Size");
			System.out.println("7} Display Price");
			System.out.println("8} Display Product");

			System.out.println("Select any option");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				flipkart.addColor();
				break;
			case 2:
				flipkart.addSize();
				break;
			case 3:
				flipkart.addPrice();
				break;
			case 4:
				flipkart.addProduct();
				break;

			case 5:
				flipkart.displayColor();
				break;

			case 6:
				flipkart.displaySize();
				break;

			case 7:
				flipkart.displayPrice();
				break;

			case 8:
				flipkart.displayProduct();
				break;
			default:
				System.exit(0);
				break;
			}

		}

	}

}

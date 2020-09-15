package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Color;
import com.model.Price;
import com.model.Product;
import com.model.Size;
import com.utility.ScannerUtility;

public class Flipkart implements IFlipkart {

	private List<Color> colors = new ArrayList<Color>();
	private List<Size> sizeList = new ArrayList<Size>();
	private List<Price> priceList = new ArrayList<Price>();
	private List<Product> productList = new ArrayList<Product>();

	@Override
	public void addColor() {
		Scanner sc = ScannerUtility.getScanner();
		int noOfColors = 0;
		System.out.println("How many colors you want to add");
		try {
			noOfColors = sc.nextInt();
			try {
				for (int i = 0; i < noOfColors; i++) {
					Color color = new Color();
					System.out.println("Enter Color id");
					color.setId(sc.nextInt());
					System.out.println("Enter Color Name");
					color.setColorName(sc.next());

					colors.add(color);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addSize() {
		Scanner sc = ScannerUtility.getScanner();
		System.out.println("How many Size you want to add");
		int noOfSize = sc.nextInt();

		for (int i = 0; i < noOfSize; i++) {
			Size size = new Size();

			System.out.println("Enter size id");
			size.setId(sc.nextInt());
			System.out.println("Enter size Name");
			size.setSizeName(sc.next());

			sizeList.add(size);
		}

	}

	public void addPrice() {
		Scanner sc = ScannerUtility.getScanner();
		System.out.println("How many Price you want to add");
		int noOfPrice = sc.nextInt();

		for (int i = 0; i < noOfPrice; i++) {
			Price price = new Price();

			System.out.println("Enter price id");
			price.setId(sc.nextInt());
			System.out.println("Enter price Name");
			price.setPrice(sc.next());

			priceList.add(price);
		}

	}

	public void displayColor() {

		System.out.println("ID" + "\t\t" + "COLORE NAME");
		for (Color color : colors) {
			System.out.println(color.getId() + "\t\t" + color.getColorName());
		}

	}

	public void displaySize() {
		System.out.println("ID" + "\t\t" + "SIZE NAME");
		for (Size size : sizeList) {
			System.out.println(size.getId() + "\t\t" + size.getSizeName());
		}
	}

	public void displayPrice() {
		System.out.println("ID" + "\t\t" + "PRICE");
		for (Price price : priceList) {
			System.out.println(price.getId() + "\t\t" + price.getPrice());
		}
	}

	public void addProduct() {

		Scanner sc = ScannerUtility.getScanner();
		System.out.println("How many Product you want to add");
		int noOfProd = sc.nextInt();

		for (int i = 0; i < noOfProd; i++) {
			Product product = new Product();

			System.out.println("Enter Product code");
			product.setCode(sc.nextInt());
			System.out.println("Enter Product Name");
			product.setName(sc.next());
			System.out.println("Enter Product Barcode");
			product.setBarcode(sc.nextInt());

			System.out.println("++++++++++++++++++++++++++++++");
			displayColor();
			System.out.println("++++++++++++++++++++++++++++++");

			if (colors.isEmpty()) {
				System.out.println("No Colors Available");
			} else {
				System.out.println("How many colors you want allocate for this product");
				int noOfColors = sc.nextInt();
				List<Color> colorList = new ArrayList<Color>();

				for (int j = 0; j < noOfColors; j++) {
					System.out.println("Enter Color id for allocation");
					int colorId = sc.nextInt();

					for (Color color : colors) {
						if (color.getId() == colorId)
							colorList.add(color);
					}
				}
				product.setColorList(colorList); // has-a
			}
			System.out.println("++++++++++++++++++++++++++++++");
			displaySize();
			System.out.println("++++++++++++++++++++++++++++++");

			System.out.println("How many size you want allocate for this product");
			int noOfsize = sc.nextInt();

			List<Size> sizeListForAllocate = new ArrayList<Size>();

			for (int j = 0; j < noOfsize; j++) {
				System.out.println("Enter Size id for allocation");
				int sizeId = sc.nextInt();
				for (Size size : sizeList) {
					if (size.getId() == sizeId)
						sizeListForAllocate.add(size);
				}
			}
			product.setSizeList(sizeListForAllocate);

			System.out.println("++++++++++++++++++++++++++++++");
			displayPrice();
			System.out.println("++++++++++++++++++++++++++++++");

			System.out.println("How many Price you want allocate for this product");
			int noOfPrice = sc.nextInt();

			List<Price> priceListForAllocate = new ArrayList<Price>();

			for (int j = 0; j < noOfPrice; j++) {
				System.out.println("Enter price id for allocation");
				int priceId = sc.nextInt();
				for (Price price : priceList) {
					if (price.getId() == priceId)
						priceListForAllocate.add(price);
				}
			}
			product.setPriceList(priceListForAllocate);

			productList.add(product);
		}

	}

	public void displayProduct() {
		for (Product product : productList) {
			System.out.println(product.getCode() + "\t" + product.getName() + "\t" + product.getBarcode());
			System.out.println("Colors");
			for (Color color : product.getColorList()) {
				System.out.println("\t" + color.getId() + "\t" + color.getColorName());
			}
			System.out.println("Size");
			for (Size size : product.getSizeList()) {
				System.out.println("\t" + size.getId() + "\t" + size.getSizeName());
			}
			System.out.println("Price");
			for (Price price : product.getPriceList()) {
				System.out.println("\t" + price.getId() + "\t" + price.getPrice());
			}
		}
	}

}

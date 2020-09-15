package com.model;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private int code;
	private String name;
	private int barcode;
	
	private List<Color> colorList;
	private List<Size> sizeList;
	private List<Price> priceList;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public List<Color> getColorList() {
		return colorList;
	}
	
	public void setColorList(List<Color> colorList) {
		this.colorList = colorList;
	}
	
	public List<Size> getSizeList() {
		return sizeList;
	}
	
	public void setSizeList(List<Size> sizeList) {
		this.sizeList = sizeList;
	}
	
	public List<Price> getPriceList() {
		return priceList;
	}
	
	public void setPriceList(List<Price> priceList) {
		this.priceList = priceList;
	}
	
	

}

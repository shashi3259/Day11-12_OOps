package com.bridgelab.oops;

public class StockAccountManagement {
	int noOfShares=0;
	int CMPofShare = 0;
	int valueOfShare = 0;
	String nameOfshares;

	public StockAccountManagement(String nameOfshare, int noOfShares, int CMPofShare) {
		this.nameOfshares = nameOfshare;
		this.noOfShares= noOfShares;
		this.CMPofShare = CMPofShare;
		valueOfShare = noOfShares*CMPofShare;

	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public int getValueOfShare() {
		return valueOfShare;
	}

	public String getNameOfshares() {
		return nameOfshares;
	}


	public int noOfshares(int n) {
		return n;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockAccountManagement value = new StockAccountManagement("ITC",10,234);
		System.out.println("Share name is: "+ value.nameOfshares);
		System.out.println("CMP of one Share is: "+ value.CMPofShare);
		System.out.println("Number of shares: " + value.noOfShares);
		System.out.println("Current value of "+value.noOfShares +" "+ value.nameOfshares +"= "+ value.valueOfShare);

	}

}

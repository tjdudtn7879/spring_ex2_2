package com.lgy.spring_test;

public class SeasonDollar {
	public static void main(String[] args) {
		Season season=new Season();
		Won2dollar won2dollar=new Won2dollar();
		
		season.setMonth(9);
		won2dollar.setWon(3300);
		
		season.season();
		won2dollar.dollar();
	}
}

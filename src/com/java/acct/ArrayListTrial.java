package com.java.acct;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

public class ArrayListTrial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("ABC");
		myList.add("XYZ");
		//System.out.println(myList);
		
		DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
		df.setMaximumFractionDigits(340);
		
		//DecimalFormat df = new DecimalFormat("#");
        //df.setMaximumFractionDigits(8);
		
		double TotalQuantityReleasedKG = 0.0;
		TotalQuantityReleasedKG =Double.valueOf(0.0004593).doubleValue();
		//System.out.println(TotalQuantityReleasedKG);
		System.out.println(df.format(TotalQuantityReleasedKG));

	}


}

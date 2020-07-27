package com.gvrcs.balance.BalanceString;

import java.io.*;
import java.util.Scanner;

public class BalanceString {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String balance = null;
		if (sc.hasNext()) {
			balance = sc.next();
		}
		BalanceString obj = new BalanceString();
		obj.checkForBalancedString(balance);

	}

	public String checkForBalancedString(String balance) {
		// TODO Auto-generated method stub
		Boolean flag = true;
		if (balance.length() % 2 != 0) {
			if ((balance.charAt((balance.length() / 2))) == '$') {
				balance = balance.substring(0, balance.length() / 2)
						+ balance.substring((balance.length() / 2 + 2)-1, balance.length());
			} else {
				flag = false;
			}
		}
		if (balance.length() % 2 == 0) {
			String first = balance.substring(0, balance.length() / 2);
			String last = balance.substring(balance.length() / 2);
			for (int i = 0; i < first.length(); i++) {
				if ((first.charAt(i) == ']') || (first.charAt(i) == '[' && last.charAt(i) != ']')) {
					if (!(first.charAt(i) == '$' || last.charAt(i) == '$')) {
						flag = false;
					}
				}
			}
		}
		if (flag) {
			return "Balanced";
		} else {
			return "Not Balanced";
		}
	}
}

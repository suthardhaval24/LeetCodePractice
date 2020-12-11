package com.blackrocks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CashRegistrySystem {
	public static void main(String args[]) {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);
		try {
			double purchasePrice = Double.parseDouble(in.readLine());
			double cash = Double.parseDouble(in.readLine());
			CashRegister register = new CashRegister();
			register.init();
			String result = register.calculateChange(purchasePrice, cash);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class CashRegister {

	LinkedHashSet<Denomination> coins = new LinkedHashSet<>();

	public String calculateChange(double purchasePrice, double cash) {

		double cashBack = (double) Math.round((cash - purchasePrice) * 100) / 100;

		if (cashBack < 0) {
			System.out.println("ERROR");
			return "";
		}

		StringBuilder change = new StringBuilder();

		while (cashBack > 0) {
			Iterator<Denomination> iterator = coins.iterator();
			while (iterator.hasNext()) {
				Denomination coin = iterator.next();
				int count = 0;
				while (cashBack >= coin.getValue()) {
					count++;
					cashBack = (double) Math.round((cashBack - coin.getValue()) * 100) / 100;
				}
				while (count > 0) {
					change.append(coin.getName()).append(",");
					count--;
				}
			}
		}
		change.deleteCharAt(change.length() - 1);
		return change.toString();
	}

	public LinkedHashSet<Denomination> init() {
		coins.add(new Denomination(50, "Fifty Pounds"));
		coins.add(new Denomination(20, "Twenty Pounds"));
		coins.add(new Denomination(10, "Ten Pounds"));
		coins.add(new Denomination(5, "Five Pounds"));
		coins.add(new Denomination(2, "Two Pounds"));
		coins.add(new Denomination(1, "One Pound"));
		coins.add(new Denomination(0.5, "Fifty Pence"));
		coins.add(new Denomination(0.2, "Twenty Pence"));
		coins.add(new Denomination(0.1, "Ten Pence"));
		coins.add(new Denomination(0.05, "Five Pence"));
		coins.add(new Denomination(0.02, "Two Pence"));
		coins.add(new Denomination(0.01, "One Pence"));
		return coins;
	}

}

class Denomination {

	double value;
	String name;

	public Denomination(double value, String name) {
		this.value = value;
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
}
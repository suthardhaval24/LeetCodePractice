package com.blackrocks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StockPrice {
	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			String[] pfAndBm = line.split(":");
			String[] pfs = pfAndBm[0].split("\\|");
			String[] bms = pfAndBm[1].split("\\|");
			List<Asset> portfolio = new ArrayList<>();
			List<Asset> benchMarks = new ArrayList<>();

			for (int i = 0; i < pfs.length; i++) {
				String[] pfsData = pfs[i].split(",");
				portfolio.add(new Asset(pfsData[0], pfsData[1], Integer.parseInt(pfsData[2])));

				String[] bmsData = bms[i].split(",");
				benchMarks.add(new Asset(bmsData[0], bmsData[1], Integer.parseInt(bmsData[2])));
			}

			List<Trade> transactions = transactions(portfolio, benchMarks);

			/*
			 * Sort the trades in the transaction list according to the ascending order of
			 * Asset name if same sort by type
			 */
			Collections.sort(transactions, new Comparator<Trade>() {
				@Override
				public int compare(Trade a, Trade b) {
					return a.getName().compareToIgnoreCase(b.getName());
				}
			});

			for (Trade t : transactions)
				System.out.println(t.getType() + "," + t.getName() + "," + t.getAssetType() + "," + t.getNumShares());
		}

	}

	 public static List<Trade> transactions(List<Asset> portfolio, List<Asset> benchMarks) {

		List<Trade> numTransaction = new ArrayList<>();

		Collections.sort(portfolio, new LexicographicComparator());
		Collections.sort(benchMarks, new LexicographicComparator());
		for (int i = 0; i < portfolio.size(); i++) {
			Asset pAsset = portfolio.get(i);
			Asset bAsset = benchMarks.get(i);

			if (pAsset.getType().equals("STOCK")) {
				/* Calculates trades for STOCK */
				if (pAsset.getShares() < bAsset.getShares()) {
					int diff = bAsset.getShares() - pAsset.getShares();
					numTransaction.add(new Trade("BUY", pAsset.getName(), pAsset.getType(), diff));
				} else if (pAsset.getShares() > bAsset.getShares()) {
					int diff = pAsset.getShares() - bAsset.getShares();
					numTransaction.add(new Trade("SELL", pAsset.getName(), pAsset.getType(), diff));
				}

			} else {
				/* Calculates trades for BONDS */
				if (pAsset.getShares() < bAsset.getShares()) {
					int diff = bAsset.getShares() - pAsset.getShares();
					numTransaction.add(new Trade("BUY", pAsset.getName(), pAsset.getType(), diff));
				} else if (pAsset.getShares() > bAsset.getShares()) {
					int diff = pAsset.getShares() - bAsset.getShares();
					numTransaction.add(new Trade("SELL", pAsset.getName(), pAsset.getType(), diff));
				}
			}
		}
		return numTransaction;
	}
}

/**
 * To sort by name
 * 
 * @author Dhaval
 *
 */
class LexicographicComparator implements Comparator<Asset> {
	@Override
	public int compare(Asset a, Asset b) {
		return a.getName().equalsIgnoreCase(b.getName()) ? a.getType().compareToIgnoreCase(b.getType())
				: a.getName().compareToIgnoreCase(b.getName());
	}
}

/**
 * Data Structure for Trade
 * 
 * @author Dhaval
 *
 */
class Trade {

	private String type;
	private String tName;
	private String assetType;
	private int numShares;

	public Trade(String type, String name, String assetType, int numShares) {
		this.type = type;
		this.tName = name;
		this.assetType = assetType;
		this.numShares = numShares;
	}

	public String getType() {
		return this.type;
	}

	public String getName() {
		return this.tName;
	}

	public String getAssetType() {
		return this.assetType;
	}

	public int getNumShares() {
		return this.numShares;
	}

}

/**
 * Data Structure for Asset
 * 
 * @author Dhaval
 *
 */
class Asset {
	private String name;
	private String assetType;
	private int shares;

	public Asset(String name, String assetType, int share) {
		this.name = name;
		this.assetType = assetType;
		this.shares = share;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.assetType;
	}

	public int getShares() {
		return shares;
	}
}

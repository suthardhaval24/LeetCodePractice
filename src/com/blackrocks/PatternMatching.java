package com.blackrocks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class PatternMatching {
	
	public static void main(String args[]) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			String[] splitedInput = line.split(";");
			String pattern = splitedInput[0];
			String blob = splitedInput[1];
			PatternMatching.calculate(pattern, blob);
		}
	}

	private static void calculate(String pattern, String blobs) {

		// getting each word from blobs
		String[] words = getWords(blobs);
		// to store final result
		StringBuffer final_output = new StringBuffer();
		List<Integer> ans = new ArrayList<Integer>();

		for (int i = 0; i < words.length; i++) {
			ans.add(getCount(pattern, words[i]));
		}

		int sum = 0;
		for (int i : ans) {
			sum += i;
		}

		for (int i : ans) {
			if (i != 0) {
				final_output.append(i);
				final_output.append("|");
			}
		}

		final_output.append(sum);
		System.out.println(final_output);

	}

	/**
	 * 
	 * @param blobs
	 * @return will return each word in blob separated by "|"
	 */
	private static String[] getWords(String blobs) {
		blobs = blobs.trim();
		String[] words = blobs.split("\\|");
		return words;
	}

	/**
	 * 
	 * @param pattern
	 * @param word
	 * @return return count of the occurences in in word of pattern
	 */

	private static int getCount(String pattern, String word) {
		if (isEmpty(pattern) || isEmpty(word)) {
			return 0;
		}

		int index = 0, count = 0;

		while (true) {
			index = word.indexOf(pattern, index);
			if (index != -1) {
				count++;
				index += pattern.length();
			} else {
				break;
			}
		}

		return count;
	}

	/**
	 * 
	 * @param s
	 * @return boolean value whether word or pattern empty or null
	 */

	private static boolean isEmpty(String s) {
		return s == null;
	}

}

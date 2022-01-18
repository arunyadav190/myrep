package test;

import java.util.HashMap;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 1, 2, 3, 5 };
		int size = ar.length + 1;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < size; i++) {
			map.put(i + 1, 0);
		}
		for (int i = 0; i < ar.length; i++) {

			map.put(ar[i], map.get(ar[i]) + 1);

		}

		for (int i = 0; i < size; i++) {
			if (map.get(i + 1) == 0) {
				System.out.println("Num is " + (i + 1));
			}
		}

	}

}

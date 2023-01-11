//	31 28 31 30 31 30 31 31 30 31 30 31
package main;

import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main (String args[]) {
		List<Integer> list = new ArrayList<>(1000*12);
		list.add(1);
		int j=0;
		int days = 6;
		int count = 0;

		for (int i=1901; i <= 2000; i++) {
			list.add(list.get(j) + 31); j++;
			if (i%400 == 0) {
				list.add(list.get(j) + 29); j++;
			} else if (i%100 == 0) {
				list.add(list.get(j) + 28); j++;
			} else if (i%4 == 0) {
				list.add(list.get(j) + 29); j++;
			} else {
				list.add(list.get(j) + 28); j++;
			}
			list.add(list.get(j) + 31); j++;
			list.add(list.get(j) + 30); j++;
			list.add(list.get(j) + 31); j++;
			list.add(list.get(j) + 30); j++;
			list.add(list.get(j) + 31); j++;
			list.add(list.get(j) + 31); j++;
			list.add(list.get(j) + 30); j++;
			list.add(list.get(j) + 31); j++;
			list.add(list.get(j) + 30); j++;
			list.add(list.get(j) + 31); j++;
		}

		j = 0;
		while (j < list.size()) {
			if (days == list.get(j)) {
				count++;
			}
			if (days >= list.get(j)) {
				j++;
			}
			days += 7;
		}

		System.out.println(count);
	}
}

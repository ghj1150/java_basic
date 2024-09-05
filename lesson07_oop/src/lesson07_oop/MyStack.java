package lesson07_oop;

import java.util.Arrays;

public class MyStack {
	private int[] items = new int[3];
	private int cnt;

	int pop() {
		return items[--cnt];
	}

	void push(int item) {
		if (items.length == cnt) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		items[cnt++] = item;
	}

	int size() {
		return cnt;
	}
}

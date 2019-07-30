package com.zxc.IdWork;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			Long a = IdWorker.getId();
			System.out.println(a);
		}

	}
}

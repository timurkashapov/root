package com.shako.root.main;

/**
 * Entry point to app.
 */
public class Main {

	private static long fastVersion = 0;
	private static long slowVersion = 0;
	private static long optimizedVersion = 0;
	private static long modifiedFastVersion = 0;
	private static long modifiedSlowVersion = 0;

	static {}
	{}

	public  Main() {}

	public static void main(String[] args) {


		Thread tFastVersion = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; ++i) {
					fastVersion += fastVersion();
				}
			}
		}, "Fast version");

		Thread tSlowVersion = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; ++i) {
					slowVersion += slowVersion();
				}
			}
		}, "Slow version");

		Thread tOptimizedVersion = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; ++i) {
					optimizedVersion += optimizedVersion();
				}
			}
		}, "Optimized Version");

		Thread tModifiedFastVersion = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; ++i) {
					modifiedFastVersion += modifiedFastVersion();
				}
			}
		}, "Modified fast version");

		Thread tModifiedSlowVersion = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; ++i) {
					modifiedSlowVersion += modifiedSlowVersion();
				}
				this.notifyAll();
			}
		}, "Modified slow version");

		tFastVersion.start();
		tSlowVersion.start();
		tOptimizedVersion.start();
		tModifiedFastVersion.start();
		tModifiedSlowVersion.start();

		Thread tPrintln = new Thread(new Runnable() {
			public void run() {
				System.out.println("Fast version: " + (double) fastVersion / 1000000000 + " s");
				System.out.println("Slow version: " + (double) slowVersion / 1000000000 + " s");
				System.out.println("Optimized version: " + (double) optimizedVersion / 1000000000 + " s");
				System.out.println("Modified fast version: " + (double) modifiedFastVersion / 1000000000 + " s");
				System.out.println("Modified slow version: " + (double) modifiedSlowVersion / 1000000000 + " s");
			}
		});

		tPrintln.start();
	}

	private static synchronized long fastVersion() {
		long startTime = System.nanoTime();
		int n = 0;
		for (int i = 0; i < 1000000000; i++) {
			n += 2 * (i * i);
		}
		return System.nanoTime() - startTime;
	}
	private static synchronized long slowVersion() {
		long startTime = System.nanoTime();
		int n = 0;
		for (int i = 0; i < 1000000000; i++) {
			n += 2 * i * i;
		}
		return System.nanoTime() - startTime;
	}
	private static synchronized long optimizedVersion() {
		long startTime = System.nanoTime();
		int n = 0;
		for (int i = 0; i < 1000000000; i++) {
			n += i * i;
		}
		n *= 2;
		return System.nanoTime() - startTime;
	}
	private static synchronized long modifiedFastVersion() {
		long startTime = System.nanoTime();
		int n = 0;
		for (int i = 0; i < 1000000000; i++) {
			if (n == 0) n = 1;
			n += 2 * (i * i);
		}
		return System.nanoTime() - startTime;
	}
	private static synchronized long modifiedSlowVersion() {
		long startTime = System.nanoTime();
		int n = 0;
		for (int i = 0; i < 1000000000; i++) {
			if (n == 0) n = 1;
			n += 2 * i * i;
		}
		return System.nanoTime() - startTime;
	}
}

package com.shako.java.generics;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class GenericsTest {

	@Test
	public void testGenerics() {

		List<Integer> ints = Arrays.asList(1,2,3);

		int s = 0;

		for (int n : ints) {
			s += n;
		}

		assert s == 6;

	}
}

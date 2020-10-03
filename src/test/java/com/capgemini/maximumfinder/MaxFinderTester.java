package com.capgemini.maximumfinder;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaxFinderTester {
	MaxFinder maxfinder;
	@Before
	public void before() {
		maxfinder=new MaxFinder();
	}

	@Test
	public void test1_1() {
		assertEquals((Integer)9,(Integer)maxfinder.find_maximum(9, 2, 4));
	}
	
	@Test
	public void test1_2() {
		assertEquals((Integer)20,(Integer)maxfinder.find_maximum(9, 20, 4));
	}
	@Test
	public void test1_3() {
		assertEquals((Integer)30,(Integer)maxfinder.find_maximum(9, 2, 30));
	}

}

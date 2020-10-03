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
	
	@Test
	public void test2_1() {
		assertEquals((Float)9.0F,(Float)maxfinder.find_maximum(9.0F, 2.0F, 3.0F));
	}
	@Test
	public void test2_2() {
		assertEquals((Float)20.0F,(Float)maxfinder.find_maximum(9.0F, 20.0F, 12.0F));
	}
	@Test
	public void test2_3() {
		assertEquals((Float)30.0F,(Float)maxfinder.find_maximum(9.0F, 2.0F, 30.0F));
	}
	
	@Test
	public void test3_1() {
		assertEquals("Peach",maxfinder.find_maximum("Peach","Apple","Banana"));
	}
	@Test
	public void test3_2() {
		assertEquals("Peach",maxfinder.find_maximum("Apple","Peach","Banana"));
	}
	@Test
	public void test3_3() {
		assertEquals("Peach",maxfinder.find_maximum( "Banana", "Apple","Peach"));
	}
	

}

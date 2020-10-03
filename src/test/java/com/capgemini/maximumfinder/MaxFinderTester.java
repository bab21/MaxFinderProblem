package com.capgemini.maximumfinder;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaxFinderTester {
	
	@Test
	public void test1_1() {
		MaxFinder maxfinder=new MaxFinder(9,2,4);
		assertEquals((Integer)9,(Integer)MaxFinder.find_maximum(maxfinder));
	}
	
	@Test
	public void test1_2() {
		MaxFinder maxfinder=new MaxFinder(9,20,4);
		assertEquals((Integer)20,(Integer)MaxFinder.find_maximum(maxfinder));
	}
	@Test
	public void test1_3() {
		MaxFinder maxfinder=new MaxFinder(9, 2, 30);
		assertEquals((Integer)30,(Integer)MaxFinder.find_maximum(maxfinder));
	}
	
	@Test
	public void test2_1() {
		MaxFinder maxfinder=new MaxFinder(9.0F, 2.0F, 3.0F);
		assertEquals((Float)9.0F,(Float)MaxFinder.find_maximum(maxfinder));
	}
	@Test
	public void test2_2() {
		MaxFinder maxfinder=new MaxFinder(9.0F, 20.0F, 12.0F);
		assertEquals((Float)20.0F,(Float)MaxFinder.find_maximum(maxfinder));
	}
	@Test
	public void test2_3() {
		MaxFinder maxfinder=new MaxFinder(9.0F, 2.0F, 30.0F);
		assertEquals((Float)30.0F,(Float)MaxFinder.find_maximum(maxfinder));
	}
	
	@Test
	public void test3_1() {
		MaxFinder maxfinder=new MaxFinder("Peach","Apple","Banana");
		assertEquals("Peach",MaxFinder.find_maximum(maxfinder));
	}
	@Test
	public void test3_2() {
		MaxFinder maxfinder=new MaxFinder("Apple","Peach","Banana");
		assertEquals("Peach",MaxFinder.find_maximum(maxfinder));
	}
	@Test
	public void test3_3() {
		MaxFinder maxfinder=new MaxFinder("Banana", "Apple","Peach");
		assertEquals("Peach",MaxFinder.find_maximum(maxfinder));
	}
	

}

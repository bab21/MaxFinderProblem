package com.capgemini.maximumfinder;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaxFinderTester {
	
	@Test
	public void test1_1() {
		Integer[] array={2,5,6,8,9};
		MaxFinder maxfinder=new MaxFinder(array);
		assertEquals((Integer)9,(Integer)MaxFinder.find_maximum(maxfinder));
	}
	
	@Test
	public void test1_2() {
		Integer[] array=new Integer[5];
		MaxFinder maxfinder=new MaxFinder(array);
		assertEquals(null,(Integer)MaxFinder.find_maximum(maxfinder));
	}
	@Test
	public void test1_3() {
		Integer[] array={2,5,6,8,90};
		MaxFinder maxfinder=new MaxFinder(array);
		assertEquals((Integer)90,(Integer)MaxFinder.find_maximum(maxfinder));
	}
	
	@Test
	public void test2_1() {
		Float[] array={2.0F,5.0F,6.0F,8.0F,9.0F};
		MaxFinder maxfinder=new MaxFinder(array);
		assertEquals((Float)9.0F,(Float)MaxFinder.find_maximum(maxfinder));
	}
	@Test
	public void test2_2() {
		Float[] array={2.0F,5.0F,6.0F,18.0F,9.0F};
		MaxFinder maxfinder=new MaxFinder(array);
		assertEquals((Float)18.0F,(Float)MaxFinder.find_maximum(maxfinder));
	}
	@Test
	public void test2_3() {
		Float[] array={2.0F,5.0F,6.0F,18.0F,90.0F};
		MaxFinder maxfinder=new MaxFinder(array);
		assertEquals((Float)90.0F,(Float)MaxFinder.find_maximum(maxfinder));
	}
	
	@Test
	public void test3_1() {
		String[] array= {"Peach","Apple","Orange","Mango","Gauva"};
		MaxFinder maxfinder=new MaxFinder(array);
		assertEquals("Peach",MaxFinder.find_maximum(maxfinder));
	}
	@Test
	public void test3_2() {
		String[] array= {"Peach","Apple","Orange","Mango","Gauva","Zebra"};
		MaxFinder maxfinder=new MaxFinder(array);
		assertEquals("Zebra",MaxFinder.find_maximum(maxfinder));
	}
	@Test
	public void test3_3() {
		String[] array= {"Lion","Apple","Orange","Mango","Gauva"};
		MaxFinder maxfinder=new MaxFinder(array);
		assertEquals("Orange",MaxFinder.find_maximum(maxfinder));
	}
	

}

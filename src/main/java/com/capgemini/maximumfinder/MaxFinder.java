package com.capgemini.maximumfinder;

public class MaxFinder {
	
	public Integer find_maximum(Integer a,Integer b,Integer c) {
		Integer max=a;
		if(b.compareTo(max)>0)
			max=b;
		if(c.compareTo(max)>0)
			max=c;
		return max;
	}
}

package com.capgemini.maximumfinder;

public class MaxFinder {
	
	public <E extends Comparable>  E find_maximum(E a,E b,E c) {
		E max=a;
		if(b.compareTo(max)>0)
			max=b;
		if(c.compareTo(max)>0)
			max=c;
		return max;
	}

}

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
	public Float find_maximum(Float a,Float b,Float c) {
		Float max=a;
		if(b.compareTo(max)>0)
			max=b;
		if(c.compareTo(max)>0)
			max=c;
		return max;
	}
	public String find_maximum(String a,String b,String c) {
		String max=new String(a);
		if(b.compareTo(max)>0)
			max=new String(b);
		if(c.compareTo(max)>0)
			max=new String(c);
		return max;
	}
}

package com.capgemini.maximumfinder;

import java.util.Arrays;

public class MaxFinder <E extends Comparable> {
	E[] array;
	
	MaxFinder(E[] array){
		this.array=array;
	}
	
	public static <E extends Comparable>  E find_maximum(MaxFinder maxfinder){
		Arrays.sort(maxfinder.array);
		return (E)maxfinder.array[maxfinder.array.length-1];
		
	}

}

package com.capgemini.maximumfinder;

import java.util.Arrays;

import java.util.Optional;

public class MaxFinder <E extends Comparable> {
	E[] array;
	
	MaxFinder(E[] array){
		this.array=array;
	}
	
	public static <E extends Comparable>  E find_maximum(MaxFinder maxfinder){
		
		Optional<E> checkNull = Optional.ofNullable(maxfinder.array[maxfinder.array.length-1]);   
        if (checkNull.isPresent()) {
        	Arrays.sort(maxfinder.array);
        	printMax(maxfinder.array[maxfinder.array.length-1]);
    		return (E)maxfinder.array[maxfinder.array.length-1];
        } 
        else{ 
        	System.out.println("array is empty"); 
            return null;
       }
	}
	public static <E extends Comparable> void  printMax(E max){
		System.out.println("Maximum value is "+ max);
	}
}

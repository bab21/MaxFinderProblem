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
    		return (E)maxfinder.array[maxfinder.array.length-1];
        } 
        else{ 
        	System.out.println("word is null"); 
            return null;
       }
	}
	
}

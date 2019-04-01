package com.java8.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	public static void main(String[] args) {
		List<String> lines=Arrays.asList("Spring","Struts","rest");
		
		List<String> result = lines.stream().filter(line -> !"Struts".equals(line)).collect(Collectors.toList());
		result.forEach(System.out::println);
		result.forEach(System.out::println);
	}
}

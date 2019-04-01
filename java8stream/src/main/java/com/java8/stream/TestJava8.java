package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class TestJava8 {
	public static void main(String[] args) {
		List<String> alpha = Arrays.asList("A","B","C","D");
		
		List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
		
	}
}

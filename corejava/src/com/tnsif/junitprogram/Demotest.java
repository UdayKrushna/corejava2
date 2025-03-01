package com.tnsif.junitprogram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
public class Demotest {
@Test
@RepeatedTest(9)
@DisplayName("junit")
void testAdd() {
	Demo d1=new Demo();
	int actual=d1.add(5, 5);
	int expected=10;
	if(expected==actual) {
		System.out.println("passed");
	}
	else {
		System.out.println("faoil");
	}
}
}

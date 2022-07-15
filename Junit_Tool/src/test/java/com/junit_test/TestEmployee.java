package com.junit_test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// We have to follow the naming conventions.

// Test Case: a class that will test our code.
@TestMethodOrder(OrderAnnotation.class)
public class TestEmployee {
	// Test methods..

	@Test
	@Order(1)
	public void testSave() {

		System.out.println("Save....");
	}

	@Test
	@Order(2)
	public void testUpdate() {

		System.out.println("Update...");
	}

	@Test
	@Order(3)
	public void testDelete() {

		System.out.println("Delete...");
	}

}

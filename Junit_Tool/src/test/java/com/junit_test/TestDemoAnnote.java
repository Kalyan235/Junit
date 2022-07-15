package com.junit_test;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDemoAnnote {

	@BeforeEach
	public void testSetup() {

		System.out.println("Setup before all ...");
	}

	@Test
	public void testSave() {

		System.out.println("Save...");
	}

	@Test
	public void testUpdate() {

		System.out.println("Update...");
	}

	@Test
	public void testDelete() {

		System.out.println("Delete...");
	}

	@AfterAll
	public static void testEnd() {

		System.out.println("Once at all End...");
	}

}

package com.junit_test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestTagAnno {

	@Test
	@Tag("dev")
	public void testA() {

		System.out.println("HELLO-TEST-A");
	}

	@Test
	@Tag("dev")
	public void testB() {

		System.out.println("HELLO-TEST-B");
	}

	@Test
	@Tag("prod")
	public void testC() {

		System.out.println("HELLO-TEST-C");
	}

}

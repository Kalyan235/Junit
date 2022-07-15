package com.junit_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TestAnnoDemo2 {

	@Test
	// @RepeatedTest(value = 3)
	@RepeatedTest(value = 3, name = "{displayName}-{currentRepetition}/{totalRepetition}")
	@DisplayName("MULTIPLE TEST")
	public void testShow(TestInfo info) {

		System.out.println("Show the details." + info.getDisplayName());
	}

}

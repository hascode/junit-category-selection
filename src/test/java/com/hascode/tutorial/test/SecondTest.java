package com.hascode.tutorial.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.hascode.tutorial.test.group.FastRunningTests;
import com.hascode.tutorial.test.group.SlowRunningTests;

public class SecondTest {
	@Test
	@Category({ FastRunningTests.class, SlowRunningTests.class })
	public void testSth() throws Exception {
		System.out.println("SecondTest.testSth run");
		assertTrue(true);
	}

	@Test
	@Category({ SlowRunningTests.class })
	public void testAnotherThing() throws Exception {
		System.out.println("SecondTest.testAnotherThing run");
		assertTrue(true);
	}
}

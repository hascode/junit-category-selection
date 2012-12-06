package com.hascode.tutorial.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.hascode.tutorial.test.group.FastTests;
import com.hascode.tutorial.test.group.SlowTests;

public class SecondTest {
	@Test
	@Category({ FastTests.class, SlowTests.class })
	public void testSth() throws Exception {
		System.out.println("SecondTest.testSth run");
		assertTrue(true);
	}

	@Test
	@Category({ SlowTests.class })
	public void testAnotherThing() throws Exception {
		System.out.println("SecondTest.testAnotherThing run");
		assertTrue(true);
	}
}

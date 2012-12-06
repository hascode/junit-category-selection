package com.hascode.tutorial.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.hascode.tutorial.test.group.FastTests;

@Category({ FastTests.class })
public class FirstTest {
	@Test
	public void testSth() throws Exception {
		System.out.println("FirstTest.testSth run");
		assertTrue(true);
	}

	@Test
	public void testAnotherThing() throws Exception {
		System.out.println("FirstTest.testAnotherThing run");
		assertTrue(true);
	}
}

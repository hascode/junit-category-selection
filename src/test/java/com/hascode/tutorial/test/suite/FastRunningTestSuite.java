package com.hascode.tutorial.test.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.hascode.tutorial.test.FirstTest;
import com.hascode.tutorial.test.SecondTest;
import com.hascode.tutorial.test.group.FastRunningTests;

@RunWith(Categories.class)
@IncludeCategory(FastRunningTests.class)
@SuiteClasses({ FirstTest.class, SecondTest.class })
public class FastRunningTestSuite {

}

package com.hascode.tutorial.test.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.hascode.tutorial.test.FirstTest;
import com.hascode.tutorial.test.SecondTest;
import com.hascode.tutorial.test.group.SlowRunningTests;

@RunWith(Categories.class)
@IncludeCategory(SlowRunningTests.class)
@SuiteClasses({ FirstTest.class, SecondTest.class })
public class SlowRunningTestSuite {

}

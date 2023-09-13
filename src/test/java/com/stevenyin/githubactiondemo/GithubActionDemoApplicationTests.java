package com.stevenyin.githubactiondemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
class GithubActionDemoApplicationTests {

	@Test
	public void test1() {
		String test1 = foo();
		Assertions.assertEquals(test1, "ABC");
	}

	private String foo() {
		return "ABC";
	}
}

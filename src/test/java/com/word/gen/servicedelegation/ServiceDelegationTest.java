package com.word.gen.servicedelegation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.word.gen.common.constants.CommonConstants;
import com.word.gen.servicedelegation.ServiceDelegation;

@RunWith(JUnit4.class)
public class ServiceDelegationTest {

	private ServiceDelegation serviceDelegation;

	@Before
	public void setUp() {

		serviceDelegation = new ServiceDelegation();
	}

	@Test
	public void testFindFizz() {
		Assert.assertEquals(CommonConstants.WORD_FIZZ, serviceDelegation.findFizBuzz(3));
		Assert.assertEquals(CommonConstants.WORD_FIZZ, serviceDelegation.findFizBuzz(6));
		Assert.assertEquals(CommonConstants.WORD_FIZZ, serviceDelegation.findFizBuzz(9));
	}

	@Test
	public void testBuzz() {
		Assert.assertEquals(CommonConstants.WORD_BUZZ, serviceDelegation.findFizBuzz(10));
		Assert.assertEquals(CommonConstants.WORD_BUZZ, serviceDelegation.findFizBuzz(20));
		Assert.assertEquals(CommonConstants.WORD_BUZZ, serviceDelegation.findFizBuzz(25));
	}

	@Test
	public void testBuzzFuzz() {
		Assert.assertEquals(CommonConstants.WORD_FIZZ_BUZZ, serviceDelegation.findFizBuzz(15));
		Assert.assertEquals(CommonConstants.WORD_FIZZ_BUZZ, serviceDelegation.findFizBuzz(30));
		Assert.assertEquals(CommonConstants.WORD_FIZZ_BUZZ, serviceDelegation.findFizBuzz(45));
	}

	@Test
	public void testInteger() {
		Assert.assertEquals("1", serviceDelegation.findFizBuzz(1));
		Assert.assertEquals("7", serviceDelegation.findFizBuzz(7));
		Assert.assertEquals("14", serviceDelegation.findFizBuzz(14));
		Assert.assertEquals("19", serviceDelegation.findFizBuzz(19));
		Assert.assertEquals("26", serviceDelegation.findFizBuzz(26));
	}

}

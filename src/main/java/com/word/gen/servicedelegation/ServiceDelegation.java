package com.word.gen.servicedelegation;

import java.util.function.IntPredicate;

import org.springframework.stereotype.Component;

import com.word.gen.common.constants.CommonConstants;

@Component
public class ServiceDelegation {
	
	/**
	 * This method will return Fizz if the input is divisible by 3
	 * return Buzz if the input is divisible by 5
	 * return FizzBuzz if the input is divisible by 3 & 5
	 * else return i
	 * @param i
	 * @return
	 */
	public String findFizBuzz(int i) {
		return divideFunction(3 * 5).test(i) ? CommonConstants.WORD_FIZZ_BUZZ
				: divideFunction(3).test(i) ? CommonConstants.WORD_FIZZ : divideFunction(5).test(i) ? CommonConstants.WORD_BUZZ : String.valueOf(i);
	}
	
	private static IntPredicate divideFunction(int number) {
		return n -> n % number == 0;
	}

}

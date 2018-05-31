package test;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class testRadixSort {

	@Test
	public void test() {
		String input = "2 3 5 + *";
		int expectedint = 17;
		int actualint = postfix(input);

		Assert.assertEquals(expectedint, actualint);
	}

	private int postfix(String input) {
		Stack<String> arithmeticStack = new Stack<>();
		Stack<Integer> numbersStack = new Stack<>();
		String[] inputArray = input.split(" ");
		for (String x : inputArray) {
			try {
				numbersStack.add(Integer.parseInt(x));
			} catch (NumberFormatException e) {
				arithmeticStack.add(x);
			}
		}
		
		int runningSum = numbersStack.pop();
		
		while(!arithmeticStack.isEmpty()){
			switch(arithmeticStack.pop()){
			case "+":
				runningSum += numbersStack.pop();
				break;
			case "-":
				runningSum -= numbersStack.pop();
				break;
			case "*":
				runningSum *= numbersStack.pop();
				break;
			case "/":
				runningSum /= numbersStack.pop();
				break;
			}
		}
		
		return runningSum;
	}
	
	@Test
	public void testSumEqualsTen() {
		int[] input = {2,3,5,1,2,4,7,5,2,6,9,8,9,3,4};
		String expected = "1 6";
		String actual = findSum(input);

		Assert.assertEquals(expected, actual);
	}

	private String findSum(int[] input) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < input.length; i++){
			if(hm.get(input[i]) != null){
				return hm.get(input[i]) + " " + i;
			} else {
				hm.put(10-input[i], i);
			}
		}
		return null;
	}

}

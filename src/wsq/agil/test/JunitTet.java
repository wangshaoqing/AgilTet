package wsq.agil.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Stack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitTet {

	// @Test
	// public void test() {

	// assertEquals(Arrays.asList(1,2),Agiltest.numdsplay(10));

	// }

	Stack stack;

	@Before
	public void test() {
		System.out.print("before");
		stack = new Stack();
	}

	@Test
	public void Given_stack_push_When_1_then_Pop_1() {

		stack.push(1);
		assertEquals(1, stack.pop());

	}

	@Test
	public void an_new_stack_Should_be_empty() {
		// given

		// when
		boolean empty = stack.empty();

		// then
		assertTrue(empty);

	}

	@Test
	public void 先进后出() {
		stack.push(1);
		stack.push(2);
		
		boolean bl = (int)stack.pop()==2;
		boolean bll = (int)stack.pop()==1;
		assertTrue(bll);
		Assert.assertTrue(bll);
		

	}

}

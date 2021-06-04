package com.csi;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticApplicationTest {

	ArithmeticApplication a1 = new ArithmeticApplication();

	@Test

	public void addTest() {

		Assert.assertEquals(10, a1.add(5, 5));

	}

	@Test
	public void subTest() {

		Assert.assertEquals(10, a1.sub(15, 5));

	}

	@Test
	public void mulTest() {

		Assert.assertEquals(25, a1.mul(5, 5));

	}

	@Test
	public void divTest() {

		Assert.assertEquals(1, a1.div(5, 5));

	}

}

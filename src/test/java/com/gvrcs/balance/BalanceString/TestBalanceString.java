package com.gvrcs.balance.BalanceString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.*;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TestBalanceString {
	
	@InjectMocks
	BalanceString balanceString;
	
	@Test
	public void testBalaceString_1() {
		String balance=balanceString.checkForBalancedString("[]");
		if("Balanced".equalsIgnoreCase(balance)) {
		assertTrue(true);
		}
		else
		{
			assertTrue(false);
		}		
	}
	
	@Test
	public void testBalaceString_2() {
		String balance=balanceString.checkForBalancedString("$$");
		if("Balanced".equalsIgnoreCase(balance)) {
		assertTrue(true);
		}
		else
		{
			assertTrue(false);
		}		
	}
	
	@Test
	public void testBalaceString_3() {
		String balance=balanceString.checkForBalancedString("[$]]");
		if("Balanced".equalsIgnoreCase(balance)) {
		assertTrue(true);
		}
		else
		{
			assertTrue(false);
		}		
	}
	
	@Test
	public void testBalaceString_4() {
		String balance=balanceString.checkForBalancedString("[[]$");
		if("Balanced".equalsIgnoreCase(balance)) {
		assertTrue(true);
		}
		else
		{
			assertTrue(false);
		}		
	}
	
	@Test
	public void testBalaceString_5() {
		String balance=balanceString.checkForBalancedString("[$]");
		if("Balanced".equalsIgnoreCase(balance)) {
		assertTrue(true);
		}
		else
		{
			assertTrue(false);
		}		
	}
	
	
	@Test
	public void testBalaceString_6() {
		String balance=balanceString.checkForBalancedString("]$[");
		if("Not Balanced".equalsIgnoreCase(balance)) {
		assertTrue(true);
		}
		else
		{
			assertTrue(false);
		}		
	}
	
}

package com.crossBrowserTesting.variables;

import com.crossBrowserTesting.utilities.RandomNumberGeneratorUtil;

public class SignInPage_Variables {
static RandomNumberGeneratorUtil randomUtil = new RandomNumberGeneratorUtil();
	
	// Variables - SignIn Page
	public static final String SignInPageTitle = "Login - My Store";
	public static final String NewUserEmailID = "DemoUser"+randomUtil.randomNumberGengerator_000_00()+"@gmail.com";
}

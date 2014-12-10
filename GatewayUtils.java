package com.takion.p2pe.tgateway.utils;

import java.util.Random;

public class GatewayUtils {
	public static String generateAuthId()
	{
		String authId = "mock";
		
		Random generator = new Random(System.currentTimeMillis());
		
		authId = String.valueOf(generator.nextInt(900000)+100000);
		
		return authId;
	}
}

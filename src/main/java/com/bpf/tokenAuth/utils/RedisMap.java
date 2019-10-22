package com.bpf.tokenAuth.utils;

import java.util.HashMap;
import java.util.Map;

public class RedisMap {
	public static final long TOKEN_EXPIRES_SECOND = 1800;
	public static final String TOKEN_EXPIRED = "TOKEN_EXPIRED";
	private static Map<String, String> tokens = new HashMap<>();

	public static void set(String id, String token) {
		token += System.currentTimeMillis();
		tokens.put(id, token);
	}
	public static String get(String id) {
		long now = System.currentTimeMillis();
		String token = tokens.get(id);
		long timestamp = Long.parseLong(token.substring(32));
		if((now-timestamp)/1000.0>TOKEN_EXPIRES_SECOND) {
			return TOKEN_EXPIRED;
		}
		return token;
	}
	public static boolean delete(String id) {
		return tokens.remove(id) != null;
	}
}

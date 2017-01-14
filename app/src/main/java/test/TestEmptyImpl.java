/*
 * Copyright (C) Automation Software Engineering Group
 *
 * This software is distributed WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND
 */
package test;

import util.StringUtils;

/**
 * @author jadson - jadsonjs@gmail.com
 *
 */
public class TestEmptyImpl implements TesteEmpty{

	/* (non-Javadoc)
	 * @see test.TesteEmpty#verify(java.lang.String)
	 */
	@Override
	public boolean verify(String s) {
		System.out.println(StringUtils.isEmpty(s));
		return StringUtils.isEmpty(s);
	}

	public static void main(String[] args) {
		new TestEmptyImpl().verify("test");
	}
}

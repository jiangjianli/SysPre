package com.jiang.common;

import org.apache.commons.lang3.StringUtils;

public class LevelUntil {

	public final static String SEP = ".";
	
	public final static String ROOT = "0";
	
	
	public static String caculateLevel(String parentlevel,int parentid) {
		if (StringUtils.isBlank(parentlevel)) {
			return ROOT;
		}else {
			
			return StringUtils.join(parentlevel,SEP,parentid);
		}
	}
}

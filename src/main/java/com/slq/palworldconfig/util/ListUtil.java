package com.slq.palworldconfig.util;

import java.util.List;

public class ListUtil {

	public static boolean isEmpty(List list) {
		return list == null || list.size() == 0;
	}

	public static boolean isNotEmpty(List list) {
		return !isEmpty(list);
	}

	public static boolean isSizeOne(List list) {
		return list != null && list.size() == 1;
	}

}

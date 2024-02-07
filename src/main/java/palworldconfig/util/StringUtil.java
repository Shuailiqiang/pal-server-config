package palworldconfig.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringUtil {


	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	public static boolean isEmpty(String str) {
		if (str == null || "".equals(str.trim()) || "null".equals(str.trim()) || "NULL".equals(str.trim())) {
			return true;
		}
		return false;
	}

	public static String getCurrTimeStr() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		DateFormat spf = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		return spf.format(timestamp);
	}

	public static String getCurrDateStr() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		DateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
		return spf.format(timestamp);
	}

}

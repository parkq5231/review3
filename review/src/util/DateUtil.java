package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateUtil {

	/**
	 * String->Date SimpleDateFormat.parse
	 */
	public static Date toDate(String date) {
		Date result = null;
		// to do
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		try {
			result = dateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Date->String SimpleDateFormat.format
	 */

	public static String toStr(Date date) {
		String result = null;
		// to do
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		result = dateFormat.format(date);
		return result;
	}

	/**
	 * Date를 주어진 포맷대로 String으로 변환 Date->String SimpleDateFormat.format
	 */

	public static String toStr(Date date, String format) {
		String result = null;
		// to do
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		result = dateFormat.format(date);

		return result;
	}

	public static Date addDay(Date date, int idx) {
		// to do
//		Date meetDay = new Date();
//		Calendar c = Calendar.getInstance();
//		c.setTime(date);
//		c.add(Calendar.DATE, 100);
//		meetDay = c.getTime();
		
		Date meetDay = new Date();
		LocalDateTime.from(meetDay.toInstant()).plusDays(100);
		return meetDay;
	}
}

package util;

import java.util.Date;

public class WrapperTest {

	public static void main(String[] args) {
		/**
		 * 1. String->int
		 */
//		int result = StringUtil.toInt("1234");
//		System.out.println(result);
		/**
		 * 2.int->String
		 */
//		String str = StringUtil.toStr(1234);
//		System.out.println(str);
//		
		/**
		 * 3. String -> 확장자 lastIndexOf,substring
		 * 
		 * @param ext
		 * @return 확장자
		 */
//		String ext = StringUtil.getExt("a.b.c.hwp");
//		System.out.println(ext);

		/**
		 * 4. String -> path, 파일명 파일에서 파일명 추출
		 * 
		 * @param s 파일명 "c:/img/item/p01.jpg
		 * @return 경로 p01.jpg
		 */
//		String fileName = StringUtil.getFilename("c:/img/item/p01.jpg");
//		System.out.println("파일명:" + fileName);

		/**
		 * 5.경로명에서 경로만 추출
		 * 
		 * @param s 경로명 "c:/img/item/p01.jpg
		 * @return 경로 c:/img/item
		 */
//		String path = StringUtil.getPath("c:/img/item/p01.jpg");
//		System.out.println("경로:" + path);

//		// String->Date
//
//		Date result = DateUtil.toDate("20210210");
//		System.out.println(result);
//
//		// Date->String
//
//		String str = DateUtil.toStr(new Date());
//		System.out.println(str);
//
//		// format->format
//		String str2 = DateUtil.toStr(new Date(), "G zZ yyyy/MM/dd E요일 a h시s분 1년 중 D일");
//		System.out.println(str2);
		
		/**
		 * 날짜계산 method:LocalDate
		 */
		Date today = new Date();
		Date meetDay = DateUtil.addDay(today, 100);
		System.out.println(today);
		System.out.println(DateUtil.toStr(meetDay));
		
	}

} // end of class

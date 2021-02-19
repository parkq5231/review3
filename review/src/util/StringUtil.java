package util;

public class StringUtil {
	// 1. String -> int
	public static int toInt(String s) { // Integer -> int
		if (s == null)
			return -1;
		return Integer.parseInt(s);
	}

	// 2. int -> String
	public static String toStr(int str) {
		return Integer.toString(str);
	}

	public static String getExt(String ext) {
		String result = "";
		int rs = ext.lastIndexOf(".");
		result = ext.substring(rs + 1);
		return result;
	}

	/**
	 * 4. String -> path, 파일명 파일에서 파일명 추출
	 * 
	 * @param s 파일명 "c:/img/item/p01.jpg
	 * @return 경로 p01.jpg
	 */
	public static String getFilename(String s) {
		String result = "";
		// to do
		int rs = s.lastIndexOf("/");
		result = s.substring(rs + 1);

		return result;
	}

	/**
	 * 경로명에서 경로만 추출
	 * 
	 * @param s 경로명 "c:/img/item/p01.jpg
	 * @return 경로 c:/img/item
	 */
	// path name
	public static String getPath(String s) {
		String result = "";
		// to do
		int rs = s.lastIndexOf("/");
		result = s.substring(0, rs);
		return result;
	}

}

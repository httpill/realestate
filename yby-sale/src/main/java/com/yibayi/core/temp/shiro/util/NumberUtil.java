package com.yibayi.core.temp.shiro.util;

import java.math.BigDecimal;
import java.util.regex.Pattern;

/**
 * 数字工具类
 * 
 * @author lwx
 */
public class NumberUtil {

	/**
	 * 判断是否为整数
	 * 
	 * @param str
	 *            传入的字符串
	 * 
	 * @return 是整数返回true,否则返回false
	 */
	public static boolean isNumber(String str) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
		return pattern.matcher(str).matches();
	}

	/**
	 * BigDecimal加法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static BigDecimal mulAdd(String v1, String v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.add(b2);
	}

	/**
	 * BigDecimal除法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static BigDecimal muldiv(String v1, String v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		if(b2.compareTo(new BigDecimal("0")) == 0) {
			return new BigDecimal("0");
		}
		return b1.divide(b2, 1, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * BigDecimal除法（保留小数点2）
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static BigDecimal muldiv2(String v1, String v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.divide(b2, 2, BigDecimal.ROUND_HALF_EVEN);
	}

	public static BigDecimal muldiv2(BigDecimal b1, BigDecimal b2) {
		return b1.divide(b2, 2, BigDecimal.ROUND_HALF_EVEN);
	}

	/**
	 * BigDecimal除法（保留小数点4）
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static BigDecimal muldiv4(String v2) {
		BigDecimal b1 = new BigDecimal("1");
		BigDecimal b2 = new BigDecimal(v2);
		return b1.divide(b2, 4, BigDecimal.ROUND_HALF_EVEN);
	}

	/**
	 * BigDecimal除法(10000)
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static BigDecimal muldivs(String v1, String v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		BigDecimal b3 = new BigDecimal("10000");

		BigDecimal bb = b1.divide(b2, 0);
		if (bb.compareTo(b3) > 0) {
			return bb.divide(b3, 1, BigDecimal.ROUND_HALF_UP);
		}
		return bb.divide(b3, 4, BigDecimal.ROUND_HALF_EVEN);
	}

	public static BigDecimal muldivs(BigDecimal b1, BigDecimal b2) {
		BigDecimal b3 = new BigDecimal("10000");

		BigDecimal bb = b1.divide(b2, 0);
		if (bb.compareTo(b3) > 0) {
			return bb.divide(b3, 1, BigDecimal.ROUND_HALF_UP);
		}
		return bb.divide(b3, 4, BigDecimal.ROUND_HALF_EVEN);
	}

	/**
	 * BigDecimal除法(100)
	 *
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static BigDecimal muldivs100(String v1, String v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		BigDecimal b3 = new BigDecimal("1");

		BigDecimal bb = b1.divide(b2, 0);
		if (bb.compareTo(b3) > 0) {
			return bb.divide(b3, 1, BigDecimal.ROUND_HALF_UP);
		}
		return bb.divide(b3, 4, BigDecimal.ROUND_HALF_EVEN);
	}

	/**
	 * BigDecimal乘法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static BigDecimal mul(String v1, String v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.multiply(b2);
	}
	public static BigDecimal mul(BigDecimal b1, BigDecimal b2) {
		return b1.multiply(b2);
	}

	public static BigDecimal mul10000(String v1) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(10000);
		return b1.multiply(b2).setScale(1);
	}

	/**
	 * BigDecimal乘法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static BigDecimal mulTwo(String v1, String v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		BigDecimal bb = b1.multiply(b2);
		BigDecimal b3 = new BigDecimal("10000");
		if (bb.compareTo(b3) > 0) {
			return bb.divide(b3, 1, BigDecimal.ROUND_HALF_UP);
		}
		return bb.divide(b3, 4, BigDecimal.ROUND_HALF_EVEN);
	}

	/**
	 * BigDecimal除法
	 * 
	 * @param v1
	 * @return
	 */
	public static BigDecimal muls(String v1) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b3 = new BigDecimal("10000");
		if (b1.compareTo(b3) > 0) {
			return b1.divide(b3, 1, BigDecimal.ROUND_HALF_UP);
		}
		return b1.divide(b3, 1, BigDecimal.ROUND_HALF_EVEN);
	}

	public static void main(String[] args) {
		System.out.println(muldiv("50000","4.6271"));
	}
}

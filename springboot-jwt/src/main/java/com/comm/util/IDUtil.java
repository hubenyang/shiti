//package com.comm.util;
//
//import java.util.UUID;
//
///**
// * UUID工具类
// *
// */
//public class IDUtil {
//
//	/**
//	 * 获得一个UUID
//	 *
//	 * @return StringUUID
//	 */
//	public static String getUUID() {
//		String s = UUID.randomUUID().toString();
//		// 去掉“-”符号
//		return s.replaceAll("-", "");
//	}
//
//	/**
//	 * 获得一个指定长度的大写UUID
//	 *
//	 * @param length 长度不大于32
//	 * @param charcase 大小写，1：小写；2：大写
//	 * @return StringUUID
//	 */
//	public static String getShortUUID(int length, int charcase) {
//		String result = getUUID().substring(0, length);
//		if (charcase == 1) {
//			result = result.toLowerCase();
//		}
//		if (charcase == 2) {
//			result = result.toUpperCase();
//		}
//		return result;
//	}
//
//	/**
//	 * 获取优惠券序列号
//	 * @return
//	 */
////	public static String getCouponsNum () {
////		return DateUtils.getCurrentDateStr(DateUtils.YYYYMMDDHHMMSS) + RandomUtil.getRandomNumber(4);
////	}
//
//	public static void main(String[] args) {
//		System.out.println(getUUID());
//	}
//}

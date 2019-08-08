/**
 * @author jgybzx
 * @data 2019年8月7日 下午3:44:04
 * @version V1.0
 * @description   输入年月日，判断今天是今年的第几天
 */
package demo.day8.test;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		/**
		 * 1、输入年月日，year month day
		 * 2、编写方法计算第几天并返回
		 * 	分析:先把当前月之前的月的天数加起来，再加上day
		 *    1)首先判断year是   平年？闰年（能被4整除切不能被100整除）或者能被400整除
		 *    if(((year%4==0)&&(year%100==!0))||(year%400==0))
		 *    目的是 平年和闰年的2月份天数不同
		 *    
		 *    
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("输入年月日");
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		int count = getSumDay(year, month, day);
		System.out.println(count);
	}

	private static int getSumDay(int year, int month, int day) {
		int days = 0;
		// 利用循环，把每个月的天数加起来
		for (int i = 1; i < month; i++) {
			days += getMonthDay(year, i);// 自定义方法，返回一年每个月的天数
		}
		days += day;
		return days;
	}

	private static int getMonthDay(int year, int month) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			if(leapYear(year)==1)
				return 29;
			else
				return 28;
		default:
			return 30;

		}
		
	}
	private static int leapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			return 1;
		} else {
			return 0;
		}
	}
}

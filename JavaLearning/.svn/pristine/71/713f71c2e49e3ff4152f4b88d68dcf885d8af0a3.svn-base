/**
 * @author jgybzx
 * @data 2019-7-27 上午8:36:42
 * @version 版本号
 * @TODO 描述
 */
package demo.day3;

import java.util.Scanner;

/**
 * @author Jgybz
 * 
 */
public class Demo {
	public static void main(String[] args) {
		Demo1 println = new Demo1();

		/*
		 * Scanner input = new Scanner(System.in); int a = input.nextInt(); int
		 * b = input.nextInt(); int c = input.nextInt(); println.maxNum(a, b,
		 * c);
		 */

		// println.println();

		//println.moreThanFive();
		//println.moreThanFive1();
		println.fibonacci();
	}
}

class Demo1 {
	// 输出三个数的最大值
	public void maxNum(int a, int b, int c) {
		int t;
		t = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("max=" + t);
	}

	// 练习while循环
	public void println() {
		int i = 10;
		while (i < 100) {
			System.out.print(" " + i);
			i++;
		}
		System.out.print("\n");
		int j = 50;
		while (j <= 100) {
			if (j % 2 == 1) {
				System.out.print(" " + j);
			}
			j++;
		}
		System.out.print("\n");
		int k = 100;
		int count = 0;
		while (k <= 999) {
			if (k % 4 == 0) {
				count++;
				System.out.print(" " + k);
				if (count % 5 == 0)
					System.out.print("\n");
			}
			k++;
		}
	}

	// 练习循环中的break，输入n个数，当输入0时，程序判断，停止输入，求大于5的数的和。
	public void moreThanFive() {
		int num;
		int sum = 0;
		int count=0;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("请输入一个数字:");
			num = input.nextInt();
			if (num == 0) {
				break;
			}
			if (num > 5) {
				sum += num;
			}
		}
		
		System.out.println("大于5的数的和:" + sum+" 个数"+count);
		System.out.println("请输入一个数字:");
	}

	// 练习循环中的continue，输入5个数，当输入0时，程序判断，停止输入，求大于5的数的和。
	public void moreThanFive1() {
		int num;
		int sum = 0;
		int count=0;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("请输入一个数字:");
			num = input.nextInt();
			if (num == 0) {
				continue;
			}
			if (num > 5) {
				sum += num;
				count++;
			}
		}
		System.out.println("大于5的数的和:" + sum+" 个数"+count);
	}

	//输入前20个斐波那契数列
	public void fibonacci (){
		int a,b,c;
		a=1;
		b=1;
		int count=0;
		System.out.print("输入想要显示的个数(大于2):");
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		System.out.println(a);
		System.out.println(b);
		while(count<n-2){
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			count++;
		}
		
	}
}

/**
 * @author jgybzx
 * @data 2019-7-29 上午8:55:18
 * @version 版本号
 * @TODO 描述
 */
package demo.day4;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Demo1 demo1=new Demo1();
		//demo1.splitNumber();
		demo1.binaryNumber();
		Student student= null;
		student = new Student();
		
	}
}
class Demo1{
	// 整数拆分，倒序输出
	public void splitNumber() {
		int num;
		Scanner input = new Scanner(System.in);
		num=input.nextInt();
		int a,b;
		a=num%10;
		b=num/10;
		System.out.print(a+" ");
		while(b!=0){
			a=b%10;
			b=b/10;
			System.out.print(a+" ");
		}
	}
	
	//十进制=>二进制
	public void binaryNumber() {
		int num;
		Scanner input = new Scanner(System.in);
		while(true)
		{
			int[] number={0,0,0,0,0,0,0,0};//将结果倒序存入数组，之后输出
			int i=7;
			num=input.nextInt();
			int a,b;
			a=num%2;
			b=num/2;
			System.out.print(a+" ");
			number[i]=a;
			while(b!=0){
				a=b%2;
				b=b/2;
				number[--i]=a;//debug得知，此处需要用--i
				System.out.print(a+" ");
			}
			System.out.print("\n");
			System.out.println(Arrays.toString(number));
		}
	}

	
}

/**
 * @author jgybzx
 * @data 2019-7-26 下午3:03:53
 * @version 版本号
 * @TODO 描述
 */
package demo.day2;

import java.util.Scanner;

/**
 * @author Jgybz
 * 
 */
public class Demo {
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		demo1.demo1();
	}
}

class Demo1 {
	public void demo1() {
		/*
		 * long n=123456789012L;//整数默认类型为int，使用long的时候，一定要加上L
		 * System.out.println(n); char i; i=0;
		 * i=65535;//字符负值整数时，是字符的ASCII码，范围0~65535 System.out.println(i+"asas");
		 * double j; j=1; float jj; jj=0.1F; System.out.println(j);
		 * System.out.println(jj); System.out.println(3*0.1);
		 * System.out.println(3*0.1==0.3); System.out.println(0.1*3==0.3);
		 * System.out.println("0.1*1="+0.1*1+"    "+(0.1*1==0.1));
		 * System.out.println("0.1*2="+0.1*2+"    "+(0.1*2==0.2));
		 * System.out.println("0.1*3="+0.1*3+"    "+(0.1*3==0.3));
		 * System.out.println("0.1*4="+0.1*4+"    "+(0.1*4==0.4));
		 * System.out.println("0.1*5="+0.1*5+"    "+(0.1*5==0.5));
		 * System.out.println("0.1*6="+0.1*6+"    "+(0.1*6==0.6));
		 * System.out.println("0.1*7="+0.1*7+"    "+(0.1*7==0.7));
		 * System.out.println("0.1*8="+0.1*8+"    "+(0.1*8==0.8));
		 * System.out.println("0.1*9="+0.1*9+"    "+(0.1*9==0.9));
		 */

		/*
		 * int i,j,k,num; num=123; i=num%10; j=num/10%10; //k=num/100%10;
		 * k=num/100; System.out.println(i+j+k);
		 */

		/*
		 * int a=5,s; s=(int)((a*10+5)/2+3.141); System.out.println(s);
		 */

		/*
		 * System.out.println("输入四位:"); int s; Scanner intput = new
		 * Scanner(System.in);//屏幕输入 s = intput.nextInt(); int a, b, c, d; a = s
		 * % 10; b = s / 10 % 10; c = s / 100 % 10; d = s / 1000 % 10; int sum =
		 * a + b + c + d; System.out.println("四位数之和" + sum); if (sum > 20) {
		 * System.out.println("幸运顾客"); } else { System.out.println("不是幸运顾客"); }
		 */

		/*
		 * int a; String b; Scanner input = new Scanner(System.in);
		 * a=input.nextInt(); System.out.println("数字："+a); b=intput.next();
		 * System.out.println("字符串或字符："+b); char c= b.charAt(0);
		 * System.out.println("第一个字符"+c);
		 */

		/*
		 * int a,b; Scanner input = new Scanner(System.in); a=input.nextInt();
		 * b=input.nextInt(); int sum =a+b; System.out.println("和是:"+sum);
		 */
		// while(true){
		/*
		 * int a; char c; System.out.println("输入ASCII码："); Scanner inPut = new
		 * Scanner(System.in); a = inPut.nextInt(); c = (char) a;
		 * System.out.println("对应的字符为：" + c);
		 */

		// }

		/*
		 * int a; Scanner input = new Scanner(System.in); a = input.nextInt();
		 * switch (a) { case 1: System.out.println("第一名"); break; case 2:
		 * System.out.println("第二名"); break; default: System.out.println("垃圾");
		 * }
		 */
		/*
		 * int a; String s; Scanner input=new Scanner(System.in);
		 * System.out.println("请输入月份"); a=input.nextInt();
		 * 
		 * 
		 * if(a>=4&&a<=10) { System.out.println(a+"月属于旺季，请输入舱位：");
		 * s=input.next(); if("头等舱".equals(s)) { System.out.println("旺季头等舱打九折");
		 * }else if("经济舱".equals(s)) { System.out.println("旺季经济舱打八折"); } }else {
		 * System.out.println("请输入舱位"); s=input.next(); if("头等舱".equals(s)) {
		 * System.out.println("淡季头等舱打五折"); }else if("经济舱".equals(s)) {
		 * System.out.println("淡季经济舱打四折"); } }
		 */

		/*
		 * int a, n; Scanner input = new Scanner(System.in);
		 * System.out.println("输入一个数字(1~7)代表今天是星期几"); a = input.nextInt(); if (a
		 * > 0 && a < 7) { System.out.println("输入间隔的天数n"); n = input.nextInt();
		 * int s = (a + n) % 7; System.out.println(n + "天之后是"); switch (s) {
		 * case 0: System.out.println("星期日"); break; case 1:
		 * System.out.println("星期一"); break; case 2: System.out.println("星期二");
		 * break; case 3: System.out.println("星期三"); break; case 4:
		 * System.out.println("星期四"); break; case 5: System.out.println("星期五");
		 * break; case 6: System.out.println("星期六"); break; } } else
		 * System.out.println("输入的数字不合理");
		 */
		
		//输出金字塔
		int i;
		Scanner input = new Scanner(System.in);

		i = input.nextInt();
		for (int a = 1; a < i + 1; a++) 
		{
			for (int c = 0; c < i - a; c++) 
			{
				System.out.print("   ");
			}
			for (int b = 0; b < (2 * a - 1); b++) 
			{
				System.out.print("\u2605");
			}
			System.out.print("\n");
		}
	}
}

/**
 * @author jgybzx
 * @data 2019-8-3 上午9:13:40
 * @version 版本号
 * @TODO 描述
 */
package demo.day7.first;

//测试修改
import java.util.Scanner;

//递归计算，n！
public class Demo {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		while (true) {
			int n = inputScanner.nextInt();
			System.out.println(mul(n));
		}
		//System.out.println(mul(7));
		
	}
/**
 * 
 * @param n
 * @return
 */
	public static int mul(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * mul(n - 1);
	}
}

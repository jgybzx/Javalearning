/**
 
 * @author jgybzx
 * @data 2019-7-25 ÏÂÎç2:21:04
 * @version °æ±¾ºÅ
 * @TODO ÃèÊö
 */
package demo.day1;

/**
 * @author Jgybz
 * 
 */
public class DemoPrintln {
	public static void main(String[] args) {
		PrintlnTest printlntest = new PrintlnTest();
		printlntest.printlnTest();
	}

}

class PrintlnTest{
	public void printlnTest(){
		int[] a = new int[11];
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			a[i]=i;
			sum+=a[i];
			//System.out.println(a[i]);
		}
		System.out.println(sum+"\u0000"+sum);
		System.out.println(sum+"\u2605"+sum);
		//return sum;
	}
}


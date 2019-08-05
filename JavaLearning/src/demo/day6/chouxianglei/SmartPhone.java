/**
 * @author jgybzx
 * @data 2019-7-31 下午4:57:06
 * @version 版本号
 * @TODO 描述
 */
package demo.day6.chouxianglei;

/**
 * @author Jgybz
 *
 */
public class SmartPhone extends Phone {

	/* (non-Javadoc)
	 * @see demo.day6.chouxianglei.Phone#call()
	 */
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("屏幕输入号码");
	}

	/* (non-Javadoc)
	 * @see demo.day6.chouxianglei.Phone#message()
	 */
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("屏幕输入文字");
	}

}

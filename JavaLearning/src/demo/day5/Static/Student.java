/**
 * @author jgybzx
 * @data 2019-7-30 上午10:28:58
 * @version 版本号
 * @TODO 描述
 */
package demo.day5.Static;

public class Student {
	static {
		address = "上海";
	}

	public Student() {
	}

	String name;
	static String address;

	public Student(String name) {
		super();
		this.name = name;
	}

}

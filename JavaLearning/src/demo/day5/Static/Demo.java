/**
 * @author jgybzx
 * @data 2019-7-30 上午10:06:32
 * @version 版本号
 * @TODO 描述
 */
package demo.day5.Static;

public class Demo {
	public static void main(String[] args) {
		System.out.println(Student.address);// 可以用类名直接访问静态变量，因为静态变量与类同生死，
		Student stu = new Student();
		System.out.println(stu.address);// 当然也可以实例化对象，之后访问,一般直接用类直接访问
	}
}

/**
 * @author jgybzx
 * @data 2019-7-30 上午11:06:39
 * @version 版本号
 * @TODO 描述
 */
package demo.day5.Extends;

public class Animals {
	public Animals() {
		System.out.println("执行父类 无参 构造");
	}

	String name ;// 动物名字
	int age;// 动物年龄
	String color;// 动物颜色

	public Animals(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
		System.out.println("执行父类 有参 构造");
	}

	public void show() {
		System.out.println("名字:" + name + "\n年龄:" + age + "\n颜色" + color);
	}

	public void speak() {
		System.out.println("这是父类");
	}

}

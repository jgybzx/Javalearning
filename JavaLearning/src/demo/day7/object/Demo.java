/**
 * @author jgybzx
 * @data 2019年8月3日 下午3:44:02
 * @version V1.0
 * @description 
 */
package demo.day7.object;

public class Demo {
	public static void main(String[] args) {
		Person person = new Person("输出", 12, '男');
		// 直接打印查看输出
		System.out.println(person);
		System.out.println(person.toString());
		/**
		 * 输出结果:demo.day7.object.Person@4f0ab3f2 完整类名+ @ +哈希码（十六进制形式） 
		 * 分析:
		 * 				1)使用System.out.println(person)打印一个对象时，println()会把对象转换为
		 * 					一个字符串再打印，调用了String.valueOf(x)方法转换为字符串
		 * 
		 * 				2)进一步检查String中的valueOf(x)方法时，发现调用的是toString()方法。
		 * 
		 * 				3)toString()是object类中继承而来的，返回内容如下:
		 * 
		 * 				return getClass().getName() + "@" + Integer.toHexString(hashCode());
		 * 						     所以就是： 完整类名 + @ + 哈希码的十六进制形式
		 * 
		 * 结论:使用System.out.println(person)打印一个对象时,调用的是对象的toString()方法，由Object继承而来
		 * 
		 * 				所以 System.out.println(person) 和
		 * 				System.out.println(person.toString());返回结果是一样的。
		 * 
		 */
		// 如果利用toString()返回的不是 完整类名 + @ + 哈希码的十六进制形式，那就说明此类重写了这个方法。
		String text = "asas";
		System.out.println(text);// 输出:asas，说明String重写了toString.
		System.out.println(text.hashCode());
	}
}

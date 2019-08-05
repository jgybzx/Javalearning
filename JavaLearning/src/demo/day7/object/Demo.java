/**
 * @author jgybzx
 * @data 2019年8月3日 下午3:44:02
 * @version V1.0
 * @description 
 */
package demo.day7.object;

public class Demo {
	public static void main(String[] args) {
		Person person=new Person("输出", 12, '男');
		//直接打印查看输出
		System.out.println(person);
		/**
		 *  输出结果:demo.day7.object.Person@4f0ab3f2
		 *  					      完整类名+ @ +十六进制符
		 *  
		 *  github修改提交测试
		 */
	}
}

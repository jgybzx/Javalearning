/**
 * @author jgybzx
 * @data 2019-7-30 上午8:33:09
 * @version 版本号
 * @TODO 描述
 */
package demo.day5.books;

/*1.编写图书类：
 属性：编号，名称，单价，数量,  出版社,  作者
 定义方法：显示图书的信息（图书编号，名称，单价，数量)
 测试类：
 创建图书对象通过调用带参构造方法完成对属性赋值，并调用显示信息方法
 创建图书对象调用无参构造方法，并调用显示信息方法
 */
public class BookTest {
	public static void main(String[] args) {
		Books books=new Books(12,"非暴力沟通",12.2,2,"华夏出版社","马歇尔·卢森堡");
		books.showInfo();
	}
}

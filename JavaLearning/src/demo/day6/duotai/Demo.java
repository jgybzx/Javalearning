/**
 * @author jgybzx
 * @data 2019-7-31 上午11:12:43
 * @version 版本号
 * @TODO 描述
 */
package demo.day6.duotai;

//实现主人喂宠物，本题只考虑调用父类的方法和子类的独有方法
public class Demo {

	public static void main(String[] args) {
		/*
		 * Pet dog=new Dog(); Pet cat =new Cat();
		 */
		Master master = new Master();
		master.feed(new Dog());
		master.feed(new Cat());

		Pet pet = new Dog();// 多态
		// Dog dog = (Dog) pet;// 向下转型，也叫做强制类型转换，

		// 以下语句会运行报错，此时pet存放的是dog的地址，不能再强转成cat。
		/*
		 * Cat cat=(Cat)pet; cat.catching();
		 */
		pet = new Cat();
		pet = new Dog();
		
		if (pet instanceof Dog) {// 为了避免出现问题，使用instanceof 关键字进行判断当前是否指向你要用的对象
			Dog dog1 = (Dog) pet;
			dog1.play();
		} else if (pet instanceof Cat) {
			Cat cat = (Cat) pet;
			cat.catching();
		}

	}

}

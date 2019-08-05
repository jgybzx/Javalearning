/**
 * @author jgybzx
 * @data 2019-7-31 上午9:26:58
 * @version 版本号
 * @TODO 描述
 */
package demo.day6;

import java.util.*;

/*2、某汽车租赁公司有多种汽车可以出租，计算汽车的租金
 Vehicle 是所有车的父类，属性：品牌，车牌号，
 方法：返回总租金的方法  :public double getSumRent(int days){}
 Car：小轿车类是Vehicle的子类，属性：车型（两厢，三厢，越野)
 两厢：每天300，三厢：每天350，越野：每天500 
 Bus：多座汽车，属性：座位数
 座位数<=16 :每天400
 座位数 >16 :每天 600
 测试类：
 根据用户选择不同车，计算总租金并输出总租金。 */

public class Demo {

	static int days = 0;

	public static void main(String[] args) {

		Demo.method();

	}

	public static void method() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入租借天数:");
		days = input.nextInt();
		System.out.println("请选择1:Car 2:Bus");
		int flag = 1;
		int num = 0;
		while (flag == 1) {

			num = input.nextInt();
			if (num != 1 && num != 2) {
				System.out.println("未找到所选车型，请重新输入:1:Car 2:Bus");
				flag = 1;
			} else
				flag = 0;
		}
		choose2(num);

	}

	public static void choose2(int num) {
		Vehicle car;
		Bus bus;
		int carType;
		Scanner input = new Scanner(System.in);
		if (num == 1) {
			System.out.println("请选择Car车型1:两厢2:三厢3:越野");
			System.out.println("(注:两厢：每天300，三厢：每天350，越野：每天500)");
			carType = input.nextInt();
			switch (carType) {
			case 1:
				car = new Car("高尔夫", "jgybzx", "两厢");
				System.out.println("总租金:" + car.getSumRent(days));
				break;
			case 2:
				car = new Car("桑塔纳", "jgybzx", "三厢");
				System.out.println("总租金:" + car.getSumRent(days));
				break;
			case 3:
				car = new Car("牧马人", "jgybzx", "越野");
				System.out.println("总租金:" + car.getSumRent(days));
				break;
			default:
				System.out.println("未找到！请重新选择！");
				choose2(num);
				break;

			}
		} else if (num == 2) {
			System.out.println("请输入Bus座位数:");
			System.out.println("(座位数<=16 :每天400;座位数 >16 :每天 600)");
			int seating;
			seating = input.nextInt();
			if (seating > 16) {
				bus = new Bus("旅游大巴", "jgybzx", seating);
				System.out.println("总租金:" + bus.getSumRent(days));
			} else {
				bus = new Bus("迷你大巴", "jgybzx", seating);
				System.out.println("总租金:" + bus.getSumRent(days));
			}
		}
	}
}

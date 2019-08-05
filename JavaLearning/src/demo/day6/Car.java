/**
 * @author jgybzx
 * @data 2019-7-31 上午9:42:20
 * @version 版本号
 * @TODO 描述
 */
package demo.day6;

/*Car：小轿车类是Vehicle的子类，属性：车型（两厢，三厢，越野)
 两厢：每天300，三厢：每天350，越野：每天500 */
public class Car extends Vehicle {
	public Car() {
	}

	String carType;

	public Car(String kind, String id, String carType) {
		super(kind, id);
		this.carType = carType;
	}

	public double getSumRent(int days) {
		switch (this.carType) {
		case "两厢":
			return days * 300;
		case "三厢":
			return days * 300;
		case "越野":
			return days * 300;
		default:
			return 0;
		}
	}
}

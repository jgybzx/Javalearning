/**
 * @author jgybzx
 * @data 2019-7-31 上午9:42:42
 * @version 版本号
 * @TODO 描述
 */
package demo.day6;

/*Bus：多座汽车，属性：座位数
 座位数<=16 :每天400
 座位数 >16 :每天 600*/
public class Bus extends Vehicle {
	public Bus() {
	}

	int seating;

	public Bus(String kind, String id, int seating) {
		super(kind, id);
		this.seating = seating;
	}

	public double getSumRent(int days) {
		if (this.seating > 16) {
			return days * 600;
		} else {
			return days * 400;
		}
	}
}

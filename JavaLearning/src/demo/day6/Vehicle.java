/**
 * @author jgybzx
 * @data 2019-7-31 上午9:34:11
 * @version 版本号
 * @TODO 描述
 */
package demo.day6;

/*Vehicle 是所有车的父类，属性：品牌，车牌号，
 方法：返回总租金的方法  :public double getSumRent(int days){}*/
public class Vehicle {
	public Vehicle() {
	}

	String kind;
	String id;

	public Vehicle(String kind, String id) {

		this.kind = kind;
		this.id = id;
	}

	public double getSumRent(int days) {
		return 0.0;
	}
}

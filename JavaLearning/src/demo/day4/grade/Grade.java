/**
 * @author jgybzx
 * @data 2019-7-29 下午7:39:35
 * @version 版本号
 * @TODO 描述
 */
package demo.day4.grade;

/**
 * @author Jgybz
 *
 */
public class Grade {
	public Grade(){}
	
	private int no;
	private String name;
	private String address;
	
	public Grade(int no,String name,String address){
		this.no=no;
		this.name=name;
		this.address=address;
	}

	public void print() {
		System.out.println("班级编号" + no + "\t班级名字" + name + "\t班级地址" + address);
	}
	
	//==========================================================================
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	

	
	
}

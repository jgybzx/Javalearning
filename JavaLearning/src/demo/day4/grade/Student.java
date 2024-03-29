/**
 * @author jgybzx
 * @data 2019-7-29 下午7:49:18
 * @version 版本号
 * @TODO 描述
 */
package demo.day4.grade;

/**
 * @author Jgybz
 * 
 */
public class Student {
	public Student() {
	}

	private int no;
	private String name;
	private char sex;
	private int age;
	Grade grade;

	public Student(int no, String name, char sex, int age, Grade grade) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
	}

	public void println() {
		System.out.println("学生编号:" + no + "\t学生名字:" + name + "\t学生性别:" + sex
				+ "\t学生年龄:" + age);
		grade.print();
	}

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
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

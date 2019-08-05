/**
 * @author jgybzx
 * @data 2019-7-29 下午7:39:19
 * @version 版本号
 * @TODO 描述
 */
package demo.day4.grade;

public class Demo1 {
	public static void main(String[] args){
		//Grade grade=new Grade(10,"JAVA","北京");
		//Student student=new Student(1234,"学生名字",'男',18,grade);
		Student student=new Student(1234,"学生名字",'男',18,new Grade(10,"JAVA","北京"));
		student.println();
		
		
	}
}

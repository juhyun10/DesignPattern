package chap01.objectOrientedModeling;

/**
 * �ܹ��� �������� (üũ����Ʈ p.28)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class P28_Main {
	public static void main(String[] args) {
		P28_Student stu = new P28_Student();
		P28_Course course1 = new P28_Course("����");
		P28_Course course2 = new P28_Course("����");
		P28_Course course3 = new P28_Course("����");
		
		stu.registerCourse(course1);
		stu.registerCourse(course2);
		stu.registerCourse(course2);
		stu.registerCourse(course3);
		
		for (P28_Course aa : stu.getCourses()) {
			System.out.println("1 - " + aa.getName());
		}
		
		stu.dropCourse(course2);
		
		for (P28_Course aa : stu.getCourses()) {
			System.out.println("2 - " + aa.getName());
		}
	}
}
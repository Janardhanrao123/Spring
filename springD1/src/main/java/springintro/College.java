package springintro;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class College {

	public static void main(String[] args) {
		
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student student = ctx.getBean("Student",Student.class);
		student.getName();
		
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getAge());
		System.out.println(student.getAddress().getStreet());
		System.out.println(student.getHobbies());
		System.out.println(student.getMarksmap());
		System.out.println(student.getAddressMap().keySet());
		
			

	}

}

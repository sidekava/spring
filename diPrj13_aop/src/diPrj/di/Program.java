package diPrj.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import diPrj.di.ui.ExamConsole;

public class Program {
	public static void main (String[] args) {
		
		/*
		 * AOP란?
		 * Aspect Oriented Programming
		 * 스프링이 아니고 방법론
		 * AOP를 구현 할 때 스프링이 도움을 줌.
		 * 사용자 요구사항을 수반하기 위해 주 업무 로직 외의 코드가 들어간다. 
		 * 주 업무 로직을 만들기 위해 들어가게 되는 코드. 
		 * 개발이나 운영에 따른 부가적인 코드로써 이부분은 사용자는 모른다. 
		 * 그런 부분이 보조 업무, 곁다리 업무 등으로 볼 수 있다.
		 * 그렇듯 사용자 관점, 운영자 관점, 개발자 관점의 로직이 있을 것이다.
		 * 각각의 관점 단위의 업무를 나누어 프로그램을 진행하고 결합하는 것에 대한 방법론이 AOP
		 * 로그처리, 권한, 보안처리, 트랜잭션 처리 등의 코드가 필요할 것이다.
		 * 그러한 보조 로직은 앞이나 뒤, 혹은 위, 아래에 위치한다. 즉 주 로직의 처음과 끝부분에 있다.
		 * 보조로직이 프락시를 사용하게 만든다. 이것이 cross-cutting Concern
		 */
		
		/*
		 * 구현방식
		 * 프락시 클래스에 Cross-cutting Concern을 구현한다. 
		 */
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(NewlecDIConfig.class); 
//				new ClassPathXmlApplicationContext("diPrj/di/setting.xml");
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
//		ExamConsole console = new GridExamConsole(); // GridExamConsole이 exam을 조립하고 있다. exam이 dependency가 된 것.
		ExamConsole console = (ExamConsole) context.getBean("console");
//		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List <Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
//		exams.add(new NewlecExam(1, 1, 1, 1));
		
//		for (Exam e : exams) System.out.println(e);
	}
}

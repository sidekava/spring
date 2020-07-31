package diPrj.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import diPrj.di.entity.Exam;
import diPrj.di.entity.NewlecExam;
import diPrj.di.ui.ExamConsole;
import diPrj.di.ui.GridExamConsole;
import diPrj.di.ui.InlineExamConsole;

public class Program {
	public static void main (String[] args) {
		
		/* ClassPathXmlApplicationContext -> 클래스 기준 경로 현 경로 기준 ex : "../setting.xml"
		 * FileSystemXmlApplicationContext -> 파일 시스템 기준 경로 ex : C:~~
		 * XmlWebApplicationContext -> 
		 * AnnotationConfigApplicationContext -> Web url
		 */
		/*
		Exam exam = new NewlecExam();
		console.setExam(exam);
		*/
		
		//ApplicationContext를 사용하기 위해선 spring library가 필요
		//Maven통해 변경 -> project 우클릭 -> Configure -> Convert to Maven Project
		//
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("diPrj/di/setting.xml");
		
//		ExamConsole console = new GridExamConsole(); // GridExamConsole이 exam을 조립하고 있다. exam이 dependency가 된 것.
//		ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}
}

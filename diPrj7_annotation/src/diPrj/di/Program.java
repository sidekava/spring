package diPrj.di;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import diPrj.di.entity.Exam;
import diPrj.di.entity.NewlecExam;
import diPrj.di.ui.ExamConsole;
import diPrj.di.ui.GridExamConsole;
import diPrj.di.ui.InlineExamConsole;

public class Program {
	public static void main (String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("diPrj/di/setting.xml");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
//		ExamConsole console = new GridExamConsole(); // GridExamConsole이 exam을 조립하고 있다. exam이 dependency가 된 것.
		ExamConsole console = (ExamConsole) context.getBean("console");
//		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List <Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
//		exams.add(new NewlecExam(1, 1, 1, 1));
		
//		for (Exam e : exams) System.out.println(e);
	}
}

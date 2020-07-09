package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
	/* 여기에 injection을 setter한다. */
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	@Autowired
	public InlineExamConsole(@Qualifier("exam2")Exam exam) {
		System.out.println("overload constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}
	

	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
	}

}

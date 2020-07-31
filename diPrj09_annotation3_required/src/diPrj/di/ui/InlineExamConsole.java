package diPrj.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import diPrj.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
//	@Autowired
//	Autowired를 사용했다면 xml파일에 주입받을 bean은 필수.
//	하지만 없으면 그냥 없는대로 null로 하고 error를 발생시키지 않고 싶다면 required를 사용한다.
	@Autowired(required = false)
	@Qualifier("exam2")
	private Exam exam; 
	
	
	public InlineExamConsole() {
		//이 생성자가 없으면 exam만 생성한 것으론 DI가 안된다. 
		//필드에 autowired를 할 때 기본 생성자 없이 오버로드 생성자만 있으면 error
		System.out.println("constructor");
	}
	
//	@Autowired
//	@Qualifier("exam2")
	//오버로드 생성자에선 Qualifier에 오류가 난다. 이유는 입력값에 exam이 두 개가 올 수도 있기 때문
	//그래서 
	public InlineExamConsole(
//			@Qualifier("exam2")Exam exam1, 
//			@Qualifier("exam2")Exam exam2,
			@Qualifier("exam2")Exam exam) {
		System.out.println("overload");
//		this.exam = exam1;
		this.exam = exam;
	}

	@Override
	public void print() {
		if (exam == null)
//	@Autowired(required = false)를 위해 if null else 처리			
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}

//	@Autowired
//	@Qualifier("exam1")
	@Override
	//Autowired는 setter, 오버로드 생성자, 기본 생성자에 붙일 수 있다.
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
	}

}

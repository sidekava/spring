package spring.di;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		
		exam의 객체, console의 객체가 유동적으로 바뀐다면 객체를 만드는 로직은 설정으로 빼야한다.
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("setting.xml");
		
		console.print();
		
		// 이클립스로 탑다운 방식으로 만듬
		
		/*
		 * inlineExamConsle이 exam 객체를 조립하고 있다. 이 것이 DI다
		 * inlineExamConsl을 쓰다가 GridExamConsole를 쓴다고 하면 //을 바꾸면 된다
		 * 하지만 바꾸려면 소스 수정이 필요한다. 그럼 이 것을 외부설정으로 빼야한다.
		 * 즉 객체 생성 부분을 바꾼다.
		 * 그 작업을 스프링을 통해 바꾼다.
		 */
	}

}

package diPrj.di;

import diPrj.di.entity.Exam;
import diPrj.di.entity.NewlecExam;
import diPrj.di.ui.ExamConsole;
import diPrj.di.ui.GridExamConsole;
import diPrj.di.ui.InlineExamConsole;

public class Program {
	public static void main (String[] args) {
		
		/* 여기서 InlineExamConsole과 GridExamConsole을 번갈아 가면서 쓴다.
		 * 저 두 객체를 바꾸려면 소스 코드를 변경해야 한다.
		 * 근데 스프링은 소스 코드 변경 대신 객체 new 부분을 설정으로 빼서 설정에서 선택할 수 있게 한다.
		 * 그리하여 소스 코드 수정없이 바꿀 수 있다.
		 */
		
		/* DI방식 두 가지
		 * 1. 생성자 이용
		 *  ExamConsole console = new InlineExamConsole(exam);
		 *  
		 * 2. setter 이용
		 *  ExamConsole console = new InlineExamConsole();
		 *  console.setExam(exam);
		 */
		Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole();
//		ExamConsole console = new GridExamConsole(); // GridExamConsole이 exam을 조립하고 있다. exam이 dependency가 된 것.
		console.setExam(exam);
		console.print();
	}
}

package diPrj.di;

import diPrj.di.entity.Exam;
import diPrj.di.entity.NewlecExam;
import diPrj.di.ui.ExamConsole;
import diPrj.di.ui.GridExamConsole;
import diPrj.di.ui.InlineExamConsole;

public class Program {
	public static void main (String[] args) {
		/* data를 갖고있는 entity로서의 클래스와 그 entity를 이용한 출력을 담당하는 클래스 
		 */
		
		/* Exam exam = new NewlecExam();을 먼저 만들고 인테페이스, 클래스를 만든다.
		 * 이런 방식을 topdown방식이라 함.
		 */
		
		Exam exam = new NewlecExam();
		
		/* exam을 출력해주는 ExamConsole 클래스 추가
		 * 데이터를 가지고 출력하기 때문에 데이터를 껴 넣어 준다.(exam)
		 */
		
		/* 여기서 InlineExamConsole과 GridExamConsole을 번갈아 가면서 쓴다.
		 * 저 두 객체를 바꾸려면 소스 코드를 변경해야 한다.
		 * 근데 스프링은 소스 코드 변경 대신 객체 new 부분을 설정으로 빼서 설정에서 선택할 수 있게 한다.
		 * 그리하여 소스 코드 수정없이 바꿀 수 있다.
		 */
		ExamConsole console = new InlineExamConsole(exam); // InlineExamConsole이 exam을 조립하고 있다. exam이 dependency가 된 것.
//		ExamConsole console = new GridExamConsole(exam);
		console.print();
	}
}

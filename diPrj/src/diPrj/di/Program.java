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
		//ExamConsole console = new InlineExamConsole(exam);
		ExamConsole console = new GridExamConsole(exam);
		console.print();
	}
}

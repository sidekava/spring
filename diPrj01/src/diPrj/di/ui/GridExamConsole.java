package diPrj.di.ui;

import diPrj.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	
	private Exam exam;

	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("------------------------------------");
		System.out.println("--total------------------------avg--");
		System.out.printf("--%5d------------------------%3.2f--\n", exam.total(), exam.avg());
		System.out.println("------------------------------------");
	}

}

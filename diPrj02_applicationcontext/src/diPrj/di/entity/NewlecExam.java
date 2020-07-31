package diPrj.di.entity;

import diPrj.di.entity.Exam;

public class NewlecExam implements Exam {
	
	/* NewlecExam이 가지고 있는 데이타 */
	private int kor;
	private int eng;
	private int math;
	private int com;

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor + eng + math + com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total() / 4.0f;
	}

}

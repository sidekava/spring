package diPrj.di.entity;

public interface Exam {
	/* 합과 평균을 반환하는 능력을 가지고 있는 인터페이스, 
	 * NewlecExam이 이 인터페이스를 구현한 클래스
	 */
	int total();
	float avg();
}

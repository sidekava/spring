package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변
		Exam exam = new NewlecExam();
		Exam exam = new NewlecExam(10, 10, 10, 10);
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		
		exam의 객체, console의 객체가 유동적으로 바뀐다면 객체를 만드는 로직은 설정으로 빼야한다.
		*/
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class); -> Object형으로 꺼내지므로 캐스팅 필요
		console.print();
		
		List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
		//exams.add(new NewlecExam(1,1,1,1));
		
		for (Exam e : exams) System.out.println(e);
		
		// 이클립스로 탑다운 방식으로 만듬
		
		/*
		 * inlineExamConsle이 exam 객체를 조립하고 있다. 이 것이 DI다
		 * inlineExamConsl을 쓰다가 GridExamConsole를 쓴다고 하면 //을 바꾸면 된다
		 * 하지만 바꾸려면 소스 수정이 필요한다. 그럼 이 것을 외부설정으로 빼야한다.
		 * 즉 객체 생성 부분을 바꾼다.
		 * 그 작업을 스프링을 통해 바꾼다.
		 */
		
		/* ApplicationContext 종류
		 * 	ClassPathXmlApplicationContext 
		 *   -> 지시서를 application의 루트에서 경로를 지정 할 때 사용
		 *  FileSystemXmlApplicationContex
		 *   -> 지시서를 현재 파일 시스템의 루트(C드라이브 등)에서 경로를 지정 할 때 사용
		 *  XmlWebApplicationContext
		 *   -> 지시서를 Web에 두어 웹의 경로를 지정
		 *  AnnotationConfigApplicationContext
		 *   -> 파일로 두는 것이 아닌 스캔하는 방법을 씀.
		 */
		
		/* 자바 프로젝트를 메이븐 프로젝트로 변경
		 * Project Explorer에서 프로젝트 우클릭 -> Configure -> Convert to Maven Project
		 */
		
		/* 메이븐 프로젝트에서 스프링 라이브러리 받기
		 *  mvnrepository.com 접속
		 *  springframework 검색
		 *  spring context 이동
		 *  dependency 복사
		 *  pom.xml에 project/dependencies 태그를 만들고 그 하위에 dependenct를 붙여 넣는다.
		 */
		
	}

}

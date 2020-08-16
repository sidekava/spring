package diPrj.aop;

import java.lang.reflect.Proxy;

import diPrj.aop.entity.Exam;
import diPrj.aop.entity.NewlecExam;

public class Program {
	public static void main (String[] args) {
		Exam exam = new NewlecExam(1, 1, 1, 1);
		
		Exam proxy = Proxy.newProxyInstance(loader, interfaces, h);
		
		System.out.printf("total is %d\n", exam.total());
				
	}

}

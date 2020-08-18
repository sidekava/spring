package diPrj.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import diPrj.aop.entity.Exam;
import diPrj.aop.entity.NewlecExam;

public class Program {
	public static void main (String[] args) {
		Exam exam = new NewlecExam(1, 1, 1, 1);
		
		/*
		 * 프락시는 가짜인데 실제처럼 로드해야 한다. 그래서 loader에 객체를 로드할 수 있도록 한다.
		 */
		
		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
				new Class[] {Exam.class},
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						long start = System.currentTimeMillis();
						
						Object result = method.invoke(exam, args);
						
						
						
						long end = System.currentTimeMillis();
						
						String message = (end - start) + "ms 시간이 걸렸습니다";
						System.out.println(message);
						
						
						
						return result;
					}
				}
			
					
		);
		
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("total is %d\n", proxy.avg());
				
	}

}

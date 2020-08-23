package diPrj.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import diPrj.aop.entity.Exam;

public class Program {
	public static void main (String[] args) {
		ApplicationContext context = 
//				new AnnotationConfigApplicationContext(NewlecDIConfig.class); 
				new ClassPathXmlApplicationContext("diPrj/aop/setting.xml");
		
		Exam proxy = (Exam) context.getBean("proxy");
		
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("total is %d\n", proxy.avg());
//		Exam exam = new NewlecExam(1, 1, 1, 1);
//		
//		/*
//		 * 프락시는 가짜인데 실제처럼 로드해야 한다. 그래서 loader에 객체를 로드할 수 있도록 한다.
//		 */
//		
//		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
//				new Class[] {Exam.class},
//				new InvocationHandler() {
//					
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						long start = System.currentTimeMillis();
//						
//						Object result = method.invoke(exam, args);
//						
//						long end = System.currentTimeMillis();
//						
//						String message = (end - start) + "ms 시간이 걸렸습니다";
//						System.out.println(message);
//						
//						return result;
//					}
//				}
//		);
		
				
	}

}

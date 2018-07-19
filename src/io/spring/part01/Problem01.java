package io.spring.part01;

public class Problem01 {
	/**
	 * Problem
	 * 
	 * You want to develop a simple web application with Spring MVC to learn the
	 * basic concepts and configurations of this framework.
	 * 
	 * 
	 * Solution
	 * 
	 * The central component of Spring MVC is a front controller. In the simplest
	 * Spring MVC application, this controller is the only servlet you need to
	 * configure in a Java web deployment descriptor (i.e., the web.xml file or a
	 * ServletContainerInitializer). A Spring MVC controller—often referred to as a
	 * dispatcher servlet— implements one of Sun’s core Java EE design patterns
	 * called Front Controller. It acts as the front controller of the Spring MVC
	 * framework, and every web request must go through it so that it can manage the
	 * entire request-handling process.When a web request is sent to a Spring MVC
	 * application, a controller first receives the request. Then it organizes the
	 * different components configured in Spring’s web application context or
	 * annotations present in the controller itself, all needed to handle the
	 * request. Figure 3-1 shows the primary flow of request handling in Spring MVC.
	 * 
	 */
}

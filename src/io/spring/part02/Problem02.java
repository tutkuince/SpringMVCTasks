package io.spring.part02;

public class Problem02 {
	/**
	 * Map Requests with @RequestMapping
	 * 
	 * Problem
	 * 
	 * When DispatcherServlet receives a web request, it attempts to dispatch
	 * requests to the various controller classes that have been declared with
	 * the @Controller annotation. The dispatching process depends on the
	 * various @RequestMapping annotations declared in a controller class and its
	 * handler methods. You want to define a strategy for mapping requests using
	 * the @RequestMapping annotation.
	 * 
	 * Solution
	 * 
	 * In a Spring MVC application, web requests are mapped to handlers by one or
	 * more @RequestMapping annotations declared in controller classes. Handler
	 * mappings match URLs according to their paths relative to the context path
	 * (i.e., the web application context’s deployed path) and the servlet path
	 * (i.e., the path mapped to DispatcherServlet). So, for example, in the URL
	 * http://localhost:8080/court/welcome, the path to match is /welcome, as the
	 * context path is /court and there’s no servlet path—recall the servlet path
	 * declared as / in the CourtWebApplicationInitializer.
	 */
}

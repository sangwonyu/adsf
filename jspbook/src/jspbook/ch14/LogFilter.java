package jspbook.ch14;
import java.io.*;

import javax.servlet.*;
import org.slf4j.*;
public class LogFilter {
	Logger log;

	public void destroy() {
		log.info("LogFilter stop");
	}
	
	public void doFilter(ServletRequest arg0,ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
		log.debug("logFilter run" + arg0.getRemoteAddr());
		arg2.doFilter(arg0, arg1);
		
	}
	
	public void init(FilterConfig arg0) throws ServletException {
		log= LoggerFactory.getLogger(this.getClass());

		
	}

}

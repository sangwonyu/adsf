package jspbook.ch14;
import org.slf4j.*;
public class LogTest {
	
		public static void main(String[] args) {
			
			String msg = "Hello Log!!";
			Logger LOG = LoggerFactory.getLogger(LogTest.class);
			LOG.info("test log");
			LOG.warn("test log: {}",msg);
			LOG.debug("debug level test");
			LOG.trace("trace level test");
			
		}
	
	
}

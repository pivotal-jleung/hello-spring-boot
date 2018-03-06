package hk.jleung.pcf.hellospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloMessage() {
		return "Hello World @ " + new java.util.Date();
	}
}

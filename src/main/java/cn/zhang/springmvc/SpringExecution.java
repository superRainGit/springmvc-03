package cn.zhang.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringExecution {
	
	@Autowired
	private UserService userService;
	
	public SpringExecution() {
		System.out.println("SpringExecution...");
	}

	@RequestMapping("/testHelloWorld")
	public String testHelloWorld() {
		System.out.println("success");
		System.out.println(userService);
		return "success";
	}
}

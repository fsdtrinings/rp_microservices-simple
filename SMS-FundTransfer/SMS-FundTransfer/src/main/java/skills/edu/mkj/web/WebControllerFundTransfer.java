package skills.edu.mkj.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ft")
public class WebControllerFundTransfer {

	@GetMapping("/test")
	public String doTest()
	{
		return "fund transfer";
	}
	
	
}

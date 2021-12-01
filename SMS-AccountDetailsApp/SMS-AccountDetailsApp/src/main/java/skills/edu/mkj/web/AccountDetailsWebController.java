package skills.edu.mkj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ad")
public class AccountDetailsWebController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/test")
	public String doTest()
	{
		String uri = "http://FUNDTRANSFER/ft/test";
		String op = restTemplate.getForObject(uri, String.class);
		return "A "+op;
	}
}

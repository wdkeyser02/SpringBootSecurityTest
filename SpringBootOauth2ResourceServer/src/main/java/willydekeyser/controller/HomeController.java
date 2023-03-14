package willydekeyser.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		LocalDateTime time = LocalDateTime.now();
		return "Welcome Home! - " + time;
	}

}

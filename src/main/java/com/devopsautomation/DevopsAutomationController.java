package com.devopsautomation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsAutomationController {
@GetMapping(value="/getauto")
public String get()
{
	return "Docker autorepository";
}
}

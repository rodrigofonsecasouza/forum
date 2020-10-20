package br.com.alura.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@Autowired
	private JdbcTemplate template;
	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		template.execute("create table logs (id int PRIMARY KEY AUTO_INCREMENT, name varchar)");
		template.execute("insert into logs (name) values ('abc')");
		System.out.println(template.queryForList("select * from logs"));
		return "Hello World!";
	}

}

package com.example.ToDo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.ToDo.dto.UsersDto;
import com.example.ToDo.model.UserLog;
import com.example.ToDo.model.Users;
import com.example.ToDo.service.UserLogService;
import com.example.ToDo.service.UserService;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserLogService userLogservice;

	@GetMapping("/")
	public String viewHomePage(Model model) {
//		model.addAttribute("listUsers", userService.get)
		UsersDto usersDto = new UsersDto();
		model.addAttribute("User", usersDto);
		return "index";
	}
	

	@GetMapping("/registerUsers")
	public String saveUsers(Model model) {
		Users user = new Users();
		model.addAttribute("user", user);
		return "register_user";
	}

	@PostMapping("/saveUsers")
	public String registerUser(@ModelAttribute("User") Users Users) {
		userService.registerUser(Users);
		return "redirect:/";
	}

	@PostMapping("/login")
	public String loginUser(Model model, @ModelAttribute("User") UsersDto usersDto) {
		Users authUser = userService.checkUser(usersDto);
		if (authUser == null) {
			return "index";
		} else {
			return "redirect:/getLog";
		}
	}
	
	@GetMapping("/showNewEntryForm")
	private String entryCheck(Model model) {
		UserLog userlog = new UserLog();
		userlog.setUserid(1);
		model.addAttribute("userlog",userlog);
		return "showNewEntryForm";
	}
	
	@PostMapping("/saveLog")
	public String saveLog(@ModelAttribute("userlog") UserLog userLog) {
		userLogservice.saveLog(userLog);
		return "redirect:/getLog";
	}
	
	 @GetMapping("/getLog")
	    public String viewLogList(Model model) {
	        model.addAttribute("listUserLog", userLogservice.getAllLog());
	        return "task_list";
	    }
	
}

package springMvc.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	@RequestMapping("/Home")
    public String home(Model model)
    {
		System.out.println("this is homr url");
		model.addAttribute("name","Sanju Patidar");
		model.addAttribute("id",45);
		
		List<String> friends=new ArrayList<String>();
		friends.add("neha");
		friends.add("rupali");
          friends.add("vishu");	
          friends.add("nilesh");
		
          model.addAttribute("f", friends);
		
    	return "index";
    }
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() 
	{
		System.out.println("this is help controller");
		//creating model and view object
		ModelAndView modelAndView=new ModelAndView();
		//setting the data
		modelAndView.addObject("name","raj");
		modelAndView.addObject("rollnumber",3543);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(45);
		list.add(67);
		list.add(876);
		modelAndView.addObject("marks", list);
		
		//setting he view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}

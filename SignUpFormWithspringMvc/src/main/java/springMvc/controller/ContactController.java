package springMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMvc.model.User;
import springMvc.service.UserService;

@Controller
@RequestMapping("/first")
public class ContactController {
	
	 @Autowired
	  private UserService userService;
	   @ModelAttribute
	   public void commonDataForModel(Model m) {
		   m.addAttribute("Header","SignUp Form");
		   
	   }
        
	   @RequestMapping("/contact")
	   public String showForm()
	   {
		   return "contact";
		   
	   }
	   @RequestMapping(path="/processform",method=RequestMethod.POST)
	   public String handleform(@ModelAttribute User user,Model model)
	   {
		   
		   
		   System.out.println(user);
		   
			
		//   model.addAttribute("user",user);
		   
		   int createdUser=this.userService.createUser(user);
		   model.addAttribute("msg","user created with id"+createdUser);
		   return "success";
	   }
}



/*
@RequestMapping(path="/processform",method=RequestMethod.POST)
public String handleform(
		   @RequestParam("email") String userEmail,
		   @RequestParam("userName") String userName,
		   @RequestParam("password") String userPassword,Model model) 
{
	   
	   User user=new User();
	   user.setEmail(userEmail);
	   user.setUserName(userName);
	   user.setPassword(userPassword);
	   System.out.println(user);
	   
		
		 
	   
	
	   model.addAttribute("user",user);
	   
	  return "success";
}
*/


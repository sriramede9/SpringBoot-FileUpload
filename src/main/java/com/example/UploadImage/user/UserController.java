package com.example.UploadImage.user;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Controller
@RequestMapping("/users")
@Transactional
public class UserController {
	
    private static String UPLOADED_FOLDER = "C://temp//";
    private List<Path> samplePath=new ArrayList<>();


	@Autowired
	private UserService userService;

	@GetMapping("/get")
//	@RequestMapping(path = "/get",method = RequestMethod.GET)
	public String getUsers() { 
		return "test";
	}
	
	
	@GetMapping("/createUser")
	public String createUser(Model model) {
		User u =new User();
//		u.setName("sri");
		model.addAttribute("u", u);
		
//		userService.saveUser(u);
//		userRepository.save(u);
		
		return "create-user";
	}
	
	@PostMapping("/formaction")
	public String formResponse(@ModelAttribute("u") User u,@RequestParam("file") MultipartFile[] file) {
		
		System.out.println("Here are the user details"+u);
		System.out.println("The file is"+ file.length); 
		
		Arrays.asList(file).stream().forEach(f->{
			
			if(f.isEmpty()) {System.out.println("No file uploaded");}
			
//			System.out.println(f);
			
			try {

	            // Get the file and save it somewhere
	            byte[] bytes = f.getBytes();
	            Path path = Paths.get(UPLOADED_FOLDER + f.getOriginalFilename());
	            
	            System.out.println("Path is \t"+ path);
	            this.samplePath.add(path);
	            Files.write(path, bytes);

//	            redirectAttributes.addFlashAttribute("message",
//	                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			
			
		});
		
		
		
		 
		
		return "redirect:/users/getimage";
	} 
	  
	@GetMapping("/getimage")
	public String getImage(Model model) {
		
		model.addAttribute("path", samplePath);
		
		return "getimg";
	}
}  
 
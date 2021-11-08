package com.rab3tech.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rab3tech.controller.dto.MovieDTO;
import com.rab3tech.service.IMoviesService;

@Controller
@Scope("singleton")
// scope of beans are: single, prototype, request, session, application, global-session and websocket
public class MovieController {
	
	@Autowired
	private IMoviesService iMoviesService;

		@GetMapping("/addMovie")
		public String addMovie() {
			return "addmovie";
		}
		
//		@ModelAttribute --> it reads all the data from the form and populates into the java objects
		
		@PostMapping("/addMovie")
		public String uploadMovie(@ModelAttribute MovieDTO movieDTO, Model model) {
			System.out.println(movieDTO);
			iMoviesService.save(movieDTO);
			model.addAttribute("message","Hey your movie is uploaded");
			return "addmovie";		
		}
		
		@GetMapping("/movies")
		public String showAllMovies(Model model) {
			List<MovieDTO> movieDTOs = iMoviesService.findAll();
			model.addAttribute("movieDTOs",movieDTOs);
			return "showallmovies";
		}
		
		@GetMapping("/deleteMovie")
		public String deleteMovie(@RequestParam int del, Model model) {
			iMoviesService.deleteByMid(del);
			// showing the rest of the result the delete operation
			List<MovieDTO> movieDTOs = iMoviesService.findAll();
			model.addAttribute("movieDTOs",movieDTOs);
			return "showallmovies";
			
		}
		
		@GetMapping("/editMovie")
		public String editMovie(@RequestParam int mid,Model model) {
			MovieDTO movieDTO = iMoviesService.findByMid(mid); 
			String year = movieDTO.getYear();
			movieDTO.setYear(year);
			model.addAttribute("movieDTO",movieDTO);
			return "editmovie";
			
		}	
		
		@PostMapping("/updateMovie")
		public String editMovie(@ModelAttribute MovieDTO movieDTO,Model model) {
			iMoviesService.updateByMid(movieDTO); 
//			List<MovieDTO> movieDTOs = iMoviesService.findAll();
//			model.addAttribute("movieDTOs",movieDTOs);
			return "redirect:/movies";
			
		}	
}

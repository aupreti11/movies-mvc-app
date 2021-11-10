package com.rab3tech.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rab3tech.controller.dto.ApplicationResponseDTO;
import com.rab3tech.controller.dto.MovieDTO;
import com.rab3tech.service.IMoviesService;

@RestController
@RequestMapping("/v3")
public class MoviesRestController {
	
	@Autowired
	private IMoviesService iMoviesService;
	
	@GetMapping("/movies")
	public List<MovieDTO> findMovies(){
		return iMoviesService.findAll();
		
	}
	
	//@PathVariable - it is used to read data into rest api from URI
	@GetMapping("/movies/{mid}")
	public MovieDTO findMovieByid(@PathVariable int mid) {
		return iMoviesService.findByMid(mid);
		
	}
	
	@DeleteMapping("/movies/{mid}")
	public ApplicationResponseDTO deleteMovieByid(@PathVariable int mid){
		 iMoviesService.deleteByMid(mid);
		 ApplicationResponseDTO applicationResponseDTO=new ApplicationResponseDTO();
		 applicationResponseDTO.setCode("1000");
		 applicationResponseDTO.setMessage("Hey! movie is deleted successfully!");
		 return applicationResponseDTO;
	}
	

}

package com.rab3tech.service;

import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rab3tech.controller.dto.MovieDTO;
import com.rab3tech.dao.MoviesRepository;
import com.rab3tech.dao.ProducerRepository;
import com.rab3tech.dao.entity.MovieEntity;
import com.rab3tech.dao.entity.ProducerEntity;

@Service
public class MoviesService implements IMoviesService{
	
	@Autowired
	private MoviesRepository moviesRepository;
	
	@Autowired
	private ProducerRepository producerRepository;
	
	@Override
	public String save(MovieDTO movieDTO) {
		MovieEntity movieEntity=new MovieEntity();
		BeanUtils.copyProperties(movieDTO, movieEntity);
		movieEntity.setYear(new Date());
		
		ProducerEntity producerEntity = new ProducerEntity();
		producerEntity.setAddress("Fremont, USA");
		producerEntity.setCreatedate(new Timestamp(new Date().getTime()));
		producerEntity.setEmail("amritupreti134@gmail.com");
		producerEntity.setMobile("9846070528");
		producerEntity.setName("Emma Belew");
		producerEntity.setMovieEntity(movieEntity);
		producerRepository.save(producerEntity);
		return "success";
	}
	
	@Override
	public List<MovieDTO> findAll() {
		List<MovieDTO> movieDTOs=new ArrayList<>();
		List<MovieEntity> movieEntities=moviesRepository.findAll();
		for(MovieEntity entity:movieEntities) {
			MovieDTO movieDTO=new MovieDTO();
			BeanUtils.copyProperties(entity, movieDTO);
			movieDTOs.add(movieDTO);
		}
	    return movieDTOs;
	}
	
	@Override
	public void deleteByMid(int mid) {
		moviesRepository.deleteById(mid);
		
	}
	
	@Override
	public MovieDTO findByMid(int mid) {
		MovieEntity movieEntity = moviesRepository.findById(mid).get();
		MovieDTO movieDTO = new MovieDTO();
		BeanUtils.copyProperties(movieEntity, movieDTO);
		return movieDTO;
		
	}

	@Override
	public void updateByMid(MovieDTO movieDTO) {
		MovieEntity entity = new MovieEntity();
		BeanUtils.copyProperties(movieDTO, entity);
		moviesRepository.save(entity);
	}

/*  below is the regular jdbc ways to access to the DB and abouve is the through the Hibernate
	public List<MovieDTO> findAll() {
		String sql = "select mid,name,year,director,poster,story from movie_tbl";
		List<MovieDTO> movieDTOs = moviesRepository.query(sql, new BeanPropertyRowMapper(MovieDTO.class));
		return movieDTOs;
	}

	public void deleteByMid(int mid) {
		String sql ="delete from movie_tbl where mid="+mid;
		moviesRepository.update(sql);
		
	}
	
	public MovieDTO findByMid(int mid) {
		String sql = "select mid,name,year,director,poster,story from movie_tbl where mid=?";
		List<MovieDTO> movieDTOs = moviesRepository.query(sql, new Object[]{mid},new BeanPropertyRowMapper(MovieDTO.class));
		return movieDTOs.get(0);
		
	}
	
	public void updateByMid(MovieDTO movieDTO) {
		String sql = "update movie_tbl set name=?,director=?,poster=?,story=? where mid=?";
		Object data[]=new Object[]{movieDTO.getName(),movieDTO.getDirector(),movieDTO.getPoster(),movieDTO.getStory(),movieDTO.getMid()};
		moviesRepository.update(sql,data);
	}
*/
}


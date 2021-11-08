/*package com.rab3tech.dao;

import java.util.Date;
import java.util.List;

//import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rab3tech.controller.MovieDTO;

@Repository
public class MovieDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String save(MovieDTO movieDTO) {
		String sql = "insert into movie_tbl(name,year,director,poster,story) values(?,?,?,?,?)";
		//this is data for the query
		Object[] data = new Object[]{movieDTO.getName(),new Date(),movieDTO.getDirector(),
				movieDTO.getPoster(),movieDTO.getStory()};
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql,data);
		return "success";
		
	}

	public List<MovieDTO> findAll() {
		String sql = "select mid,name,year,director,poster,story from movie_tbl";
		List<MovieDTO> movieDTOs = jdbcTemplate.query(sql, new BeanPropertyRowMapper(MovieDTO.class));
		return movieDTOs;
	}

	public void deleteByMid(int mid) {
		String sql ="delete from movie_tbl where mid="+mid;
		jdbcTemplate.update(sql);
		
	}
	
	public MovieDTO findByMid(int mid) {
		String sql = "select mid,name,year,director,poster,story from movie_tbl where mid=?";
		List<MovieDTO> movieDTOs = jdbcTemplate.query(sql, new Object[]{mid},new BeanPropertyRowMapper(MovieDTO.class));
		return movieDTOs.get(0);
		
	}
	
	public void updateByMid(MovieDTO movieDTO) {
		String sql = "update movie_tbl set name=?,director=?,poster=?,story=? where mid=?";
		Object data[]=new Object[]{movieDTO.getName(),movieDTO.getDirector(),movieDTO.getPoster(),movieDTO.getStory(),movieDTO.getMid()};
		jdbcTemplate.update(sql,data);
	}
}
*/

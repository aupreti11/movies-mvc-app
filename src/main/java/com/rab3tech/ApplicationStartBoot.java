package com.rab3tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rab3tech.dao.RolesRepository;
import com.rab3tech.dao.entity.RolesEntity;
import java.util.Optional;
/** 
 * 
 * @author amritupreti
 * this is responsible to start the application
 *
 */

@SpringBootApplication
public class ApplicationStartBoot implements CommandLineRunner {
	
	@Autowired
	private RolesRepository rolesRepository;

	public static void main(String[] args) {
		
		SpringApplication.run(ApplicationStartBoot.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		//this code should only execute once
		Optional<RolesEntity> optional = rolesRepository.findById(1);
		if(!optional.isPresent()) {
		RolesEntity entity1= new RolesEntity();
		entity1.setName("ADMIN");
		entity1.setDescription("ADMIN");
		
		RolesEntity entity2= new RolesEntity();
		entity2.setName("EMPLOYEE");
		entity2.setDescription("EMPLOYEE");
		
		RolesEntity entity3= new RolesEntity();
		entity3.setName("CUSTOMER");
		entity3.setDescription("CUSTOMER");
		
		rolesRepository.save(entity1);
		rolesRepository.save(entity2);
		rolesRepository.save(entity3);
		}
		
	}

}

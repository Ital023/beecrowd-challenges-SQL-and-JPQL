package com.devsuperior.uri2611;

import com.devsuperior.uri2611.dto.MovieMinDTO;
import com.devsuperior.uri2611.projections.MovieMinProjection;
import com.devsuperior.uri2611.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Uri2611Application implements CommandLineRunner {

	@Autowired
	private MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2611Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		List<MovieMinProjection> list = movieRepository.search1("Action");
		List<MovieMinDTO> listOficial = list.stream().map(x -> new MovieMinDTO(x)).collect(Collectors.toList());

		for(MovieMinDTO obj : listOficial){
			System.out.println(obj);
		} */

		List<MovieMinDTO> list2 = movieRepository.search2("Action");

		for(MovieMinDTO obj : list2){
			System.out.println(obj);
		}

	}

}

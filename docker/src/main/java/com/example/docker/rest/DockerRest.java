package com.example.docker.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/docker")
@RestController
public class DockerRest {
	@GetMapping(value="/data")
	public ResponseEntity<List<Integer>> getData(){
		return ResponseEntity.ok(new ArrayList<>(Arrays.asList(1,2,3)));
	}
}

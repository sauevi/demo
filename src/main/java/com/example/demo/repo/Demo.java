package com.example.demo.repo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "demo")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Demo {
	
	@Id
	private String id;
	private String name;
}

package com.apigraphql.singlendpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SinglendpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(SinglendpointApplication.class, args);
	}

	@Bean
	public graphql.schema.GraphQLScalarType extendedScalarLong() {
		return graphql.scalars.ExtendedScalars.GraphQLLong;
	}

}

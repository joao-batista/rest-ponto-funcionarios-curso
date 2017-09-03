package br.com.pontointeligente.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RestPontoFuncionariosCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestPontoFuncionariosCursoApplication.class, args);
	}
}

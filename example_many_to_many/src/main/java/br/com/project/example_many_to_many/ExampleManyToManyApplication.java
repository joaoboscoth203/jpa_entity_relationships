package br.com.project.example_many_to_many;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import br.com.project.example_many_to_many.modelo.Aluno;
import br.com.project.example_many_to_many.modelo.Curso;
import br.com.project.example_many_to_many.repositorio.AlunoRepositorio;
import br.com.project.example_many_to_many.repositorio.CursoRepositorio;

@SpringBootApplication
public class ExampleManyToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleManyToManyApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(AlunoRepositorio ar, CursoRepositorio cr){
		return args -> {

			// Criar um aluno
			Aluno aluno = new Aluno();
			aluno.setAluno("Ralf");

			// Cadastrar na tabela alunos
			ar.save(aluno);

			// Criar cursos
			Curso c1 = new Curso();
			c1.setCurso("Java - Spring Boot");

			Curso c2 = new Curso();
			c2.setCurso("Pyton - Flask");

			Curso c3 = new Curso();
			c3.setCurso("PHP - Laravel");

			// Cadastrar os cursos na tabela cursos
			cr.saveAll(Arrays.asList(c1, c2, c3));

			// Adicionar o primeiro e o terceiro curso no aluno
			aluno.getCursos().addAll(Arrays.asList(c1, c2));

			// Atualizar a lista de cursos do aluno
			ar.save(aluno);

		};
	}

}

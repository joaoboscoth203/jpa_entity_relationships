package br.com.project.example_many_to_many.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.example_many_to_many.modelo.Curso;
import br.com.project.example_many_to_many.repositorio.CursoRepositorio;

@RestController
@RequestMapping("/cursos")
public class CursoControle {
    
    @Autowired
    private CursoRepositorio cursoRepositorio;

    @GetMapping
    public Iterable<Curso> listar(){
        return cursoRepositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Curso cadastrar(@RequestBody Curso obj){
        return cursoRepositorio.save(obj);
    }
}

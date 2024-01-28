package br.com.project.example_many_to_many.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.example_many_to_many.modelo.Aluno;
import br.com.project.example_many_to_many.repositorio.AlunoRepositorio;

@RestController
@RequestMapping("/alunos")
public class AlunoControle {
    
    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @GetMapping("/listar")
    public Iterable<Aluno> listar(){
        return alunoRepositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Aluno cadastrar(@RequestBody Aluno obj){
        return alunoRepositorio.save(obj);
    }
}

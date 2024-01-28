package br.com.project.example_one_to_many.controle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.project.example_one_to_many.modelo.Postagem;
import br.com.project.example_one_to_many.repositorio.PostagemRepositorio;

@RestController
@RequestMapping("/postagens")
public class PostagemControle {
    
    @Autowired
    private PostagemRepositorio postagemRepositorio;

    @GetMapping("/listar")
    public Iterable<Postagem> listar(){
        return postagemRepositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem obj){
        return postagemRepositorio.save(obj);
    }
}

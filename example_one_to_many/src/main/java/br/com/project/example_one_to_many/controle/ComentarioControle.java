package br.com.project.example_one_to_many.controle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.project.example_one_to_many.modelo.Comentario;
import br.com.project.example_one_to_many.repositorio.ComentarioRepositorio;

@RestController
@RequestMapping("/comentarios")
public class ComentarioControle {
    
    @Autowired
    private ComentarioRepositorio comentarioRepositorio;

    @GetMapping("/listar")
    public Iterable<Comentario> listar(){
        return comentarioRepositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Comentario cadastrar(@RequestBody Comentario obj){
        return comentarioRepositorio.save(obj);
    }
}

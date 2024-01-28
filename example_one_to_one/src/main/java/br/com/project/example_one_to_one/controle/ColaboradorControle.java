package br.com.project.example_one_to_one.controle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.project.example_one_to_one.modelo.Colaborador;
import br.com.project.example_one_to_one.repositorio.ColaboradorRepositorio;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorControle {

    @Autowired
    private ColaboradorRepositorio colaboradorRepositorio;

    @GetMapping("/listar")
    public Iterable<Colaborador> listar(){
        return colaboradorRepositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Colaborador cadastrar(@RequestBody Colaborador obj){
        return colaboradorRepositorio.save(obj);
    }
    
}

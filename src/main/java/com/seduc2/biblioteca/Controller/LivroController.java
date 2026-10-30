package com.seduc2.biblioteca.Controller;

import com.seduc2.biblioteca.Entity.Livro;
import com.seduc2.biblioteca.Service.LivroService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/livros")
@CrossOrigin(origins = "*")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livro> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Livro buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    public Livro cadastrar(@RequestBody Livro livro) {
        return service.cadastrar(livro);
    }

    @PutMapping("/{id}")
    public Livro atualizar(
            @PathVariable Long id,
            @RequestBody Livro livro) {
        return service.atualizar(id, livro);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}


package com.seduc2.biblioteca.Controller;

import com.seduc2.biblioteca.Entity.Livro;
import com.seduc2.biblioteca.Service.LivroService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    // GET - Listar todos os livros
    @GetMapping
    public List<Livro> listar() {
        return service.listar();
    }

    // GET - Buscar livro pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscar(@PathVariable Long id) {

        Livro livro = service.buscar(id);

        if (livro != null) {
            return ResponseEntity.ok(livro);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST - Cadastrar livro
    @PostMapping
    public ResponseEntity<Livro> cadastrar(@RequestBody Livro livro) {

        Livro novoLivro = service.cadastrar(livro);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(novoLivro);
    }
}

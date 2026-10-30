
package com.seduc2.biblioteca.Service;

import com.seduc2.biblioteca.Entity.Livro;
import com.seduc2.biblioteca.Repository.LivroRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public List<Livro> listar() {
        return repository.findAll();
    }

    public Livro buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Livro cadastrar(Livro livro) {
        return repository.save(livro);
    }
}

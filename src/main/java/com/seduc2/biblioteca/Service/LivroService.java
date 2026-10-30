
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

    public Livro atualizar(Long id, Livro dados) {

        Livro livro = buscar(id);

        if (livro != null) {
            livro.setTitulo(dados.getTitulo());
            livro.setAutor(dados.getAutor());
            livro.setIsbn(dados.getIsbn());
            livro.setEditora(dados.getEditora());
            livro.setAnoPublicacao(dados.getAnoPublicacao());
            livro.setGenero(dados.getGenero());
            livro.setQuantidade(dados.getQuantidade());
            livro.setPaginas(dados.getPaginas());
            livro.setSituacao(dados.getSituacao());
            livro.setDescricao(dados.getDescricao());

            return repository.save(livro);
        }

        return null;
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}

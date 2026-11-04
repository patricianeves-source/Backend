package com.seduc2.biblioteca.Repository;

import com.seduc2.biblioteca.Entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
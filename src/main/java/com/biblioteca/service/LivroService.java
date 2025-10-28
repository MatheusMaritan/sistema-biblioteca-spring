package com.biblioteca.service;

import com.biblioteca.model.Livro;
import com.biblioteca.repository.LivroRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LivroService {
    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> listarTodos()
    {
        return livroRepository.findAll();
    }

    public Optional<Livro> buscarPorId(UUID id)
    {
        return livroRepository.findById(id);
    }

    public Livro salvar(Livro livro)
    {
        return livroRepository.save(livro);
    }

    public Livro atualizar(UUID id, Livro livroAtualizado) {
        return livroRepository.findById(id).map(livro -> {
            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setAutor(livroAtualizado.getAutor());
            livro.setEditora(livroAtualizado.getEditora());
            livro.setAnoPublicacao(livroAtualizado.getAnoPublicacao());
            livro.setCategoria(livroAtualizado.getCategoria());
            return livroRepository.save(livro);
        }).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    public void deletar(UUID id)
    {
        livroRepository.deleteById(id);
    }
}

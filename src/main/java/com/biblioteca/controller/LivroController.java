package com.biblioteca.controller;


import com.biblioteca.model.Livro;
import com.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/livros")      // Define o caminho base de todas as rotas da classe.
public class LivroController
{
    @Autowired // = LivroService livroService = new LivroService();
    private LivroService livroService;

    @GetMapping     // Mapeia requisições HTTP GET. Usado para buscar dados (exibir lista ou item específico).
    public List<Livro> listarTodos()
    {
        return livroService.listarTodos();
    }

    @GetMapping("/{id}")    // Mapeia requisições HTTP GET. Usado para buscar dados (exibir lista ou item específico).
    public Optional<Livro> buscarPorId(@PathVariable UUID id)
    {
        return livroService.buscarPorId(id);
    }

    @PostMapping            // Mapeia requisições POST. Usado para criar um novo recurso (adicionar um novo livro, por exemplo).
    public Livro salvar(@RequestBody Livro livro)
    {
        return livroService.salvar(livro);
    }

    @PutMapping("/{id}")        // Mapeia requisições PUT. Usado para atualizar um recurso existente.
    public Livro atualizar(@PathVariable UUID id, @RequestBody Livro livro)
    {
        return livroService.atualizar(id, livro);
    }

    @DeleteMapping("/{id}")     // Mapeia requisições DELETE. Usado para remover um recurso do sistema.
    public void deletar(@PathVariable UUID id)
    {
        livroService.deletar(id);
    }

    // @PathVariable
    // Liga uma variável da URL ao parâmetro do métod(o).
    // Exemplo: /livros/5 → id = 5.

    // @RequestBody
    // Converte automaticamente o JSON recebido no corpo da requisição em um objeto Java (Livro).
    // Exemplo: o JSON enviado via POST é transformado em uma instância da classe Livro.

}

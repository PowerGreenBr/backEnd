package com.powergreen.powergreen.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.powergreen.powergreen.model.Produto;
import com.powergreen.powergreen.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "", allowedHeaders = "")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository ProdutoRepository;
    
    @GetMapping
    public ResponseEntity<List<Produto>> getAll(){
        return ResponseEntity.ok(ProdutoRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable Long id){
        return ProdutoRepository.findById(id)
            .map(resposta -> ResponseEntity.ok(resposta))
            .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Produto>> getByTitle(@PathVariable 
    String nome){
        return ResponseEntity.ok(ProdutoRepository
            .findAllByNomeContainingIgnoreCase(nome));
    }
    
    @PostMapping
    public ResponseEntity<Produto> post(@Valid @RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ProdutoRepository.save(produto));
    }
    
    @PutMapping
    public ResponseEntity<Produto> put(@Valid @RequestBody Produto produto){
        return ProdutoRepository.findById(produto.getId())
            .map(resposta -> ResponseEntity.status(HttpStatus.CREATED)
            .body(ProdutoRepository.save(produto)))
            .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Optional<Produto> Produto = ProdutoRepository.findById(id);
        
        if(Produto.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        
       ProdutoRepository.deleteById(id);              
    }

}
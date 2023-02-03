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

import com.powergreen.powergreen.model.Plano;
import com.powergreen.powergreen.repository.PlanoRepository;

@RestController
@RequestMapping("/planos")
@CrossOrigin(origins = "", allowedHeaders = "")
public class PlanoController {
    
    @Autowired
    private PlanoRepository PlanoRepository;
    
    @GetMapping
    public ResponseEntity<List<Plano>> getAll(){
        return ResponseEntity.ok(PlanoRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Plano> getById(@PathVariable Long id){
        return PlanoRepository.findById(id)
            .map(resposta -> ResponseEntity.ok(resposta))
            .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Plano>> getByTitle(@PathVariable 
    String nome){
        return ResponseEntity.ok(PlanoRepository
            .findAllByNomeContainingIgnoreCase(nome));
    }
    
    @PostMapping
    public ResponseEntity<Plano> post(@Valid @RequestBody Plano plano){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(PlanoRepository.save(plano));
    }
    
    @PutMapping
    public ResponseEntity<Plano> put(@Valid @RequestBody Plano plano){
        return PlanoRepository.findById(plano.getId())
            .map(resposta -> ResponseEntity.status(HttpStatus.CREATED)
            .body(PlanoRepository.save(plano)))
            .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Optional<Plano> Plano = PlanoRepository.findById(id);
        
        if(Plano.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        
       PlanoRepository.deleteById(id);              
    }

}
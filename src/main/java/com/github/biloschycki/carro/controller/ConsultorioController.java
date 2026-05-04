package com.github.biloschycki.carro.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.biloschycki.carro.model.Consultorio;
import com.github.biloschycki.carro.repository.ConsultorioRepository;




@RestController
@RequestMapping("api/${api.version}/pacientes")
public class ConsultorioController {
    @Autowired
    private ConsultorioRepository repository;

    @PostMapping
    public ResponseEntity<Consultorio> create(@RequestBody Consultorio consultorio) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(consultorio));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consultorio> findById(@PathVariable Long id) {
        return repository
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Consultorio>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Consultorio> update(@PathVariable Long id,
            @RequestBody Consultorio consultorio) {

        Optional<Consultorio> optConsultorio = repository.findById(id);

        if (optConsultorio.isPresent()) {
            consultorio.setId(id);
            Consultorio consultorioAlterado = repository.save(consultorio);
            return ResponseEntity.ok(consultorioAlterado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();

    }

}

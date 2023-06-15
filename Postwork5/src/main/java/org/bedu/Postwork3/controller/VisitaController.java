package org.bedu.Postwork3.controller;

import org.bedu.Postwork3.model.Cliente;
import org.bedu.Postwork3.model.Visita;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/visita")
public class VisitaController {

    @GetMapping("/{visitaId}")
    public ResponseEntity<Visita> getVisita(@PathVariable Long visitaId){
        Visita.builder()
                .id(1)
                .cliente(Cliente.builder().build())
                .fechaProgramada(LocalDateTime.now().plusDays(15))
                .direccion("La Pastora")
                .proposito("Clase")
                .vendedor("Jose")
                .build();
        return ResponseEntity.ok(Visita.builder().build());
    }

    @GetMapping
    public ResponseEntity <List<Visita>> getVisitas(@RequestParam Long clienteId){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    public ResponseEntity<Void> creaVisita(@RequestBody Visita visita, @RequestParam Long clienteId){
        return ResponseEntity.created(URI.create("")).build();
    }

    @PutMapping("/{visitaId}")
    public ResponseEntity<Void> actualizaVisits(@PathVariable Long visitaId, @RequestBody Visita visita){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{visitaId}")
    public ResponseEntity<Void> eliminaVisita(@PathVariable Long visitaId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
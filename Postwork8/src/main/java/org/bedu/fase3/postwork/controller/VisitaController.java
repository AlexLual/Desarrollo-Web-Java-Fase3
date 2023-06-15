package org.bedu.fase3.postwork.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.bedu.fase3.postwork.model.Visita;
import org.bedu.fase3.postwork.service.VisitaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/Visita")
@RequiredArgsConstructor
public class VisitaController {

    private final VisitaService visitaService;

    @GetMapping("/{visitaId}")
    public ResponseEntity<Visita> getVisita(@PathVariable Long visitaId){

        Optional<Visita> visitaDb = visitaService.obtenVisita(visitaId);

        if (visitaDb.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "La visita especificada no existe.");
        }

        return ResponseEntity.ok(visitaDb.get());
    }

    @GetMapping
    public ResponseEntity<List<Visita>> getVisitas(@RequestParam Long clienteId) {

        return ResponseEntity.ok(visitaService.obtenVisitas());
    }

    @PostMapping
    public ResponseEntity<Void> creaVisita(@Valid @RequestBody Visita visita, @RequestParam Long visitaId){

        Visita visitaNueva = visitaService.guardaVisita(visita);

        return ResponseEntity.created(URI.create(String.valueOf(visitaNueva.getId()))).build();
    }

    @PutMapping("/{visitaId}")
    public ResponseEntity<Void> actualizaVisita(@PathVariable Long visitaId, @Valid @RequestBody Visita visita){

        visitaService.actualizaVisita(visita);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{visitaId}")
    public ResponseEntity<Void> eliminaVisita(@PathVariable Long visitaId){

        visitaService.eliminaVisita(visitaId);
        
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
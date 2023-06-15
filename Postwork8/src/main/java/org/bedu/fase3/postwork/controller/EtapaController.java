package org.bedu.fase3.postwork.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.bedu.fase3.postwork.model.Etapa;
import org.bedu.fase3.postwork.service.EtapaService;
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
@RequestMapping("/etapa")
@RequiredArgsConstructor
public class EtapaController {

    private final EtapaService etapaService;

    @GetMapping("/{etapaId}")
    public ResponseEntity<Etapa> getEtapa(@PathVariable Long etapaId) {
        Optional<Etapa> etapaDb = etapaService.obtenEtapa(etapaId);

        if(etapaDb.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"La estapa especificada no existe.");
        }

        return ResponseEntity.ok(etapaDb.get());
    }

    @GetMapping
    public ResponseEntity<List<Etapa>> getEtapas(@RequestParam Long clienteId) {
        return ResponseEntity.ok(etapaService.obtenEtapas());
    }

    @PostMapping
    public ResponseEntity<Void> creaEtapa(@Valid @RequestBody Etapa etapa, @RequestParam Long clienteId) {

        Etapa etapaNueva = etapaService.guardaEtapa(etapa);

        return ResponseEntity.created(URI.create(String.valueOf(etapaNueva.getEtapaId()))).build();
    }

    @PutMapping("/{etapaId}")
    public ResponseEntity<Void> actualizaEtapa(@PathVariable Long etapaId,@Valid @RequestBody Etapa etapa) {

        etapaService.actualizaEtapa(etapa);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{etapaId}")
    public ResponseEntity<Void> eliminaEtapa(@PathVariable Long etapaId){

        etapaService.eliminaEtapa(etapaId);
        
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    
}

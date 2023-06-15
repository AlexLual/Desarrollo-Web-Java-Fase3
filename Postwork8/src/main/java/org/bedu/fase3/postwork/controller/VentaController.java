package org.bedu.fase3.postwork.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.bedu.fase3.postwork.model.Venta;
import org.bedu.fase3.postwork.service.VentaService;
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

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/venta")
@RequiredArgsConstructor
public class VentaController {

    private final VentaService ventaService;

    @GetMapping("/{ventaId}")
    public ResponseEntity<Venta> getVenta (@PathVariable Long ventaId){

        Optional<Venta> ventaDb = ventaService.obtenVenta(ventaId);

        return ResponseEntity.ok(ventaDb.get());
    }

    @GetMapping
    public ResponseEntity<List<Venta>> getVentas(@Valid @RequestParam Long clienteId) {

        return ResponseEntity.ok(ventaService.obtenVentas());
    }

    @PostMapping
    public ResponseEntity<Void> creaVenta(@Valid @RequestBody Venta venta, @RequestParam Long ventaId) {

        Venta ventaNueva = ventaService.guardaVenta(venta);

        return ResponseEntity.created(URI.create(String.valueOf(ventaNueva.getVentaId()))).build();
    }

    @PutMapping("/{ventaId}")
    public ResponseEntity<Void> actualizaVenta(@PathVariable Long ventaId, @Valid @RequestBody Venta venta) {

        ventaService.actualizaVenta(venta);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{ventaId}")
    public ResponseEntity<Void> eliminaVenta(@PathVariable Long ventaId){

        ventaService.eliminaVenta(ventaId);
        
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

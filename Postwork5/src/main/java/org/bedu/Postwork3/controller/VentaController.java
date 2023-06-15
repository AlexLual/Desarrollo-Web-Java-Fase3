package org.bedu.Postwork3.controller;

import org.bedu.Postwork3.model.Cliente;
import org.bedu.Postwork3.model.Producto;
import org.bedu.Postwork3.model.Venta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @GetMapping("/{ventaId}")
    public ResponseEntity<Venta> getVenta(@PathVariable Long ventaId){
        List<Producto> p =new ArrayList<>();
        Venta.builder()
                .ventaId(1)
                .monto(5000)
                .productos(p)
                .cliente(Cliente.builder().build())
                .fechaCreacion(LocalDateTime.now())
                .build();



        return ResponseEntity.ok(Venta.builder().build());
    }

    @GetMapping
    public ResponseEntity <List<Venta>> getVentas(@RequestParam Long clienteId){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    public ResponseEntity<Void> creaVenta(@RequestBody Venta venta, @RequestParam Long clienteId){
        return ResponseEntity.created(URI.create("")).build();
    }

    @PutMapping("/{ventaId}")
    public ResponseEntity<Void> actualizaVenta(@PathVariable Long ventaId, @RequestBody Venta venta){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{ventaId}")
    public ResponseEntity<Void> eliminaVenta(@PathVariable Long ventaId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
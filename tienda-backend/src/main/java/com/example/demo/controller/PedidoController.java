package com.example.demo.controller;

import com.example.demo.model.Pedido;
import com.example.demo.repository.PedidoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")  // O restringe a tu frontend: http://localhost:5500
public class PedidoController {

    private final PedidoRepository repo;

    public PedidoController(PedidoRepository repo) {
        this.repo = repo;
    }

    // 1) Crear un pedido
    @PostMapping("/pedido")
    public ResponseEntity<Pedido> crearPedido(@RequestBody Pedido pedido) {
        Pedido guardado = repo.save(pedido);
        return ResponseEntity.ok(guardado);
    }

    // 2) Listar todos los pedidos (para admin)
    @GetMapping("/pedidos")
    public List<Pedido> listarPedidos() {
        return repo.findAll();
    }

    // 3) Ver un pedido por su ID (para cliente)
    @GetMapping("/pedido/{id}")
    public ResponseEntity<Pedido> verPedido(@PathVariable Long id) {
        return repo.findById(id)
                   .map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }
}

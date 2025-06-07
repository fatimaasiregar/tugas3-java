package com.example.buku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buku")
public class BukuController {

    @Autowired
    private BukuService bukuService;

    @GetMapping
    public List<Buku> getAllBuku() {
        return bukuService.getAllBuku();
    }

    @PostMapping
    public String addBuku(@RequestBody Buku buku) {
        bukuService.addBuku(buku);
        return "Buku berhasil ditambahkan!";
    }

    @GetMapping("/{id}")
    public Buku getBukuById(@PathVariable String id) {
        Buku buku = bukuService.getBukuById(id);
        if (buku != null) {
            return buku;
        } else {
            throw new RuntimeException("Buku dengan ID " + id + " tidak ditemukan.");
        }
    }
}

package com.example.buku;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BukuService {
    private List<Buku> daftarBuku = new ArrayList<>();

    public List<Buku> getAllBuku() {
        return daftarBuku;
    }

    public void addBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public Buku getBukuById(String id) {
        Optional<Buku> hasil = daftarBuku.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
        return hasil.orElse(null);
    }
}

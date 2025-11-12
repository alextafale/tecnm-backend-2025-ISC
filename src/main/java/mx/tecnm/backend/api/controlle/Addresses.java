package mx.tecnm.backend.api.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.tecnm.backend.api.repositor.AddressRepository;
import mx.tecnm.backend.api.entit.Addresses_Entities;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/domicilios")
public class Addresses {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping
    public ResponseEntity<List<Addresses_Entities>> getAllAddresses() {
        List<Addresses_Entities> addresses = addressRepository.findAll();
        return ResponseEntity.ok(addresses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Addresses_Entities> getAddressById(@PathVariable Long id) {
    
        Optional<Addresses_Entities> address = addressRepository.findById(id);
        return address.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Addresses_Entities> createAddress(@RequestBody Addresses_Entities address) {
        Addresses_Entities savedAddress = addressRepository.save(address);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAddress);
    }
}


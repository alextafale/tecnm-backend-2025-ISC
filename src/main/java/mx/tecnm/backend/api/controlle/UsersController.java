package mx.tecnm.backend.api.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tecnm.backend.api.repositor.UserRepository;
import mx.tecnm.backend.api.entit.Users;
import java.util.List;
import java.util.Optional;

@RestController //Indica que la clase sera un controlador donde gestionara las peticiones
@RequestMapping("/api/usuarios") // Escucha las peticiones a esta URI
public class UsersController {

    @Autowired //Cablea el repositorio para evitar la generación de nuevos objetos cada que se ejecute el controlador
    private UserRepository userRepository; //Repositorio del controlador

    @CrossOrigin //Sirve para realizar la peticion desde fuera
    @GetMapping()
    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable Long id){
        Optional<Users> user = userRepository.findById(id);
        return user.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }
}

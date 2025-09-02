package IntegracionBackFront.backfront.Services.Auth;

import IntegracionBackFront.backfront.Repositories.Users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository repo;

    public boolean Login(String correo, String contrasena){

    }
}

package macario.fran.claro_java_com_spring.service;

import macario.fran.claro_java_com_spring.model.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}

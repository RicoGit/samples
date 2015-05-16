package app.mapper;

import app.entities.User;

import java.util.List;

/**
 * User: Constantine Solovev
 * Created: 04.05.15  21:52
 */


public interface UserMapper {

    User getUserById(int id);

    List<User> getUsers();


}

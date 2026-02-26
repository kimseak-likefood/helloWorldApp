package kh.edu.paragoniu.helloworldapp.repositories;

import kh.edu.paragoniu.helloworldapp.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

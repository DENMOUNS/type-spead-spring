package cm.landry.saisisseur.typeSpeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cm.landry.saisisseur.typeSpeed.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}

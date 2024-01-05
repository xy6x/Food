package com.example.foodtruck.Repository;

import com.example.foodtruck.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User,Integer> {
    User
    findUserById(Integer id);
}

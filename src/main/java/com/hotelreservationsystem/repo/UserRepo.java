package com.hotelreservationsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelreservationsystem.models.User;
@Repository
public interface UserRepo extends JpaRepository<User, String> {

}

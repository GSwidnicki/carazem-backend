package com.carazem.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User, Long> {

    int countByEmail(String email);

    Long findByEmail(String email);

}

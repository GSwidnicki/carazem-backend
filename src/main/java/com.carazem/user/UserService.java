package com.carazem.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean userExists(String email) {
        return userDao.countByEmail(email) > 0;
    }

    public void addUser(String email) {
        if (!userExists(email)) {
            User newUser = new User();
            newUser.setEmail(email);
            userDao.save(newUser);
        }
    }

    public Long getUserByEmail(String email) {
        return userDao.findByEmail(email);
    }
}

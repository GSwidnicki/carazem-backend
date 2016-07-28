package com.carazem.auth;

import com.carazem.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecurityService {

    @Autowired
    private UserService userService;

    public Long currentUserId() {
        return new Long(1);
    }
}

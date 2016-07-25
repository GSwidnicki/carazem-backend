package com.carazem.config;

import org.springframework.stereotype.Service;

@Service
public class SecurityService {
    public Long currentUserId() {
        return new Long(1);
    }
}

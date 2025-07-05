package com.caresync.service.auth.utils;

import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtil {
    public static String getName(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
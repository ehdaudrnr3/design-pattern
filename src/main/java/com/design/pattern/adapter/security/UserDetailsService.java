package com.design.pattern.adapter.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}

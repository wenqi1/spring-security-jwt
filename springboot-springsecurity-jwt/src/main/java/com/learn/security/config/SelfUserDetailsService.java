package com.learn.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;

@Component
public class SelfUserDetailsService implements UserDetailsService {
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        SelfUserDetails selfUserDetails = null;
        if(s.equals("rose")){
            selfUserDetails = new SelfUserDetails();

            selfUserDetails.setUsername("rose");
            selfUserDetails.setPassword(passwordEncoder.encode("jack"));

            Set authoritiesSet = new HashSet();
            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_ADMIN");
            authoritiesSet.add(authority);
            selfUserDetails.setAuthorities(authoritiesSet);
        }
        return selfUserDetails;
    }
}

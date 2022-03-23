package com.rdodo.customauthenticationprovider.config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        // Can have our own logic to velidate username and password
        // like cheking in database, in LDAP or any other.

        if (username.equals("rahul") && password.equals("123")) {
            // 3rd arg we can fetch from db also for roles/authorities check.
            return new UsernamePasswordAuthenticationToken(username, authentication, Arrays.asList());
        } else {
            throw  new BadCredentialsException("Invalid username and password");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}

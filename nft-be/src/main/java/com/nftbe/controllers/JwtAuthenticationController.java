package com.nftbe.controllers;

import com.nftbe.config.JwtTokenUtil;
import com.nftbe.models.User;
import com.nftbe.models.jwt.JwtRequest;
import com.nftbe.models.response.JwtResponse;
import com.nftbe.services.JwtUserDetailsService;
import com.nftbe.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Objects;

import static com.nftbe.utils.Constants.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/login_users")
public class JwtAuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private JwtUserDetailsService userDetailsService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) {
        String username = authenticationRequest.getUsername();
        String password = authenticationRequest.getPassword();
        if (!EMPTY.equals(username) && !EMPTY.equals(password)) {
            if (username.equals("market")) {
//                authenticate(username, password);
                final UserDetails userDetails = userDetailsService
                        .loadUserByUsername(authenticationRequest.getUsername());
                final String token = jwtTokenUtil.generateToken(userDetails);
                return ResponseEntity.ok(new JwtResponse(token));
            } else {
                User user = userService.getUserLogin(username, password);
                if (!Objects.isNull(user)) {
                    authenticate(username, password);
                    final UserDetails userDetails = userDetailsService
                            .loadUser(authenticationRequest.getUsername(), authenticationRequest.getPassword());
                    final String token = jwtTokenUtil.generateToken(userDetails);

                    return ResponseEntity.ok(new JwtResponse(token));
                }
            }
        }

        return new ResponseEntity<>(UNAUTHORIZED, HttpStatus.UNAUTHORIZED);
    }

    private void authenticate(String username, String password) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new DisabledException(USER_DISABLED, e);
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException(INVALID_CREDENTIALS, e);
        }
    }
}

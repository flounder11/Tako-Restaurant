package ru.fodi.Tako.Restaurant.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Jwts;

import java.util.Date;

@Component
public class JwtCore {
    @Value("${Tako-Restaurant.app.secret}")
    private String secret;
    @Value("${Tako-Restaurant.app.lifeTime}")
    private int lifeTime;

    public String generateToken(UserDetails userDetails) {
        return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())
                .setExpiration(new Date((new Date().getTime() + lifeTime)))
                .signWith(SignatureAlgoritm.HS256, secret)
                .compact();
    }
}

package com.fundoonotes.fundoonotesapp.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collections;

/**
 * Use Case 3: Authorization Filter.
 * Extracts the Authorization header, validates the JWT, and — on success —
 * populates SecurityContextHolder with (userId, email) so downstream Controllers
 * NEVER need to read identity from a request parameter (that's the IDOR gap
 * Use Case 3's acceptance criteria specifically calls out).
 */
@Component
public class JwtAuthFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;

    public JwtAuthFilter(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request,
                                     @NonNull HttpServletResponse response,
                                     @NonNull FilterChain filterChain) throws ServletException, IOException {

        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String token = authHeader.substring(7);

            if (jwtUtil.isTokenValid(token)) {
                int userId = jwtUtil.extractUserId(token);
                String email = jwtUtil.extractEmail(token);

                // principal = userId (int) so Controllers/Services can pull it straight
                // from SecurityContextHolder instead of trusting a client-supplied param.
                UsernamePasswordAuthenticationToken authentication =
                        new UsernamePasswordAuthenticationToken(userId, null, Collections.emptyList());
                authentication.setDetails(email);

                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
            // If invalid/tampered: leave SecurityContext empty.
            // Spring Security's authorizeHttpRequests rule then rejects with 401.
        }

        filterChain.doFilter(request, response);
    }
}

//package com.concretepage.security.jwt.oAuth0;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//
//public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
//    private AuthenticationManager authenticationManager;
//    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest req,
//                                                HttpServletResponse res) throws AuthenticationException {
////        try {
////            User user = new ObjectMapper()
////                    .readValue(req.getInputStream(), User.class);
////
////            return authenticationManager.authenticate(
////                    new UsernamePasswordAuthenticationToken(
////                            user.getMobile(),
////                            user.getPassword(),
////                            new ArrayList<>())
////            );
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
//        return authenticationManager.authenticate(null);
//    }
//
//    @Override
//    protected void successfulAuthentication(HttpServletRequest req,
//                                            HttpServletResponse res,
//                                            FilterChain chain,
//                                            Authentication auth) throws IOException, ServletException {
//
////        String token = Jwts.builder()
////                .setSubject(((User) auth.getPrincipal()).getUsername())
////                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
////                .signWith(SignatureAlgorithm.HS512, SECRET.getBytes())
////                .compact();
////        res.addHeader(HEADER_STRING, TOKEN_PREFIX + token);
//    }
//
//
//}

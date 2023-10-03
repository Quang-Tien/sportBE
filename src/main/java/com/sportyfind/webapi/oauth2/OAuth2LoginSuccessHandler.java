package com.sportyfind.webapi.oauth2;

import com.sportyfind.webapi.services.CustomerOAuth2UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class OAuth2LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        CustomOAuth2User oAuth2User = (CustomOAuth2User)  authentication.getPrincipal();
        System.out.println("OAuth2 Name: " + oAuth2User.getName());
        System.out.println("OAuth2 Email: " + oAuth2User.getEmail());
        super.onAuthenticationSuccess(request, response, authentication);
    }
}

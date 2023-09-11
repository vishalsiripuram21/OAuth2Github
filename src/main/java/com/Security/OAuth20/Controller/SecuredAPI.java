package com.Security.OAuth20.Controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredAPI {
  
  @GetMapping("/")
  public String get(OAuth2AuthenticationToken token){

    System.err.println(token.getName()+" "+token.getPrincipal());
    return "Successfully loggedin";

  }
}

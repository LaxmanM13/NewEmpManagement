//package com.ajju.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//
//
//@SuppressWarnings("deprecation")
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//	
//	 @Override
//		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//			 auth.inMemoryAuthentication().withUser("ajju").password("ajju@9075").roles("ADMIN");
//		}
//		 @Override
//			protected void configure(HttpSecurity http) throws Exception {
//			 http.csrf().disable();
//			 http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
//			}
//		 
//		 @Bean
//		 public static NoOpPasswordEncoder passwordEncoder()
//		 {
//			 return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//			 
//		 }
//	
//
//}

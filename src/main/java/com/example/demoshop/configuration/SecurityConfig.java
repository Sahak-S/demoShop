//package com.example.demoshop.configuration;
//
//import com.example.demoshop.service.CustomUserDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
////import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//
////    @Autowired
////    GoogleOAuth2LoginSuccessHandler googleOAuth2LoginSuccessHandler;
//
//    @Autowired
//    CustomUserDetailsService customUserDetailsService;
//
////
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http
////                .authorizeRequests()
////                .antMatchers("/", "/shop/**","/register", "/h2-console/**").permitAll()
////                .antMatchers("/admin/**").hasRole("ADMIN")
////                .anyRequest()
////                .authenticated()
////                .and()
////                .formLogin()
////                .loginPage("/login")
////                .permitAll()
////                .failureUrl("/login?error = true")
////                .defaultSuccessUrl("/")
////                .usernameParameter("email")
////                .passwordParameter("password")
//////                .and()
//////                .oauth2Login()                                               //////////////////////////////////////
//////                .loginPage("/login")                                            ////////////   ???????        ///////////////////////
//////                .successHandler(googleOAuth2LoginSuccessHandler)                            /////////////
//////                .and()
//////                .logout()
//////                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//////                .logoutSuccessUrl("/login")
//////                .invalidateHttpSession(true)
//////                .deleteCookies("JSESSIONID")
//////                .and()
//////                .exceptionHandling()
////                .and()
////                .csrf()
////                .disable();
////        http.headers().frameOptions().disable();
////    }
////
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(customUserDetailsService);
////    }
////
////    @Bean
////    public BCryptPasswordEncoder bCryptPasswordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
////
////    @Override
////    public void init(WebSecurity web) throws Exception {
////        web.ignoring().antMatchers("/resources/**","/static/**","/images/**","/productImages/**","/css/**","/js/**");
////    }
//}

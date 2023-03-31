//package com.example.demoshop.service;
//
////import com.example.demoshop.model.CustomUserDetail;
//import com.example.demoshop.model.User;
//import com.example.demoshop.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    UserRepository userRepository;
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Optional<User> user = userRepository.findUserByEmail(email);
//        user.orElseThrow(()->new UsernameNotFoundException("User to nahi mila"));
//        return user.map(CustomUserDetail::new).get();
//    }
//}

package com.example.journalApp.service;

import com.example.journalApp.enity.User;
import com.example.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import java.util.ArrayList;
import static org.mockito.Mockito.*;

public class UserDetailsServiceimlpTests {

    @InjectMocks
    private UserDetailsServiceimlp userDetailsServiceimlp;

    @Mock
    private UserRepository userRepository;

    @Disabled
    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Disabled
    @Test
    void loadUserByUsernameTest(){
        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("luffy").password("221").roles(new ArrayList<>()).build());
        UserDetails user = userDetailsServiceimlp.loadUserByUsername("luffy");
        Assertions.assertNotNull(user);
    }
}

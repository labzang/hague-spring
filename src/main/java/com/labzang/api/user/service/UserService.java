package com.labzang.api.user.service;

import com.labzang.api.common.domain.Messenger;
import com.labzang.api.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Messenger findUserById(String userId) {
        return userRepository.findUserById(userId);
    }
  


}

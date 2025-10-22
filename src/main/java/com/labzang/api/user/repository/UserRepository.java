package com.labzang.api.user.repository;

import org.springframework.stereotype.Repository;

import com.labzang.api.common.domain.Messenger;

@Repository
public class UserRepository {

    public Messenger findUserById(String userId) {

        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("DB 에 사용자가 등록되었습니다.");
        return messenger;
    }

}

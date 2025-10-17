package com.labzang.api.auth.service;

import com.labzang.api.auth.domain.LoginDTO;
import com.labzang.api.auth.domain.LoginVO;
import com.labzang.api.common.domain.Messenger;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public Messenger login(LoginDTO loginDTO) {
        System.out.println(" 로그인 서비스로 들어옴 ");
        System.out.println("DTO 에서 서비스로 전달된 이메일 : " + loginDTO.getEmail());
        System.out.println("DTO 에서 서비스로 전달된 비밀번호 : " + loginDTO.getPassword());

        LoginVO loginVO = new LoginVO();

        System.out.println("VO 에서 서비스로 전달된 이메일 : " + loginVO.getEmail());
        System.out.println("VO 에서 서비스로 전달된 비밀번호 : " + loginVO.getPassword());

        int code = 0;
        String message = "";

        if (loginVO.getEmail().equals(loginDTO.getEmail()) &&
                loginVO.getPassword().equals(loginDTO.getPassword())) {
            code = 0;
            message = "로그인 성공";
        } else if (loginVO.getEmail().equals(loginDTO.getEmail()) &&
                !loginVO.getPassword().equals(loginDTO.getPassword())) {
            code = 2;
            message = "비밀번호 불일치";
        } else {
            code = 1;
            message = "이메일 불일치";
        }
        Messenger messenger = new Messenger();
        messenger.setCode(code);
        messenger.setMessage(message);
        return messenger;
    }

}

package com.labzang.api.user.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // getter, setter, toString, equals, hashCode 자동 생성
@NoArgsConstructor  // 기본 생성자 자동 생성
@AllArgsConstructor
public class UserDto {

    private String userId;
    private String survived;
    private String pclass;
    private String name;
    private String gender;
    private String age;
    private String sibSp;
    private String parch;
    private String ticket;
    private String fare;
    private String cabin;
    private String embarked;
}

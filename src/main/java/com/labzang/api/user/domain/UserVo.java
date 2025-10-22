package com.labzang.api.user.domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter               // getter, setter, toString, equals, hashCode 자동 생성
@NoArgsConstructor  // 기본 생성자 자동 생성
@AllArgsConstructor
public class UserVo {

    private String userId;
    private String survivalStatus;
    private String passengerClass;
    private String name;
    private String gender;
    private String age;
    private String siblingsSpouses;
    private String parentsChildren;
    private String ticket;
    private Double fare;
    private String cabin;
    private String embarked;

}

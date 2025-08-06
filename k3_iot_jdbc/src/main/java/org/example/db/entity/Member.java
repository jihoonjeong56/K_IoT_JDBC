package org.example.db.entity;

import lombok.*;

// Entity : 데이터베이스 테이블과 매핑되는 클래스 (1:1)
@AllArgsConstructor
@NoArgsConstructor
// : JDBC 또는 ORM(DB와 JAVA를 객체화 하여 연동하는 체계) 에서는
//      , 빈 객체를 먼저 만들고 setter로 값을 넣는 방식을 사용
// >>AllArgsConstructor 도 NoArgsConstructor가 전제 되어야 함
@Getter @Setter @ToString
public class Member {
    private int id;
    private String name;
    private String email;
}

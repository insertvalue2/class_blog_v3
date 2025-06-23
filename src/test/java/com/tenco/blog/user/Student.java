package com.tenco.blog.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import lombok.Data;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    private String username;
    private String password;
    private String email;
}

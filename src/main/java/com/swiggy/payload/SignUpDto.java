package com.swiggy.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import jakarta.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDto {
    private Long id;
    private String name;
    private String email;
    private String username;
    private Long mobile;
    private String password;
    private String roleType;
}

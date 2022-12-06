package com.mahoo.hippus.dto;


import lombok.Data;

//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class UserSigninDTO {
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
//    @Email(message = "邮箱格式错误")
//    private String email;
}

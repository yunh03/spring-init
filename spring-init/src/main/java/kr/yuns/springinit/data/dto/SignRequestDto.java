package kr.yuns.springinit.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class SignRequestDto {
    private String email;
    private String password;
}

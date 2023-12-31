package kr.yuns.springinit.data.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@SuperBuilder(toBuilder = true)
public class BaseResponseDto {
    private boolean success;
    private String msg;
}

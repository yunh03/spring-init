package kr.yuns.springinit.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostResponseDto {
    private Long id;
    private String title;
    private String contents;
}

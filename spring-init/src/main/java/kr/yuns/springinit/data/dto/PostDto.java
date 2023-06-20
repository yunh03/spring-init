package kr.yuns.springinit.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PostDto {
    private String title;
    private String contents;
}

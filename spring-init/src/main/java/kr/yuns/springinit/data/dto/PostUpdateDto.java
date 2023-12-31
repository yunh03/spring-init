package kr.yuns.springinit.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PostUpdateDto {
    private Long id;
    private String title;
    private String contents;
}

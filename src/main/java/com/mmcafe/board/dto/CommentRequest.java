package com.mmcafe.board.dto;
        import jakarta.validation.constraints.NotBlank;
public record CommentRequest(@NotBlank(message = "content must not be blank") String content) { }

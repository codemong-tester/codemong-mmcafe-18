package com.mmcafe.board.dto;
    import jakarta.validation.constraints.NotBlank;
public record BoardRequest(@NotBlank(message = "title must not be blank") String title, @NotBlank(message = "content must not be blank") String content) { }

package com.piotrgrochowiecki.project_template.controller.mvc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class CreateBookForm {

    @NotBlank @Length(min = 3)
    private String title;
    private String pages;
    private Long authorId;
    private String authorFirstName;
    private String authorLastName;

}

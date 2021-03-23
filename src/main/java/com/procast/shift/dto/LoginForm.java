package com.procast.shift.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class LoginForm {
	/** スタッフコード */
	@NotBlank
	@Size(min = 1, max = 20)
    private String staffCode;

    /** パスコード */
	@NotNull
	@Size(min = 1, max = 16)
    private String passCode;
}

package com.example.msuser.common.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtTokenErrorResponse {

    private String message;
    private Boolean tokenError = true;
}

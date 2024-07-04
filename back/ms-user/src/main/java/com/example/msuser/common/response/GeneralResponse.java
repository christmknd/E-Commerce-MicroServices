package com.example.msuser.common.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneralResponse {

    private String status;
    private Object data;

    public GeneralResponse() {

    }
}

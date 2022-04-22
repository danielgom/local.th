package com.common.local.th.domain.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class CommonError {

    private String description;

    private int code;

    private String value;

}

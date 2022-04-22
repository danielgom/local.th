package com.common.local.th.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class StandardDTO {

    private String id;

    private String username;

    private String password;

    private int totalAmount;
}

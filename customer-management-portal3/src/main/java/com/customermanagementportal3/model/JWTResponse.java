package com.customermanagementportal3.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JWTResponse {

    private String jwtToken;

    private String username;
}

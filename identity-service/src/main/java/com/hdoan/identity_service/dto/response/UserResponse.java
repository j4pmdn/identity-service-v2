package com.hdoan.identity_service.dto.response;/*
 * @project identity-service
 * @author Huy
 */

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {

    String id;
    String username;
    String firstName;
    String lastName;
    LocalDate dob;
    Set<String> roles;
}

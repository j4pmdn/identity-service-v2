package com.hdoan.identity_service.mapper;/*
 * @project identity-service
 * @author Huy
 */

import com.hdoan.identity_service.dto.request.UserCreationRequest;
import com.hdoan.identity_service.dto.request.UserUpdateRequest;
import com.hdoan.identity_service.dto.response.UserResponse;
import com.hdoan.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    // @Mapping(source = "firstName", target = "lastName")
    // @Mapping(target = "lastName", ignore = true)
    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}

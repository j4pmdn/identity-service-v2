package com.hdoan.identity_service.repository;/*
 * @project identity-service
 * @author Huy
 */

import com.hdoan.identity_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {


}

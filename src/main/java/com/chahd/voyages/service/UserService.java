package com.chahd.voyages.service;

import com.chahd.voyages.entities.Role;
import com.chahd.voyages.entities.User;

public interface UserService {
void deleteAllusers();
void deleteAllRoles();
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}

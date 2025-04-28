package com.ivanpolovnev.spring_security_app.service;

import com.ivanpolovnev.spring_security_app.entity.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    List<Role> getAllRoles();
    Set<Role> findByIds(List<Long> ids);
}

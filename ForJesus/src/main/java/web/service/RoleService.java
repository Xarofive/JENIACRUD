package web.service;

import web.model.Role;

import java.util.List;

public interface RoleService {
     Role getRoleByName(String name);
     List<Role> listRoles();
}

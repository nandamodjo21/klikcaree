package id.klikdata.klinik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import id.klikdata.klinik.entity.Role;

public interface RoleDao extends JpaRepository<Role, Long> {

}

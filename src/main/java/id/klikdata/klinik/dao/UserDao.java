package id.klikdata.klinik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import id.klikdata.klinik.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

}

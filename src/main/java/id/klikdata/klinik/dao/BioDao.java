package id.klikdata.klinik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import id.klikdata.klinik.entity.Biodata;

public interface BioDao extends JpaRepository<Biodata, String> {

}

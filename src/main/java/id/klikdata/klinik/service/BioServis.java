package id.klikdata.klinik.service;

import java.util.List;

import id.klikdata.klinik.entity.Biodata;

public interface BioServis {

    List<Biodata> findData();

    Biodata saveBiodata(Biodata biodata);

}

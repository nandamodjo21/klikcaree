package id.klikdata.klinik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.klikdata.klinik.dao.BioDao;
import id.klikdata.klinik.entity.Biodata;

@Service
public class BioServiceImpl implements BioServis {

    @Autowired
    BioDao bioDao;

    @Override
    public List<Biodata> findData() {
        return bioDao.findAll();
    }

    @Override
    public Biodata saveBiodata(Biodata biodata) {
        return bioDao.save(biodata);
    }

}

package id.klikdata.klinik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.klikdata.klinik.entity.Biodata;
import id.klikdata.klinik.service.BioServis;

@RestController
@RequestMapping("/api/data")
// @RequiredArgsConstructor
public class BioController {

    // private final BioDao bioDao;
    @Autowired
    private BioServis bioServis;

    @GetMapping
    public ResponseEntity<List<Biodata>> getAllData() {
        return new ResponseEntity<>(bioServis.findData(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Biodata> saveData(@RequestBody Biodata biodata) {
        return new ResponseEntity<>(bioServis.saveBiodata(biodata), HttpStatus.CREATED);

    }
}

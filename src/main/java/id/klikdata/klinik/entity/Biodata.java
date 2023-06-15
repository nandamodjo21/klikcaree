package id.klikdata.klinik.entity;

// import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

// import lombok.AllArgsConstructor;

// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;

// @Data
@Table(name = "tbl_biodata")
@Entity

public class Biodata {

    public Biodata() {
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id_biodata", columnDefinition = "VARCHAR(255)")
    private String id;

    @Column(name = "nama_lengkap", length = 225)
    private String namaLengkap;

    @Column(name = "no_telp", length = 255)
    private String noTelp;

    @Column(name = "alamat", length = 255)
    private String alamat;

    public Biodata(String id, String namaLengkap, String noTelp, String alamat) {
        this.id = id;
        this.namaLengkap = namaLengkap;
        this.noTelp = noTelp;
        this.alamat = alamat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}

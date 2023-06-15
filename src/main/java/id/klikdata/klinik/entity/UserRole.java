package id.klikdata.klinik.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class UserRole {

    @Id
    @Column(name = "id_user")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_role")
//    private Long idRole;

}

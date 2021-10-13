package demo.mapstruct.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "POLICY")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDAPOLICE")
    int idApolice;

    @Column(name = "CDAPOLICEEXTERNA")
    String cdApoliceExterna;

    @Column(name = "NMCORRETOR")
    String nmCorretor;

    @Column(name = "NRDOCUMENTOCORRETOR")
    String nrDocumentoCorretor;

}

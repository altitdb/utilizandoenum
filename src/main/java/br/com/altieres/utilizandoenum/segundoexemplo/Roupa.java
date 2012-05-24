package br.com.altieres.utilizandoenum.segundoexemplo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

/**
 *
 * @author Altieres de Matos
 */
@Entity
public class Roupa implements Serializable {

    @Id
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    private Cores cor;

    public Cores getCor() {
        return cor;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

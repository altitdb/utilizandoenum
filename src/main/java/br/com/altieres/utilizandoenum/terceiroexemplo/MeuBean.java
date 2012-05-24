package br.com.altieres.utilizandoenum.terceiroexemplo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Altieres
 */
@ManagedBean
@ViewScoped
public class MeuBean implements Serializable{
    
    private NivelAcesso nivelAcesso;
    private List<NivelAcesso> nivelAcessos;
    
    @PostConstruct
    public void init() {
        nivelAcessos = Arrays.asList(NivelAcesso.values());
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public List<NivelAcesso> getNivelAcessos() {
        return nivelAcessos;
    }

    public void setNivelAcessos(List<NivelAcesso> nivelAcessos) {
        this.nivelAcessos = nivelAcessos;
    }
        
}

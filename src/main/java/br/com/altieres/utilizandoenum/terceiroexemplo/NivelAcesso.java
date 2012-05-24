package br.com.altieres.utilizandoenum.terceiroexemplo;

/**
 *
 * @author Altieres de Matos
 */
public enum NivelAcesso {

    ROLE_ADMIN("Administrador"), ROLE_MANAGER("Gerente"), ROLE_USER("Usuário");
    private String nivelAcesso;

    NivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String toString() {
        return nivelAcesso;
    }
}

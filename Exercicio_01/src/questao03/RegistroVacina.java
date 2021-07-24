package questao03;

public class RegistroVacina {

    private String grupo;
    private String dose;
    private String local;

    //construtor vazio
    RegistroVacina() {
        grupo = "nome";
        dose = "0";
        local = "nome";
    }
    public RegistroVacina(String grupo, String dose, String local) {
        this.grupo = grupo;
        this.dose = dose;
        this.local = local;
    }
    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public String getDose() {
        return dose;
    }
    public void setDose(String dose) {
        this.dose = dose;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
}

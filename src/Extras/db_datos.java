package Extras;

public class db_datos {

    private String pais;
    int valor;

    public db_datos(String pais, int valor) {
        this.pais = pais;
        this.valor = valor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}

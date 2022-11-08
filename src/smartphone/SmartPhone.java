package smartphone;

public class SmartPhone {

    private String marca;
    private String modelo;
    private String cor;
    private Integer ano;
    private Boolean conectividade5g;

    public SmartPhone(String marca, String modelo, String cor, Integer ano, Boolean conectividade5g) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.conectividade5g = conectividade5g;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Boolean getConectividade5g() {
        return conectividade5g;
    }

    public void setConectividade5g(Boolean conectividade5g) {
        this.conectividade5g = conectividade5g;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", conectividade5g=" + conectividade5g +
                '}';
    }
}

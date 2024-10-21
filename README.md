//Main
public class Main {
    public static void main (String[] args){
        Automovil bmw=new Automovil("BMW", "I22");
        bmw.setMarca("BMW");
        bmw.setModelo("i22");
        bmw.setColor("Negro");
        bmw.setCilindraje("2000");
        System.out.println("BMW\n" + bmw.verDetalle());
        Automovil bmw2 = new Automovil("Mercedes", "ML200");
        bmw2.setMarca("BMW");
        bmw2.setModelo("i22");
        bmw2.setColor("Negro");
        bmw2.setCilindraje("2000");
        System.out.println("MB\n" + bmw2.verDetalle());
        //2 objetos propiedad sobrecarga
    }
}
//Automovil
public class Automovil {
    //Atributos - Propiedades - Estado
    private String marca;
    private String modelo;
    private String color;
    private String cilindraje;
    //Constructores
    public Automovil(){
        //No retorna nada
    }
    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    //Métodos set and get
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    //Métodos propios y de cálculo
    public String verDetalle(){
        String dv = "Marca: " + getMarca() /*this.marca*/ + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Color: " + getColor() + "\n" +
                "Cilindraje: " + getCilindraje();
        return dv;
    }
    //Modificación de métodos nativos - Clase Object (Principal)
}

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
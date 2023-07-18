import java.security.PrivateKey;

public class Electronico extends Producto {

    private  String marca;

    public Electronico(int id, String nombre, double precio, int cantidad, String marca) {
        super(id, nombre, precio, cantidad);
        this.marca = marca;
    }

        public double calcularDescuento() {


            // aplicando un 25% en el descuento
            double descuento = getPrecio() * 0.25;
            return descuento;
        }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

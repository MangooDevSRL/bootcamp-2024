import java.util.Objects;

public class Car {

    //color, cantidadDePuertas, tipoDeMotor;

    private String name;
    private String color;

    private Integer cantidadDePuertas; //cantidad de puertas

    private String tipoDeMotor;


    public Car(String name){
        this.name = name;
    }

    public Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Car(String name, String color, Integer cantidadDePuertas, String tipoDeMotor){
        this.name = name;
        this.color = color;
        this.cantidadDePuertas = cantidadDePuertas;
        this.tipoDeMotor = tipoDeMotor;
    }


    public Car(){
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        String colorResultante;

        if(color != null){
            colorResultante = color;
        }else{
            colorResultante = "Indefinido";
        }

        return colorResultante;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }


    @Override
    public String toString() {
        return "name: " + name
                + ", color: " + getColor()
                + ", cantidad de puertas: " + cantidadDePuertas
                + ", tipo de motor: " + tipoDeMotor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(color, car.color)
                && Objects.equals(cantidadDePuertas, car.cantidadDePuertas)
                && Objects.equals(tipoDeMotor, car.tipoDeMotor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, cantidadDePuertas, tipoDeMotor);
    }
}

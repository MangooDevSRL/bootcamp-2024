public class SportCar extends Car{
    private Boolean at;

    public SportCar(Boolean at) {
        super();
        this.at = at;
    }

    public SportCar(String name, String color, Boolean at) {
        super(name, color);
        this.at = at;
    }

    public void setAt(Boolean at) {
        this.at = at;
    }

    public Boolean getAt() {
        return at;
    }

    public String toString() {
        String padre = super.toString();
        return padre + ", at: " + at;
    }
}

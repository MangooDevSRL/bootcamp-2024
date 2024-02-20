public class SportCar extends Car{
    private Boolean at;

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

public class Main {


    public static void main(String[] args) {

        Car carA = new Car("Car A", "Azul", 4, "Motor A");

        carA.setName("Car A");
        carA.setColor("Azul");
        carA.setCantidadDePuertas(4);
        carA.setTipoDeMotor("Motor A");


        Car carB;
        carB = new Car("Car B", "Azul");

        carB.setName("Car A");
        carB.setColor("Azul");
        carB.setCantidadDePuertas(4);
        carB.setTipoDeMotor("Motor A");

        Car carC = new Car();
        carC.setName("Car C");

        System.out.println(carA);
        System.out.println(carB);
        System.out.println(carC);


        if(carA.equals(carB)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son Dinstintos");
        }

        SportCar sportCar = new SportCar(true);

        sportCar.setName("Nico");
        sportCar.setColor("Verde");
        sportCar.setCantidadDePuertas(2);
//        sportCar.setAt(true);

        System.out.println(sportCar);


    }


}
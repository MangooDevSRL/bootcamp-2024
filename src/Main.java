import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Main main = new Main();
        //main.lessonOne();

        main.lessonTwo();

    }

    private void lessonOne(){
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

    private void lessonTwo(){
        SportCar sportCarMT= new SportCar("Sport MT", "Azul", false);
        SportCar sportCarAT= new SportCar("Sport AT", "Rojo", true);


        Car carA = new Car("Car A", "Azul", 4, "Motor A");
        Car carB = new Car("Car B", "Rojo", 3, "Motor B");
        Car carC = new Car("Car C", "Verde", 2, "Motor C");

        List<Car> carList = new ArrayList<Car>();
        carList.add(carA);
        carList.add(carB);
        carList.add(carC);

        carList.add(sportCarMT);
        carList.add(sportCarAT);

        for(Car car : carList){
            if(car.getColor().equals("Rojo")){
                System.out.println(car.getName() + " es de color ROJO");
            } else if(car.getColor().equals("Azul")){
                System.out.println(car.getName() + " es de color AZUL");
            } else{
                System.out.println(car.getName() + " es de color VERDE");
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.println(carList.get(i).getName() + " N: " + i);
        }

    }


}
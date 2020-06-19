public class Main {

    public static void main(String[] args) {

        //Pentru a implementa design pattern-ul Prototype trebuie sa suprascriem metoda clone() din clasa Object
        //Design pattern-ul Prototype ne ajuta sa cream obiecte care nu difera foarte mult intre ele, putand sa le
        //customizam dupa nevoi

        //cream un obiect BMW
        Car BMW = new Car("BMW", "X4", "2000", "blue");
        Car BMW2 = BMW.clone();//am clonat obiectul BMW
        BMW2.setColor("white");//pe clona am setat culoarea "white" si am obtinut un obiect pt care difera doar culoarea
        Car BMW3 = BMW.clone();

        //cream un obiect Audi
        Car audi = new Car("Audi", "A8", "2500", "brown");
        Car audi2 = audi.clone();
        audi2.setEngine("3000");


    /*
    Car BMW2 = new Car("BMW", "X4", "2000", "white");
    Car BMW3 = new Car("BMW", "X4", "2000", "white");
    Car BMW4 = new Car("BMW", "X4", "2000", "white");
    Car BMW5 = new Car("BMW", "X4", "2000", "black");
    Car BMW6 = new Car("BMW", "X4", "2000", "black");
    Car BMW7 = new Car("BMW", "X4", "2000", "black");
    Car BMW8 = new Car("BMW", "X4", "2000", "red");
    Car BMW9 = new Car("BMW", "X4", "2000", "green");
    Car BMW10 = new Car("BMW", "X4", "2000", "green");
    Car BMW11 = new Car("BMW", "X4", "2000", "brown");
     */

    }


}

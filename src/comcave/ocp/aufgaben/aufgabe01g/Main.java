package ocp.aufgaben.aufgabe01g;

public class Main {
    public static void main(String[] args) {
        Auto myAuto = new Auto(
                "BMW",
                "i8",
                1998,
                150,
                2020 );

        myAuto.setHibraum(2000);

        System.out.println(myAuto);


    }
}

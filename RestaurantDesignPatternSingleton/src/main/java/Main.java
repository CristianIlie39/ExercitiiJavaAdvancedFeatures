public class Main {

    //exemplificam design pattern singleton pt un Restaurant -> meniul este unic

    public static void main(String[] args) {

        Meniu meniu = Meniu.getInstance();
        Meniu meniu1 = Meniu.getInstance();
        System.out.println("Bauturile din meniu sunt: " + meniu.getBauturi());
        System.out.println("Bauturile din meniu1 sunt: " + meniu1.getBauturi());

        meniu.setBauturi("Mirinda, Pepsi");
        System.out.println("Bauturile din meniu dupa modificare sunt: " + meniu.getBauturi());
        System.out.println("Bauturile din meniu1 dupa modificare sunt: " + meniu.getBauturi());

        /* in concluzie nu este nevoie sa instantiem mai multe obiecte, deoarece toate sunt la fel pt ca au aceeasi
        instanta in spate */


    }

}

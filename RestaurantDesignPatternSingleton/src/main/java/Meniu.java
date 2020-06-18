public class Meniu {

    /* pas 1: cream un constructor privat; intotdeauna constructorul clasei trebuie sa fie privat
       pas 2: cream o variabila/obiect de tipul Meniu care trebuie sa fie obligatoriu privat si static;
              variabila/obiectul creata il denumim instance
       pas 3: cream o metoda publica get de tipul Meniu pt variabila/obiectul creat */

    private String bauturi = "Fanta, Cola";

    private static Meniu instance = new Meniu(); //pas 2

    private Meniu() { //pas 1

    }

    public static Meniu getInstance() { //pas 3
        return instance;
    }

    public String getBauturi() {
        return bauturi;
    }

    public void setBauturi(String bauturi) {
        this.bauturi = bauturi;
    }

}

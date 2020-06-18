public class Main {

    //exemplificam Design Patern Singleton cu o clasa de elevi care au un catalog; catalogul este unic

    public static void main(String[] args) {

        Group group1 = Group.getInstance();
        Catalog catalog1 = Catalog.getInstance();

        //inceput de clasa a 9-a
        group1.setClasa("Clasa a 9-a A");
        catalog1.setName("Catalogul clasei a 9-a A");

        Group group2 = Group.getInstance();
        Catalog catalog2 = Catalog.getInstance();

        System.out.println("Clasa 1 este: " + group1.getClasa());
        System.out.println("Clasa 2 este: " + group2.getClasa());
        System.out.println("Catalogul 1 este: " + catalog1.getName());
        System.out.println("Catalogul 2 este: " + catalog2.getName());

        //inceput de clasa a 10-a
        group1.setClasa("Clasa a 10-a A");
        catalog1.setName("Catalogul clasei a 10-a A");

        System.out.println("Clasa 1 este: " + group1.getClasa());
        System.out.println("Clasa 2 este: " + group2.getClasa());
        System.out.println("Catalogul 1 este: " + catalog1.getName());
        System.out.println("Catalogul 2 este: " + catalog2.getName());

        /* in concluzie, desi modificarea s-a facut doar pt obiectele group1 si catalog1, s-a afisat acelasi rezultat
        si in cazul obiectelor group2 si catalog2 pt ca group2 are aceeasi instanta in spate ca si group1, iar
        catalog2 are aceeasi instanta in spate ca si catalog1 */

    }

}

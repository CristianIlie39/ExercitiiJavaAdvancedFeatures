public class CarMaker {

    public void makeAudi() {
        Audi audi = new Audi();
        audi.builds();
    }

    public void makeSeat() {
        Seat seat = new Seat();
        seat.builds();
    }

    public void makeVolkswagen() {
        Volkswagen volkswagen = new Volkswagen();
        volkswagen.builds();
    }
}

public class TV {

    private String mark;
    private String model;
    private int diagonal;

    public TV(String mark, String model, int diagonal) {
        this.mark = mark;
        this.model = model;
        this.diagonal = diagonal;
    }

    public TV() {

    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getDiagonal() {
        return diagonal;
    }

    @Override
    public String toString() {
        return "TV{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }
}

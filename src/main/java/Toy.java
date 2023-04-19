public class Toy implements Action {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Robot " + name + " is trying to stand up");

    }

    @Override
    public void play(Toy toy) {
        System.out.println("Robot " + name + " is happy to see another toy " + toy);
    }

    @Override
    public String toString() {
        return name;
    }
}

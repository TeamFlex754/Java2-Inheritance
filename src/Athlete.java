public class Athlete {

    private String name;
    private int age;
    private int strength;
    private int speed;

    public Athlete(String name, int age, int strength, int speed) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = speed;
    }

    public void run(int distance) {
        System.out.println(name + " runs " + distance +
                " yards in " + (distance/speed) + " seconds.");
    }

    public void jump(int height) {
        System.out.println(name + " jumps " + height +
                " inches with a strength level of " + strength + ".");
    }

}

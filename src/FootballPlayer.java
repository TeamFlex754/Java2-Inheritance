public class FootballPlayer extends Athlete{

    private String position;
    private boolean injured = true;

    public FootballPlayer(String name, int age, int strength,
                          int speed, String position, boolean injured) {
        super(name, age, strength, speed);
        this.position = position;
        this.injured = injured;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public boolean isInjured() {
        return injured;
    }
    public void setInjured(boolean injured) {
        this.injured = injured;
    }
    @Override
    public String toString() {
        return "Football Player: " +
                "\nName: " + getName() + "\nAge: " + getAge() + "\nStrength: " + getStrength() +
                "\nSpeed: " + getSpeed() + "\nPosition: " + getPosition() + "\nInjured: " + isInjured();
    }
}

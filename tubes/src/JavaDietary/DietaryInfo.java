package JavaDietary;

public abstract class DietaryInfo {
    protected String username;

    public DietaryInfo(String username) {
        this.username = username;
    }

    public abstract void displayInfo();
}

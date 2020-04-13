public class AFan {
    String color;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    boolean on;
    int radius;
    public AFan(String color, Boolean on, int radius){
        this.color = color;
        this.on = on;
        this.radius = radius;
    };

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

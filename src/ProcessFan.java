public class ProcessFan {
    public static void main(String[] args) {
        AFan fan1 = new AFan("Yellow", true, 10);
        AFan fan2 = new AFan("Blue", false, 5);
        System.out.println(fan1.isOn() + " "+fan1.getColor() +" " + fan1.getRadius());
        System.out.println(fan2.isOn() + " "+fan2.getColor() +" "+ fan2.getRadius());
    }
}

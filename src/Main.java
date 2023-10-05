public class Main {
    public static void main(String[] args) {
        BMI p1 = new BMI("Peter", 45, 380, 70);
        BMI p2 = new BMI("Harry", 32, 150, 70);
        
        p2.setNewWeight(139);

        System.out.println(p1.getName() + " has a BMI of " + p1.getBMI() + " : " + p1.getStatus());
        System.out.println(p2.getName() + " has a BMI of " + p2.getBMI() + " : " + p2.getStatus());
    }
}

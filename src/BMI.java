
public class BMI
 {
    //attributes
    String name;
    int age;
    double weight;
    double height;
    double kgPerLbs;
    double massPerInch;

    //Constructor
    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //Methods
    public double getBMI(){
        kgPerLbs = 0.4535;
        massPerInch = 0.0254;
        return (weight * kgPerLbs) / (height * massPerInch * height * massPerInch);
    }

    public String getStatus(){
        double BMI = getBMI();
        if(BMI < 18.5)
            return "Underweight";
        if(BMI >= 18.5 && BMI < 25)
            return "Normal";
        if(BMI >= 25 && BMI < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName() {
        return name;
    }

    public void setNewWeight(double weight){
        this.weight = weight;
    }
}

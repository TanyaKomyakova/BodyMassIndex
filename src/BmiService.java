public class BmiService {
    public float calculate(float mass, float growth){
        float b = 2;

         float growth2 = (float) ((Math.pow(growth, b)) / 10000);

        float bmi = mass / growth2;

        return bmi;

    }
}

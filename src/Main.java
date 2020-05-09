public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi = service.calculate(65,177);

        System.out.println(bmi);

    }
}

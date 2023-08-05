public class BmiService {
    public int calculate(int weightKg, double heightM) {
        return (int) (weightKg / (heightM * heightM));

    }
}

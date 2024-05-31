public class BmiService {
    public int body(int kg, double m) {
        // double m2 = m * m;
        double m2 = Math.pow(m, 2);
        double index = kg / m2;
        return (int) index;
    }
}
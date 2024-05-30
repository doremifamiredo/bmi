public class BmiService {
    public int body(int kg, double m) {
        double m2 = m * m;
        double index = kg / m2;
        return (int) index;
    }
}
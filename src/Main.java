public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        int m = 98;
        double h = 1.87;
        int bmi = calculate.body(m, h);
        System.out.println("Для человека с ростом " + h + "м и весом " + m + "кг индекс массы тела составляет " + bmi);

        System.out.println();
        m = 77;
        h = 1.7;
        bmi = calculate.body(m, h);
        System.out.println("Для человека с ростом " + h + "м и весом " + m + "кг индекс массы тела составляет " + bmi);
    }
}
public class Main {
    public static void main(String[] args) {
        BmiService massIndex = new BmiService();
        int result = massIndex.calculate(98, 1.87);
        System.out.println("Вес 98 кг, рост 1.87 м");
        System.out.println((result) + " Индекс массы тела");
        System.out.println();
        System.out.println("Вес 68 кг, рост 1.5 м");
        System.out.println((massIndex.calculate(68, 1.5) + " Индекс массы тела"));
        System.out.println();
        System.out.println("Вес 75 кг, рост 1.78 м");
        System.out.println((massIndex.calculate(75, 1.78) + " Индекс массы тела"));
    }
}
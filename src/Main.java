public class Main {

    public static void main(String[] args) {

        AbstractFactory factory = new ConcreteFactory();
        Elma elma =factory.getElma();
        Biber biber= factory.getBiber();

        System.out.println(elma.getType());
        System.out.println(biber.getType());
    }
}

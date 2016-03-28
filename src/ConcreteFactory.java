/**
 * Created by brusk on 28.03.2016.
 */
public class ConcreteFactory implements AbstractFactory
{
    @Override
    public Elma getElma() {
        return new KirmiziElma();
    }

    @Override
    public Biber getBiber() {
        return new DolmaBiber();
    }
}

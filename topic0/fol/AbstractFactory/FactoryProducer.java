package fol.AbstractFactory;

public class FactoryProducer {
    public static Abstractfactory getFactory(String type) {
        if (type.equalsIgnoreCase("connection")) {
            return new ConnectionFactory();
        }
        if (type.equalsIgnoreCase("server")) {
            return new ServerFactory();
        }
        return null;
    }
}

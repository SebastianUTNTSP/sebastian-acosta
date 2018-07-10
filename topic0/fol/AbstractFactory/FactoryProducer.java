package fol.AbstractFactory;

public class FactoryProducer {
    public static Abstractfactory getFactory(String type) {
        if(type != "connection" || type !="server") {
            if (type.equalsIgnoreCase("connection")) {
                return new DbFactory();
            }
            if (type.equalsIgnoreCase("server")) {
                return new DbFactory();
            }
        }
        return null;
    }
}

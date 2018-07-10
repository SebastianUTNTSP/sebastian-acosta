package fol.AbstractFactory;

public class FactoryProducer {
    public static Abstractfactory getFactory(String type) {
        try {
            if (type.equalsIgnoreCase("connection")) {
                return new DbFactory();
            }
            if (type.equalsIgnoreCase("server")) {
                return new DbFactory();
            }
        } catch (Exception e){

            e.printStackTrace();
        }
            throw new IllegalArgumentException("That Factory Doesnt Exist");
    }
}
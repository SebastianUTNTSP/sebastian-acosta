package fol.AbstractFactory;


public abstract class Abstractfactory {
    abstract Connection getConnection(String type);

    abstract Servers getServer(String type);

}

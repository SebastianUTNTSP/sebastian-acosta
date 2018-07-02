package fol.AbstractFactory;

public class Demo {
    public static void main(String[] args) {

        Abstractfactory cf = FactoryProducer.getFactory("connection");
        Abstractfactory sf = FactoryProducer.getFactory("server");
        Connection conn = cf.getConnection("mssql");
        System.out.println(conn.connect());

        Servers serv = sf.getServer("mssql");
        System.out.println(serv.getUrl());
    }
}

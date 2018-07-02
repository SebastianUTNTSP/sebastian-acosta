package fol.AbstractFactory;

public class ConnectionFactory extends Abstractfactory {
    @Override
    Connection getConnection(String type) {
        if (type.equalsIgnoreCase("oracle")) {
            return new OracleDB();
        }
        if (type.equalsIgnoreCase("mssql")) {
            return new Mssql();
        }
        return null;

    }

    @Override
    Servers getServer(String type) {
        return null;
    }
}

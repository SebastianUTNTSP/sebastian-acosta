package fol.AbstractFactory;

public class ServerFactory extends Abstractfactory {

    @Override
    Connection getConnection(String type) {
        return null;
    }

    @Override
    Servers getServer(String type) {
        if (type.equalsIgnoreCase("Mssql")) {
            return new MssqlServer();
        }
        if (type.equalsIgnoreCase("OracleDB")) {
            return new OracleServer();
        }
        return null;
    }
}

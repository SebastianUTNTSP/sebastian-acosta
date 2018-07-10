package fol.AbstractFactory;

public class DbFactory extends Abstractfactory {
    @Override
    Connection getConnection(String type) {
        if(type != "oracle" || type !="mssql") {
            if (type.equalsIgnoreCase("oracle")) {
                return new OracleDB();
            }
            if (type.equalsIgnoreCase("mssql")) {
                return new Mssql();
            }
        }
        return null;

    }

    @Override
    Servers getServer(String type) {
        if(type != "Mssql" || type !="OracleDB") {
            if (type.equalsIgnoreCase("Mssql")) {
                return new MssqlServer();
            }
            if (type.equalsIgnoreCase("OracleDB")) {
                return new OracleServer();
            }
        }
                return null;
    }
}

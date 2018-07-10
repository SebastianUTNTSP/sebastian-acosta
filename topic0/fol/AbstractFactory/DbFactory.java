package fol.AbstractFactory;

public class DbFactory extends Abstractfactory {
    @Override
    Connection getConnection(String type) {
        try {
            if (type.equalsIgnoreCase("oracle")) {
                return new OracleDB();
            }
            if (type.equalsIgnoreCase("mssql")) {
                return new Mssql();
            }
        } catch (IllegalArgumentException e){

            e.printStackTrace();

        }
    throw new IllegalArgumentException("That connection is not available");

    }

    @Override
    Servers getServer(String type) {
        try {
            if (type.equalsIgnoreCase("Mssql")) {
                return new MssqlServer();
            }
            if (type.equalsIgnoreCase("OracleDB")) {
                return new OracleServer();
            }
        } catch (Exception e){
            e.printStackTrace();

        }
        throw new IllegalArgumentException("That connection is not available");
    }
}

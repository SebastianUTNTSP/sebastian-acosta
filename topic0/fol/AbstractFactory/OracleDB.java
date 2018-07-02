package fol.AbstractFactory;

public class OracleDB implements Connection {


    @Override
    public String connect() {
        return "OracleDB CONNECTED...";
    }
}

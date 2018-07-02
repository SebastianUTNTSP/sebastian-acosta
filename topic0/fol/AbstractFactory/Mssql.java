package fol.AbstractFactory;

public class Mssql implements Connection {


    @Override
    public String connect() {
        return "MSSQL CONNECTED...";
    }
}

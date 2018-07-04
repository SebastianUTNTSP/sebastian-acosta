package Builder;

public class User {

    private final String name;
    private final int id;
    private final String email;
    private final Address address;
    private final String password;

    private User (Builder build){
        this.id = build.id;
        this.name=build.name;
        this.email=build.email;
        this.address=build.address;
        this.password=build.password;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }



public static class Builder{
    private String name;
    private int id;
    private String email;
    private Address address;
    private String password;


    public Builder name(String name){
        this.name = name;
        return this;
    }
    public Builder id(int id){
        this.id=id;
        return this;
    }
    public Builder email(String email){
        this.email=email;
        return this;
    }
    public Builder address(Address address){
        this.address = address;
        return this;
    }

    public Builder pass(String password){
        this.password=password;
        return this;
    }
    public User build(){
        return new User(this);
    }


}




}

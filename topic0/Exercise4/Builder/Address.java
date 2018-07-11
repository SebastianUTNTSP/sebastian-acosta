package topic0.Exercise4.Builder;

public class Address {
    private final int houseNumber;
    private final String city;
    private final int zipcode;
    private final String street;

    private Address(Builder build) {
        this.houseNumber = build.houseNumber;
        this.city = build.city;
        this.zipcode = build.zipcode;
        this.street = build.street;


    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getStreet() {
        return street;
    }

    public static class Builder {
        private int houseNumber;
        private String city;
        private int zipcode;
        private String street;


        public Builder houseNumber(final int number) {
            houseNumber = number;
            return this;
        }

        public Builder city(final String city) {
            this.city = city;
            return this;
        }

        public Builder zipcode(final int zipcode) {
            this.zipcode = zipcode;
            return this;
        }

        public Builder street(final String street) {
            this.street = street;
            return this;
        }

        public Address build(){
           return new Address(this);
        }
    }
}

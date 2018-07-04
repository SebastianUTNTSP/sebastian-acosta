package Builder;

public class DemoBuilder {
        public static void main(String[] args){


            //BuildingUsers
            Address ad = new Address.Builder().houseNumber(400)
                                              .city("Resistencia")
                                              .zipcode(3500)
                                              .street("Araza")
                                              .build();
            User user1 = new User.Builder() .address(ad)
                                            .name("Sebastian")
                                            .email("qwert@gmail.com")
                                            .id(1)
                                            .pass("******")
                                            .build();





        }
}

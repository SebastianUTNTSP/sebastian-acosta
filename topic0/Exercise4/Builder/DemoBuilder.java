package topic0.Exercise4.Builder;
public class DemoBuilder {
        public static void main(String[] args){
            //BuildingUsers
            Address ad = new Address.Builder().houseNumber(400)
                                              .giveCity("Resistencia")
                                              .giceZipcode(3500)
                                              .giveStreet("Araza")
                                              .build();
            User user1 = new User.Builder() .address(ad)
                                            .giveName("Sebastian")
                                            .giveEmail("qwert@gmail.com")
                                            .giveId(1)
                                            .givePass("******")
                                            .build();
        }
}

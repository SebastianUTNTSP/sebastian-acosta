import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    private Service newservice;
    File file5;
    File file6;
    File file7;


    @BeforeEach
    void setUp() {
        newservice = new Service();
        file5 = new File("Log.txt","Log","C://ProgramFiles//File//Log.txt");
         file6 = new File("Headphones.txt","Headphones models","C://ProgramFiles//File/Headphones.txt");
         file7 = new File("Support.txt","JUST DONT GIVE UP","C://ProgramFiles//File/Support.txt");
    }

    @Test
    void listShouldInitializedEmpty() {

        assertEquals(0,newservice.getSize());
    }
    @Test
    void whenServiceCallAddSizeShouldReturnNotEmpty() {
        newservice.addRecentList(file5);
        assertEquals(1,newservice.getSize());
        assertFalse(newservice.empty());
    }
    @Test
    void repeatingFilesCheckingSize() {
        newservice.addRecentList(file5);
        newservice.addRecentList(file6);
        newservice.addRecentList(file7);
        newservice.addRecentList(file5);
        assertEquals(3,newservice.getSize());
    }
    @Test
    void empty() {
        assertEquals(true,newservice.empty());
    }
    @Test
    void emptyWithFiles() {
        newservice.addRecentList(file6);
        assertEquals(false,newservice.empty());
    }
}
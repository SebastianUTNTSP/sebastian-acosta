import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
    private Service newservice = new Service();
    Files file5 = new Files("Log.txt","Log","C://ProgramFiles//Files//Log.txt");
    Files file6 = new Files("Headphones.txt","Headphones models","C://ProgramFiles//Files/Headphones.txt");
    Files file7 = new Files("Support.txt","JUST DONT GIVE UP","C://ProgramFiles//Files/Support.txt");


    @Test
    void getRecentFiles() {
    }

    @Test
    void getSizeWithNoFiles() {

        assertEquals(0,newservice.getSize());
    }
    @Test
    void getSizeWithFiles() {
        newservice.addRecentList(file5);
        assertEquals(1,newservice.getSize());
    }
    @Test
    void getSizeWithSameFiles() {
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
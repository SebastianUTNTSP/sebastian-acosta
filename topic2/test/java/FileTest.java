import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {
    File newfiles = new File("test.txt","testing like a champ","C://ProgramFiles//File//test.txt");
    @Test
    void openFile() {
        newfiles.openFile();
        assertEquals("testing like a champ",newfiles.openFile());

    }
    @Test
    void closeFile(){
        newfiles.closeFile();
        assertEquals("File closed",newfiles.closeFile());

    }


    @Test
    void verifyFileName(){
        assertEquals("test.txt",newfiles.getName());
    }
}
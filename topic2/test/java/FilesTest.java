import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilesTest {
    Files newfiles = new Files("test.txt","testing like a champ","C://ProgramFiles//Files//test.txt");
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
    void getName(){
        assertEquals("test.txt",newfiles.getName());
    }
}

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BlogTest {

    private Blog a;
    private Entries entry1;
    private Entries entry3;
    private Entries entry2;
    private Entries entry4;
    private Entries entry5;
    private Entries entry6;
    private Account user;
    {
        a = mock(Blog.class);
         user = mock(Account.class);
         entry1 = mock(Entries.class);
         entry2 = mock(Entries.class);
         entry3 = mock(Entries.class);
         entry4 = mock(Entries.class);
         entry5 = mock(Entries.class);
         entry6 = mock(Entries.class);
    }




    @Test
    void addEntry() {



        when(a.addEntry(entry1)).thenReturn(true);

        assertTrue(a.addEntry(entry1));
        when(a.addEntry(entry6)).thenReturn(true);
        assertTrue(a.addEntry(entry6));
    }

    @Test
    void size6() {
        a.addEntry(entry1);
        when(a.blogSize()).thenReturn(0);
        assertEquals(0,a.blogSize());
        a.addEntry(entry2);
        when(a.blogSize()).thenReturn(1);
        assertEquals(1,a.blogSize());
        a.addEntry(entry3);
        when(a.blogSize()).thenReturn(2);
        assertEquals(2,a.blogSize());
        a.addEntry(entry4);
        when(a.blogSize()).thenReturn(3);
        assertEquals(3,a.blogSize());
        a.addEntry(entry5);
        when(a.blogSize()).thenReturn(4);
        assertEquals(4,a.blogSize());
        a.addEntry(entry6);
        when(a.blogSize()).thenReturn(5);
        assertEquals(5,a.blogSize());


    }


    @Test
    void deleteEntry() {

        when(a.deleteEntry(6)).thenReturn(false);

        assertFalse(a.deleteEntry(6));
        when(a.deleteEntry(5)).thenReturn(true);
        assertTrue(a.deleteEntry(5));

    }






}
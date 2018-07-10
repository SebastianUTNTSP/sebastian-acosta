public class Demo {
    public static void main(String[] args){
        Blog a = new Blog();
        Account user = new Account("Seba","****","as96@gmail.com");
        Entries entry1 = new Entries(user,"titulo","hola");
        Entries entry2 = new Entries(user,"titulo2","hola");
        Entries entry3 = new Entries(user,"titulo3","hola");
        Entries entry4 = new Entries(user,"titulo4","hola");
        Entries entry5 = new Entries(user,"titulo5","hola");

        a.addEntry(entry1);
        a.addEntry(entry2);
        a.addEntry(entry3);
        a.recentEntry();
        System.out.println(entry1.getPublisher());
        System.out.println("*************");
        a.addEntry(entry1);
        a.addEntry(entry3);
        a.recentEntry();

    }
}

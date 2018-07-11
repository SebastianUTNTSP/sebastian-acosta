public class Demo {
        public static void main(String[] args){


                File file1 = new File("Color.txt","Aca estan la paletas de colores","C://ProgramFiles//File/Color.txt");
                File file2 = new File("Textura.txt","Aca estan todos las texturas","C://ProgramFiles//File/Textura.txt");
                File file3 = new File("Premio.txt","You won!","C://ProgramFiles//File/Premio.txt");
                File file4 = new File("Computer.txt","Computer Requirements","C://ProgramFiles//File/Computer.txt");
                File file5 = new File("Log.txt","Log","C://ProgramFiles//File//Log.txt");

                Service list = new Service();

                file1.openFile();
                list.addRecentList(file1);
                file2.openFile();
                list.addRecentList(file2);
                file3.openFile();
                list.addRecentList(file3);
                file4.openFile();
                list.addRecentList(file4);
                file5.openFile();
                list.addRecentList(file5);
                list.printList();
                System.out.println("************");
                file3.openFile();
                //Agregando un file repetido
                list.addRecentList(file3);
                list.printList();



        }
}

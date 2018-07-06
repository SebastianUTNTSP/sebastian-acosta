public class Demo {
        public static void main(String[] args){


                Files file1 = new Files("Color.txt","Aca estan la paletas de colores","C://ProgramFiles//Files/Color.txt");
                Files file2 = new Files("Textura.txt","Aca estan todos las texturas","C://ProgramFiles//Files/Textura.txt");
                Files file3 = new Files("Premio.txt","You won!","C://ProgramFiles//Files/Premio.txt");
                Files file4 = new Files("Computer.txt","Computer Requirements","C://ProgramFiles//Files/Computer.txt");
                Files file5 = new Files("Log.txt","Log","C://ProgramFiles//Files//Log.txt");

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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Service {
    public  ArrayList<Files> recentFiles = new ArrayList<Files>();




    public Service(){

    }



    public void addRecentList(Files file) {

        if (recentFiles.size() < 15 || recentFiles.contains(file)) {

            if (recentFiles.isEmpty()) {
                recentFiles.add(file);
            } else if (recentFiles.contains(file)) {
                int swap = recentFiles.indexOf(file);
                recentFiles.set(swap, recentFiles.get(0));
                recentFiles.set(0, file);
            } else
                recentFiles.add(file);
        } else  {
            recentFiles.remove(0);
            recentFiles.add(file);

            }
        }

    public void printList(){

        for(Files e: recentFiles){
            System.out.println(e.getName());
        }
    }


    public ArrayList<Files> getRecentFiles() {
        return recentFiles;
    }
    public int getSize() {
        return recentFiles.size();
    }
    public boolean empty(){
        return recentFiles.isEmpty();
    }

    public void setRecentFiles(ArrayList<Files> recentFiles) {
        recentFiles = recentFiles;
    }
}

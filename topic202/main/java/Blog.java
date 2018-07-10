import java.util.ArrayList;

public class Blog {

    private ArrayList<Entries> blogentries;





    public Blog() {

        this.blogentries = new ArrayList<Entries>();
    }


    public boolean addEntry(Entries entry){
        if(entry!= null && !blogentries.contains(entry)) {
            blogentries.add(entry);
            return true;
        } else
                return false;



    }
    public boolean deleteEntry(int index){
        if(!blogentries.isEmpty()){
        if(index < blogentries.size()) {
            blogentries.remove(index);
            return true;
        } else System.out.println("Index not found, try again");
            return false;
        } else
                return false;

    }
    public void recentEntry(){
        if(blogentries.size() > 4) {
            for (int i = 0; i < 5; i++) {
                System.out.println(blogentries.get(i).getTitle());

            }
        } else for(int i = 0;i<blogentries.size();i++){
            System.out.println(blogentries.get(i).getTitle());
        }

    }




    public int blogSize(){
        return blogentries.size();
    }





    public ArrayList<Entries> getEntries() {
        return blogentries;
    }

    public void setEntries(ArrayList<Entries> entries) {
        this.blogentries = entries;
    }


}

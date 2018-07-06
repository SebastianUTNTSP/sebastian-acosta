public class Files {
    private String name;
    private String text;
    private String path;
    private boolean state;




    public Files(String name, String text, String path) {
        this.name = name;
        this.text = text;
        this.path = path;
        this.state=false;
    }

    public boolean openFile(){
        if(this.state==false){
            state= true;
            return true;
        } else
            return false;

    }
    public boolean closeFile(){
        if(this.state==true){
            state = false;
            return true;
        } else return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    @Override
    public String toString() {
        return
                " " + name ;

    }
}

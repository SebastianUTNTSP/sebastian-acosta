

public class Entries {


    public Account publisher;
    public String title;
    public String text;



    public Entries( Account publisher, String title, String text) {

        this.publisher=publisher;
        this.title = title;
        this.text = text;
    }



    public String getPublisher() {
        return publisher.getUser();
    }
    public Account getAccount(){
    return publisher;
    }
    public void setPublisher(Account publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

public class Book {

    String namn;
    String författare;
    String år;
    String upplaga;
    boolean status;


    public Book()  {
        this.namn = "--";
        this.författare = "--";
        this.år = "0";
        this.upplaga = "--";
        this.status = true;
    }
    public Book(String namn, String Författare, String år, String upplaga, boolean status) {
        this.namn = namn;
        this.författare = författare;
        this.år = år;
        this.upplaga = upplaga;
        this.status = status;
    }

    public void greet() {System.out.println("Hej jag heter " + this.namn); }


    public String toString() {
        return "Name: " + this.namn + "Författare : " + this.författare + "År: " + this.år + "Upplaga: " + this.upplaga
                + "Status: " + this.status;
    }



}

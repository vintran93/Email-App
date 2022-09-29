package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email em1 = new Email("Vincent", "Tran");

        em1.setAlternateEmail("vt@gmail.com");
        System.out.println("Alternate Email: " + em1.getAlternateEmail());

        System.out.println(em1.showInfo());
    }

}
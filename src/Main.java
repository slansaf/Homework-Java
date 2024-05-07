public class Main{
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Dima", "89773521212");
        phoneBook.addContact("Max", "8987654322");
        phoneBook.addContact("Max", "8987654321");
        phoneBook.addContact("Marina", "89564561239");
        phoneBook.addContact("Masha", "89634567896");
        phoneBook.addContact("Dima", "89504562122");
        phoneBook.addContact("Dima", "89674562378");

        phoneBook.displayContacts();
    }
}

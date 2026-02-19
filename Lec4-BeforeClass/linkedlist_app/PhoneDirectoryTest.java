package linkedlist_app;

//same as Lec 3
public class PhoneDirectoryTest {

    public static void main(String[] args) {

        //create and use a phone directory
        PhoneDirectory myPhoneBook = new PhoneDirectory();
        myPhoneBook.addEntry("Biden", "111-111-1111");
        myPhoneBook.addEntry("Harris", "222-222-2222");        
        System.out.println(myPhoneBook);
    }

}

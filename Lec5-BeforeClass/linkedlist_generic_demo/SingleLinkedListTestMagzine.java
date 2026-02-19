package linkedlist_generic_demo;


public class SingleLinkedListTestMagzine {

    public static void main(String[] args) {

        SingleLinkedList<Magazine> myMagList
                = new SingleLinkedList<Magazine>();

        myMagList.add(new Magazine("Times", "Edward Felsenthal"));
        myMagList.add(new Magazine("Vogue", "Anna Wintour"));
        myMagList.add(new Magazine("Reader's Digest", "Bruce Kelley"));

        System.out.println(myMagList);

    }

}

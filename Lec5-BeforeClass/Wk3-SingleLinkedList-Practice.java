Week 3 Single Linked list Practice

1.
Covert the code below to the code that directly manipulate nodes in the linked list.
Add your code to main(...) method in SingleLinkedList<E> class.

        SingleLinkedList<String> movieList = new SingleLinkedList<>();

        movieList.add("Avengers: End Game");
        movieList.add("Spider Man: Far From Home");
        movieList.add("Star Wars: The Rise of Skywalker");
        System.out.println(movieList);

        System.out.println(movieList.get(1));

        String newMovie = "Spider Man: No Way Home";
        movieList.add(2, newMovie);
        System.out.println(movieList);

		movieList.remove(2);
        System.out.println(movieList);


2.
rewrite the generic method addAfter for SimpleLinkedList class
and test it in main()
            //precondition: node is not null
        private void addAfter(Node<E> node, E data)


3.
Rewrite the following methods so that they don't call any other methods
   and do everything from scratch

   public E get(int index)
   public E set(int index, E item)



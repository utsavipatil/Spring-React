package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        System.out.println("Print all numbers in the intNumbersStream stream");
        StreamSources.intNumbersStream().forEach(number -> System.out.print(number + " "));
        System.out.println();

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        System.out.println("Print numbers from intNumbersStream that are less than 5");
        StreamSources.intNumbersStream().filter(number -> number < 5).forEach(number -> System.out.print(number + " "));
        System.out.println();

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        System.out.println("Print the second and third numbers in intNumbersStream that's greater than 5");
        System.out.print(StreamSources.intNumbersStream().filter(number -> number > 5).toList().get(1) + " ");
        System.out.print(StreamSources.intNumbersStream().filter(number -> number > 5).toList().get(2) + " ");
        System.out.println();

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        System.out.println("Print the first number in intNumbersStream that's greater than 5 and If nothing is found, print -1");
        if (StreamSources.intNumbersStream().anyMatch(number -> number > 5)) {
            System.out.println(StreamSources.intNumbersStream().filter(number -> number > 5).findFirst());
        } else {
            System.out.println("-1");
        }

        // Print first names of all users in userStream
        // TODO: Write code here
        System.out.println("Print first names of all users in userStream");
        StreamSources.userStream().forEach(user -> System.out.print(user.getFirstName() + " "));
        System.out.println();

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        System.out.println("Print first names in userStream for users that have IDs from number stream");
//        StreamSources.userStream().forEach(user -> StreamSources.intNumbersStream().forEach(number -> number == user.getId()));

    }

}

package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String [] args){
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What word are you looking for?: ");
        String word = input.next();


        if (aliceSentence.contains(word)){
            System.out.println(word + " is in the Alice's first sentence");
        } else {
            System.out.println(word + " is not in the Alice's first sentence");
        }

        int index = aliceSentence.indexOf(word);
        int length = word.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = aliceSentence.replace(word, "");
        System.out.println(modifiedSentence);
    }
}

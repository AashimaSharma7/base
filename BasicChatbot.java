import java.util.Scanner;

public class BasicChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Chatbot: Hi there! How can I assist you today?");

        while (true) {
            System.out.print("User: ");
            userInput = scanner.nextLine().toLowerCase();  // Convert input to lowercase for case-insensitive matching

            String[] words = userInput.split(" ");
            String firstWord = words[0];

            // Generate response based on the first word
            String response;
            switch (firstWord) {
                case "hello":
                    response = "Hello! How are you?";
                    break;
                case "bye":
                    response = "Goodbye!thanks Have a nice day!";
                    scanner.close();
                    return;  // Exit the program
                case "thank", "thanks":
                    response = "You're welcome!";
                    break;
                case "good":
                    response = "nice to hear that! How can i help?";
                    break;
                default:
                    response = "Sorry, I didn't understand that. Can you please rephrase?";
                    break;
            }

            System.out.println("Chatbot: " + response);
        }
    }
}

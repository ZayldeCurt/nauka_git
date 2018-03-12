package opp.message;

public class MessageApp {

    public static void main(String[] args) {
        DictionaryMessage dictionaryMessage = new DictionaryMessage();
        DictionaryMessage customMessage = new DictionaryMessage(new String[]{"Ala","ma","kota"});

        RandomMessage smallRandomMessage = new RandomMessage(0,10);
        RandomMessage bigRandomMessage = new RandomMessage(-10000,10000);

        Message[] messages = {dictionaryMessage,
                smallRandomMessage,
                customMessage,
                new RandomMessage(100,100),
                new DictionaryMessage(new String[]{"jupi","jep"}),
                bigRandomMessage};

        printMessage(messages);


    }

    public static void printMessage(Message[] messages){
        for (int i = 0; i < messages.length; i++) {
            System.out.println("Message ["+i+"] = "+messages[i].getMessage());
        }
    }




}

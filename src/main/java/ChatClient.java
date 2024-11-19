public class ChatClient {

    private String userName;
    private int port;

    public static void main(String[] args) {
        // Get username and port number from command-line arguments
        String userName = "Anonymous"; // default username
        int port = 4688; // default port number

        // Handle the command-line arguments
        if (args.length > 0) {
            userName = args[0];
            if (args.length > 1) {
                port = Integer.parseInt(args[1]);
            }
        }

        new ChatClient(userName, port);
    }

    public ChatClient(String userName, int port) {
        this.userName = userName;
        this.port = port;
    }
}

public class NodeNotFoundException extends Exception {

    private String message = "Node not found!";

    @Override
    public String getMessage() {
        return message;
    }
}

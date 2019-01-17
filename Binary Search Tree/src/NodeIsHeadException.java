public class NodeIsHeadException extends Exception {

    private String message = "Node is head!";

    @Override
    public String getMessage() {
        return message;
    }
}

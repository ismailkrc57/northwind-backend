package kodlama.io.northwind.core.utilities.results;

public class ErorResult extends Result {
    public ErorResult(boolean success) {
        super(false);
    }

    public ErorResult(String message) {
        super(false, message);
    }
}

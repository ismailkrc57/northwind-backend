package kodlama.io.northwind.core.utilities.results;

    public class ErorDataResult<T> extends DataResult<T> {
        public ErorDataResult(T data, String message) {
            super(data, false, message);
        }

        public ErorDataResult(T data) {
            super(data, false);
        }

        public ErorDataResult(String message) {
            super(null, false, message);
        }

        public ErorDataResult() {
            super(null, false);
        }

    }

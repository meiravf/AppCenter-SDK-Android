package avalanche.errors.model;

/**
 * Exception for test crash
 */
public class TestCrashException extends RuntimeException {

    public TestCrashException() {
        super("Test crash exception generated by SDK");
    }

    @SuppressWarnings("unused")
    private TestCrashException(String detailMessage) {
        throw new UnsupportedOperationException();
    }

    @SuppressWarnings("unused")
    private TestCrashException(String detailMessage, Throwable throwable) {
        throw new UnsupportedOperationException();
    }

    @SuppressWarnings("unused")
    private TestCrashException(Throwable throwable) {
        throw new UnsupportedOperationException();
    }
}

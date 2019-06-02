package facade.pagemaker;

import java.util.function.Consumer;

public class StreamHelper {

    private StreamHelper() {}

    public static <T> Consumer<T> throwingConsumer(ThrowingConsumer<T> target) {
        return (param -> {
            try {
                target.accept(param);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e) {
                throw new ExceptionWrapper(e);
            }
        });
    }

    @FunctionalInterface
    public static interface ThrowingConsumer<T> {
        public void accept(T t) throws Exception;
    }

    public static class ExceptionWrapper extends RuntimeException {
        private ExceptionWrapper(Throwable cause) {
            super(cause);
        }
    }
}

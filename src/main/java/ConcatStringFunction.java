import java.util.StringJoiner;

@FunctionalInterface
public interface ConcatStringFunction {
    String apply(String ...str);
}

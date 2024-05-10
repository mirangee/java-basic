package etc.lambda;
@FunctionalInterface
public interface GenericFunction<X, Y> {

    // X를 매개변수로 주면 Y를 추출해 주겠다는 의미
    Y apply(X x);
}

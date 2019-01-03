import io.reactivex.Flowable;

import java.util.Arrays;

public class App {

    static {

    }

    {

    }

    public App() {

    }

    public static void main(String[] args) {
        Flowable.just("Hello World").subscribe(System.out::println);
        Arrays.asList(new int[]{1,2,3,4,5,6}).forEach(System.out::println);
    }
}
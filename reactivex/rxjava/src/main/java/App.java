public class App {

    static {

    }

    {

    }

    public App() {

    }

    public static void main(String[] args) {
        System.out.println(Request.ID);
    }
}

// запрос
class Request {
    public static final Integer ID=1;
    private Request() {}
    private Request(Data data) {

    }
}

// данные
class Data {
    Data() {}
}
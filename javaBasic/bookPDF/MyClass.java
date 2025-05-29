public class MyClass {
    public String sayHi(String name) {
        return "Hello" + name;
    }

    public String counterRun(int count) {

        String data = "";
        for(int i = 1; i <= count; i++) {
            data += (i + "") + " ";
        }
        return data;
    }
}
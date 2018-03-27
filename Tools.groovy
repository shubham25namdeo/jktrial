public class Demo {
     String message;

     Demo(String message) {
        this.message=message;
     }


    public void print_data() {
        println(message)
    }
}

public Demo newSystemConfig(String m) {
    return new Demo(m)
}
return this

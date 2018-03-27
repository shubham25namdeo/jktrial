public class Demo {
     String message;

     Demo(String message) {
        this.message=message;
        print_data(this.message)
     }


    public print_data(String message) {
        println(message)
    }
}

public Demo newSystemConfig(String m) {
    return new Demo(m)
}
return this

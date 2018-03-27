public class Demo {
     String message;
     private Object script

     Demo(String message, Object script) {
        this.message=message;
        this.script=script;
     }


    public void print_data() {
        script.println(message)
    }
}

public Demo newSystemConfig(String m, Object script) {
    return new Demo(m,script)
}
return this

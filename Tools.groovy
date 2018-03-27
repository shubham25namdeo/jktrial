public class Demo {
     String message;

     Demo(String message) {
        this.message=message;
        print(this)
     }


    public void print(def script) {
        script.sh "echo " + message
    }
}
return this

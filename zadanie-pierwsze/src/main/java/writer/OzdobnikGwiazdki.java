package writer;

public class OzdobnikGwiazdki implements IOzdobnik {
    @Override
    public String ozdob(String s) {
        return "*****" + s + "*****";
    }
}
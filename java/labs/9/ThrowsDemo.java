public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
            try {
                throw new NullPointerException( "null key in getDetails");
            }
            catch (NullPointerException e) { }

        }
        return "data for " + key;
    }
}

public class Main {

    public static final String generateShape(int n) {

        String result = "";

        for(int j=0; j<n; j++){
            String temostring = "";
            for(int i=0; i<n; i++){
                temostring = temostring+"+";
            }
            temostring = temostring+"\n";
            result = result + temostring;
        }

        return result.substring(0,result.length()-1);
    }


}

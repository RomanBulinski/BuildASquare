public class Main {

    public static final String generateShape(int n) {

        if(n==0){
            return "";
        }else{
            String result = "";
            for(int j=0; j<n; j++){
                String temostring = "";
                for(int i=0; i<n; i++){
                    temostring = temostring+"+";
                }
                result = result + temostring+"\n";
            }
            return result.substring(0,result.length()-1);
        }
    }


}

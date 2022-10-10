package replit;

public class replit128 {
    static String mixString(String s1,String s2){
        String s3 = null;
        for (int i=0;i<s1.length();i++){
            for (int j=0;j<s2.length();j++){
                s3= String.valueOf(s1.charAt(i)+s2.charAt(j));

            }
        }
        return s3;
    }
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }
}

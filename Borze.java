import java.util.*;
public class Borze {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.next();
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='.'){
                ans.append("0");
            }else if (i + 1 < st.length()){
                if (st.charAt(i + 1) == '.') {
                    ans.append("1");
                }else {
                    ans.append("2");
                }
                i++;
            }
        }
        System.out.println(ans);
    }
}

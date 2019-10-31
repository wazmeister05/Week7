public class Repeat {

    public static String repeat1(char c, int n){
        String answer = "";
        for(int j = 0; j < n; j++){
            answer += c;
        }
        return answer;
    }

}

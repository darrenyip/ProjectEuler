/**
 * Created by Darren on 11/15/2017.
 */
public class no1 {
    public static void main(String[] args) {
        int counter = 0;
        for(int i=1; i<101; i++){

            if(i%3==0 || i%5==0){
                counter +=i;
            }
        }

        System.out.println(counter);
    }
}

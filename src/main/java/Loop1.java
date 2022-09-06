import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop1 implements Solution {

    @Override
    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = 0;
        try {
            N = Integer.parseInt(bufferedReader.readLine().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 1; i < 11; i++ ) {
            int a = N;
            int b = i;
            int result = N*i;

            System.out.println(a + " x " + b + " = " + result);
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

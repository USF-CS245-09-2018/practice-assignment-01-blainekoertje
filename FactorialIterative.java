public class FactorialIterative implements Factorial {

    public int factorial(int n)
    {
        int f = 1;
        for(int i = n; i > 0; i--)
            f = f * i;
        return f;
    }



}

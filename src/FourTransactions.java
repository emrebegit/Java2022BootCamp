public class FourTransactions {
    public int sumTransaction(int num1, int num2){
        return num1 + num2;
    }
    public int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public int extraction(int num1, int num2){
        if(num1>num2){
            return num1 - num2;
        }
        return num2 - num1;
    }
    public int dimension(int num1, int num2){
        if(num1>num2){
            return num1 / num2;
        }
        return num2 / num1;
    }
}

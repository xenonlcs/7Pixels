public class Calculator {

    public int parse(String text) {
        int sum = 0;

        for(String number : text.split(",")){
            sum += safeParse(number);
        }

        return sum;
    }


    public int safeParse(String text){
        try{
            return Integer.parseInt(text);
        }catch (NumberFormatException notANumber){
            return 0;
        }
    }
}

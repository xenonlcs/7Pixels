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
            return safeParseString(text);
        }
    }

    public int safeParseString(String text){
        char[] textChar = text.toCharArray();
        int number = 0;
        for(int i=0; i<textChar.length; i++){
            int pot10 = textChar.length - (i+1);
            number += (getIntValue(textChar[i])*Math.pow(10,pot10));
        }
        return number;

    }

    public int getIntValue(int character){
        if(character>=65 && character<=90 ){
            return character - 64;
        }else if (character >= 97 && character <= 122){
            return character - 96;
        }
        else return 0;
    }
}

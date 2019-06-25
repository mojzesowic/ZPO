package Lab1;

public class NumberToWords {
    private byte numberByte[] = new byte[3];
    private boolean valid = false;

    public NumberToWords(String userNumber){
        if (userNumber.length() != 3){
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < 3; i++){
                numberByte[i] = Byte.parseByte(userNumber.substring(i, i+1));
            }
            valid = true;
        }
    }

    void getByte(){
        System.out.println(numberByte[0] + numberByte[1] + numberByte[2]);
    }

//    public boolean isValid() {
//        return valid;
//    }

    public String getWords(){
        String words = "";
        if (numberByte[0] < 0)
            words += "minus ";

        for (int i = 0; i<3 ; i++){
            switch (numberByte[i]){
                case 1:
                case -1:
                    words += "jeden ";
                    break;
                case 2:
                case -2:
                    words += "dwa ";
                    break;
                case 3:
                case -3:
                    words += "trzy ";
                    break;
                case 4:
                case -4:
                    words += "cztery ";
                    break;
                case 5:
                case -5:
                    words += "pięć ";
                    break;
                case 6:
                case -6:
                    words += "sześć ";
                    break;
                case 7:
                case -7:
                    words += "siedem ";
                    break;
                case 8:
                case -8:
                    words += "osiem ";
                    break;
                case 9:
                case -9:
                    words += "dziewięć ";
                    break;
                case 0:
                    words += "zero ";
                    break;
            }
        }

        return words;
    }

}

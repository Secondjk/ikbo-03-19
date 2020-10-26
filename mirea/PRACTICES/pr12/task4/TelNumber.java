package ru.mirea.practices.pr12.task4;

public class TelNumber {
    private final String telNumber;

    public TelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getNumber() {
        String s = "+";
        if (telNumber.indexOf("+") == 0){
            s += telNumber.substring(1, telNumber.length() - 7) + "-"
                    + telNumber.substring(telNumber.length() - 7, telNumber.length() - 4) + "-"
                    + telNumber.substring(telNumber.length() - 4);
        }
        else {
            s += "7"+ telNumber.substring(1, 4) + "-"
                    + telNumber.substring(4, 7) + "-"
                    + telNumber.substring(7);
        }

        return s;
    }

    public static void main(String[] args) {
        TelNumber telNumber1 = new TelNumber("+79175655655");
        TelNumber telNumber2 = new TelNumber("89175655655");

        System.out.println(telNumber1.getNumber());
        System.out.println(telNumber2.getNumber());
    }
}

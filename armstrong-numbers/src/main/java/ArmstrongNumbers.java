class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int originalNumber = numberToCheck;
        int sum = 0;
        // converted int to String
        String power = String.valueOf(numberToCheck);

        while(numberToCheck>0){
            int digit = numberToCheck%10;
            numberToCheck/=10;
            sum =  sum + (int)Math.pow(digit, power.length());
        }

        return originalNumber == sum;
    }

}

public class PrimitiveData {


        public static void main(String[] args) {
//            int myValue = 1000;
//
//            int myMinIntValue = Integer.MIN_VALUE;
//            int myMaxIntValue = Integer.MAX_VALUE;
//            System.out.println("Integer Minimum Value = " + myMinIntValue);
//            System.out.println("Integer Maximum Value = " + myMaxIntValue);
//
//            byte myMinByteValue = Byte.MIN_VALUE;
//            byte myMaxByteValue = Byte.MAX_VALUE;
//            System.out.println("Byte Minimum Value " + myMinByteValue);
//            System.out.println("Byte Maximum Value " + myMaxByteValue);
//
//            short myMinshortValue = Short.MIN_VALUE;
//            short myMaxshortValue = Short.MAX_VALUE;
//            System.out.println("Short Minimum Value " + myMinshortValue);
//            System.out.println("Short Maximum Value " + myMaxshortValue);
//
//            long myMinlongValue = Long.MIN_VALUE;
//            long myMaxlongValue = Long.MAX_VALUE;
//            System.out.println("Long Minimum Value " + myMinlongValue);
//            System.out.println("Long Maximum Value " + myMaxlongValue);

//            byte myNewByteValue = (byte) (myMinByteValue / 2);
//
//            short myNewShortValue = (short) (myMinshortValue + 1);
//
//            int myNewIntValue = (int) (myMaxIntValue / 2);
//
//            long myNewLongValue = (50000L + 10L * (myNewByteValue  + myNewShortValue + myNewIntValue));

            float myMinFloatValue = Float.MIN_VALUE;
            float myMaxFloatValue = Float.MAX_VALUE;
            System.out.println("Float min value = " + myMinFloatValue);
            System.out.println("Float max value = " + myMinFloatValue);

            double myMinDoubleValue = Float.MIN_VALUE;
            double myMaxDoubleValue = Float.MAX_VALUE;
            System.out.println("Float double value = " + myMinDoubleValue);
            System.out.println("Float double value = " + myMinDoubleValue);


            int myIntValue = 5 / 3;
            float myFloatValue =  5f / 3f;
            double myDoubleValue = 5d / 3d;
            System.out.println("MyIntValue =" + myIntValue);
            System.out.println("MyFloatValue =" + myFloatValue);
            System.out.println("MyDoubleValue =" + myDoubleValue);

//            Doubles are faster to process compared to floats. Math functions are written to process doubles rather than floats.
//            Java treats doubles as default floating number.
            double pounds = 200d;
            double inKilos = (pounds * 0.45359237d);
            System.out.println(inKilos);

            double pi = 3.1415927d;
            double anotherNumber = 3_000_000.4_567_890d;
            System.out.println(pi);
            System.out.println(anotherNumber);

//          BigDecimal should be used for precise calculations rather than floats or doubles.

            char myChar = 'D';
            // Can only store a single character
            //Occupies two bytes of memory
            char myUnicodeChar = '\u0044';

            System.out.println(myChar);
            System.out.println(myUnicodeChar);

            boolean myTrueBooleanValue = true;
            boolean myFalseBooleanValue = false;

            String myString = "Ths is a string";
            System.out.println("My string is equal to " + myString);

            int result = 1 + 2;
            System.out.println(" 1 + 2 =" + result);



        }
}




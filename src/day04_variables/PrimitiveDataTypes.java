package day04_variables;

import java.sql.SQLOutput;

/*
Primitive Data Types
WHOLE NUMBERS / INTEGER TYPE:      byte, short, int, long --> If you use data directly, Java takes it as"int" by default
DECIMAL NUMBERS FLOATING TYPE:     float, double

 */
public class PrimitiveDataTypes {
    public static void main(String[] args){



        //If you know your container will hold WHOLE NUMBERS: byte, short, int, long
        //If you know your container will hold DECIMAL NUMBERS: float, double

        //Declaring variable ---> Datatype VariableName;
        byte age;
        //System.out.println(age); at this line, since variable age does not have vaue, nothing will be printed. So, it is erroring
        //byte age = 10; // we canNOT declare the same variable name i  same method
        //int age = 10; // Still we canNOT declare the same variable name even if the data type is different in same method.
        age = 10; // In this line we have - assing initial value (first time giving value) - We have INITIALIZED variable
        System.out.println(age); // single age variable have value in it, my code can print it out

        System.out.println("age"); // Here we are printing the DATA itself directly - DATA is letters (String)
        System.out.println(10); //Here we are printing the DATA itself directly - DATA is WHOLE numbers (int)
        System.out.println("10"); //Here we are printing the DATA itself directly - DATA is Letter (String)

        age = 20; // Here we REASSIGNED a new value whoth 20 to variable "age"
        System.out.println();

        //age = 200; // We CANNOT assign  a data wich is OUTSIDE OD RANGE that byte can hold

        //Declaring variable + assigned initial value ---> Datatype VariableName = value/data
        short year = 2025; //
        System.out.println(year); // short
        System.out.println(2025); // int

        //Declaring variable
        int  addressNumbers;
        //assiging value/data into variable called "addressNumber"
        addressNumbers = 10315464;
        System.out.println(addressNumbers); // int
        System.out.println(10315464); // int
        System.out.println("10315464"); // letters/ String

        //Declaring variable
        long creditCardNumber;
        //Assingging a value / initializing variable
        //creditCardNumber = 12345647845457468l; //Uppercase l at the end
        creditCardNumber = 12345647845457468L; //Uppercase L at the end

        System.out.println(12345647845457468L); //Since JAVA take the data directly as "int" and 12345647845457468 is outside of the range that int can hold, we need to follow the syntax and add"l" or "L"




    }
}

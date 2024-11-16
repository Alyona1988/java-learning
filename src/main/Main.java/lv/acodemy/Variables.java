package lv.acodemy;

public class Variables {
    public static void main(String[] args) {


        //This is my comment

        /*
        This is first line
        This is second line
        This is third line
         */

        // int (integer) - whole number / natural number
        int age = 30;
        int currentYear = 2024;

        // currentYear = camel case (lower camel case) good
        // current_year = snake case never do like this!
        // current-year = kebab case  never do like this!

        int inventoryItemCount = 100;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        // double (fractional numbers)
        double temparature = 36.6;
        double price = 19.99;
        double distance = 38400.0;

        System.out.println(temparature);
        System.out.println(price);

        //char (symbols)

        char grade = 'A';
        char myInitial = 'N';
        char currencySymbol = '$';

        //print them all;

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);

        // boolean (logical type, can keep only two values: true or false)
        // How you name? has or is
        // Example: inSummer / if(is summer) {}; / isLoggedIn
        // Example: hasAccess / if(hasAccess) {};

        boolean hasAccess = true;
        System.out.println(hasAccess);

        boolean isSummer = false;
        System.out.println(isSummer);

        System.out.println("Hello World\n");
        System.out.println("Hello World");

        // long
        long phoneNumber = 21431211;

        // float
        float interestrate = 4.5f;

        // Arithmetic operators

        int a = 10;
        int b = 5;
        int sum = a+b; //add
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.println(difference);

        int m = 7;
        int n = 3;
        int result = m + n;
        System.out.println(result);

        // Devide

        int num1 = 10;
        int num2 = 3;
        int devision = num1 / num2;
        System.out.println(devision);

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3 / num4;
        System.out.println(divResult);

        // % (reminder of a division)

        int f = 10;
        int g = 3;
        int reminder = f % g; // 10= 3*3+1
        System.out.println(reminder);

        int number = 8;
        boolean isEven = (number % 2 == 0);
        System.out.println(isEven);

        // Increment ++
        // ++preIncrement
        // Decrement --
        // ++ decrement

        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        int counter = 10;
        counter++;
        int postIncrement = counter++; // postIncrement = 11; counter = 12;
        int postDecrement = ++counter; // postIncrement = 13; counter = 13;
        System.out.println(postIncrement);
        System.out.println(postDecrement);

        String name = "John";
        String surname = "Doe";

        // Print them separately
        System.out.println(name);
        System.out.println(surname);

        String fullName = name + " " + surname;
        System.out.println(fullName);

        // %s - for String
        // %d - for numbers
        // %b - boolean
        System.out.println(String.format("My name is: %s, My surname is: %s", name, surname));

        var myCurrentAge = 30;
        var text = "Hello World";
















    }
}

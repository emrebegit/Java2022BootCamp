public class Main {
    public static void main(String[] args) {
        System.out.println("hello wold");
        //veri tipleri
        final Integer countOfStudent = 21;
        final String message = "Count of students: ";
        System.out.println(message + countOfStudent);
        double num = 12.5;
        num = -129;
        char character = 'A';
        boolean isCorrect = false;

        //if else
        if (countOfStudent < 20) {
            System.out.println("Number is less than 20");
        } else if (countOfStudent == 20) {
            System.out.println("Number is equal 20");
        } else {
            System.out.println("Number is high than 20");
        }

        //find the largest number
        final int num3 = 266;
        final int num4 = 266;
        final int num5 = 267;
        int largestNumber = num3;
        if (largestNumber < num4) {
            largestNumber = num4;
        }
        if (largestNumber < num5) {
            largestNumber = num5;
        }
        System.out.println("Largest number is :" + largestNumber);

        //switch-case
        char grade = 'g';
        switch (grade) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            case 'F':
                System.out.println("F");
                break;
            default:
                System.out.println("The entered value is not found");
        }

        //for - while
        for (int i = 0; i < 20; i += 2) {
            System.out.println(i);
            while (i < 10) {
                System.out.println("while :" + i);
                i += 2;
            }
        }

        //do-while
        int j = 4;
        do {
            System.out.println("do-while:" + j);
            j += 2;
        }
        while (j < 10);

        //arrays
        String student1 = "Emre";
        String student2 = "Emre1";
        String student3 = "Emre2";
        System.out.println(student1 + " " + student2 + " " + student3);
        String[] students = new String[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        for (String student : students) {
            System.out.println(student);
        }

        //arrays-REcap
        double[] doubles = {1.2, 6.3, 4.3, 5.6};
        double total = 0.0;
        double largeDouble = doubles[0];
        for (double aDouble : doubles) {
            total += aDouble;
            if (largeDouble < aDouble) {
                largeDouble = aDouble;
            }
        }
        System.out.println("Large double =" + largeDouble);
        System.out.println("total =" + total);

        //multidimensionality arrays
        String[][] cities = new String[3][3];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Ankara";
        cities[1][0] = "Elazığ";
        cities[1][1] = "Trabzon";
        cities[1][2] = "Samsun";
        cities[2][0] = "Kayseri";
        cities[2][1] = "Rize";
        cities[2][2] = "Ordu";
        for (String[] city : cities) {
            for (String s : city) {
                System.out.println(s);
            }
        }

        //string utils
        String message1 = "Today weather is so good.";
        System.out.println(message1);

        System.out.println("Sentence length:" + message1.length());
        System.out.println("5. Letter :" + message1.charAt(4));
        System.out.println(message1.concat("Thumps up!"));
        System.out.println(message1.endsWith("."));
        char[] characters = new char[5];
        message1.getChars(0, 5, characters, 0);
        System.out.println(characters);
        System.out.println(message1.indexOf("at"));
        System.out.println(message1.lastIndexOf("o"));

        String newMessage = message1.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(message1.substring(2, 5));
        for (String word : message1.split(" ")) {
            System.out.println(word);
        }


        //prime number
        int primeTestNumber = 15;
        boolean isPrime = true;
        if (primeTestNumber == 1) {
            System.out.println("This number is 1");
        } else if (primeTestNumber < 1) {
            System.out.println("Value is not correct");
        } else {
            for (int i = 2; i < primeTestNumber; i++) {
                if (primeTestNumber % i == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime == Boolean.TRUE) {
            System.out.println("This number is Prime");
        } else {
            System.out.println("This number is not Prime");
        }

        //bold and thin letters
        char boldThinLetters = 'I';
        switch (boldThinLetters){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("bold letter");
                break;
            default:
                System.out.println("thin letter");
        }

        //perfect number
        int testPerfectNumber=5;
        int totalDimension = 0;
        for (int i = 1; i < testPerfectNumber; i++) {
            if (testPerfectNumber % i == 0) {
                totalDimension += i;
            }
        }
        if (totalDimension == testPerfectNumber) {
            System.out.println(testPerfectNumber + " is perfect number");
        } else {
            System.out.println(testPerfectNumber + " is not perfect number");
        }

        //friend numbers
        int number1=220;
        int number2=284;
        totalDimension=0;
        int totalDimension2=0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                totalDimension += i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                totalDimension2 += i;
            }
        }
        if (number1 == totalDimension2 && number2 == totalDimension) {
            System.out.println(number1 + " and " + number2 + " is friend numbers");
        } else {
            System.out.println(number1 + " and " + number2 + " is not friend numbers");
        }

        //find number on array

        int[] sayilar = new int[]{1,2,5,7,8,0};
        int findNumber= 5;
        boolean thisNumberInArray=false;
        for (int i : sayilar) {
            if (i == findNumber) {
                thisNumberInArray = true;
            }
        }
        if (thisNumberInArray) {
            System.out.println(findNumber + " is on array");
        } else {
            System.out.println(findNumber + " is not on array");
        }

        /* ------------ LESSON 2----------------*/

        showMessage(findTheNum(8), 8);
        int sumValue = sumNumbers(8, 8);
        System.out.println("two numbers sum is :" + sumValue);
        System.out.println("any numbers sum is :" + sumNumbers2(1, 2, 3, 4, 5, 6, 7, 8));
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Delete();
        customerManager.Update();


        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2= new int[]{4,5,6};
        numbers2=numbers1;
        numbers1[0]= 10;
        System.out.println(numbers2[0]);

        FourTransactions fourTransactions = new FourTransactions();
        System.out.println(fourTransactions.sumTransaction(5,6));
        System.out.println(fourTransactions.multiplication(5,6));
        System.out.println(fourTransactions.extraction(5,6));
        System.out.println(fourTransactions.dimension(5,6));

        Product product = new Product(1,"PC","Laptop",102.5,3,"red","011253");
        product.setName("PC");
        product.setId(0);
        product.setDescription("Laptop");
        product.setPrice(102.5);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add(product.getId(),product.getName(),product.getDescription(), product.getColor());
        System.out.println(product.getCode());

        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.Add();
        employeeManager.List();
    }

    private static int sumNumbers(int i, int i1) {
        return i + i1;
    }

    private static int sumNumbers2(int... numbers) {
        int sumValue = 0;
        for (int number : numbers) {
            sumValue += number;
        }
        return sumValue;
    }

    private static void showMessage(boolean numHas, int number) {
        if (numHas) {
            System.out.println("the num is in Array" + number);
        } else {
            System.out.println("the num is not in Array" + number);
        }
    }

    private static boolean findTheNum(int num) {
        int[] numbers = new int[]{1, 2, 5, 6, 7};
        for (int number : numbers) {
            if (number == num) {
                return true;
            }
        }
        return false;
    }

}

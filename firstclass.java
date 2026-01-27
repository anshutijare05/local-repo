public class firstclass {
    public static void main(String args[]) {
        System.out.println("Hello Folks");
        secondclass.main(args);
    }
}

class secondclass {
    public static void main(String args[]) {
        System.out.println("Welcome to Java");
        thirdclass.main(args);
    }
}

class thirdclass {
    public static void main(String args[]) {
        // output Hello World
        System.out.println("I am Atharv");
        System.out.print("A 20 y/o coder\n");
        fourthclass.main(args);
    }
}
// 1st line - we've used println function instead of print function to print the
// text in a new line after execution
// 2nd line - if we'd used print function it would have printed the next output
// in the same line

class fourthclass {
    public static void main(String args[]) {
        // output Welcome to Java
        System.out.print("Learning Java\n");
        System.out.print("And exploring it\n");
        // we've used \n escape sequence to print the next output in a new line
        fifthclass.main(args);
    }
}

class fifthclass {
    public static void main(String args[]) {
        // output Hello World Welcome to Java
        System.out.print("And later onn\nI am going to master it\n\n\n");
        // we've used \n escape sequence to print the next output in a new line
        // we can give multiple \n to give multiple lines of space
        sixthclass.main(args);
    }
}

class sixthclass {
    public static void main(String args[]) {
        // "*" question, my first java problem of 2026
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        seventhclass.main(args);
    }
}

class seventhclass {
    public static void main(String[] args) {
        // "*" question, my first java problem of 2026 - part 2
        System.out.println("*\n**");
        //both *'s are in the same line but we have used \n to print the next * in a new line
        eighthclass.main(args);
    }
}
class eighthclass {
    public static void main(String[] args) {
        //variables
        int a = 25;
        int b = 30;
        int sum = a + b;
        System.out.println(sum); //-- if we want to mul then we can comment this line
        int mul = a * b;
        System.out.println(mul);
    }
}
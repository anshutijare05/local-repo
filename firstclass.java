class firstclass {
    public static void main(String args[]) {
        System.out.println("Hello World");
    }
}

class secondclass {
    public static void main(String args[]) {
        System.out.println("Welcome to Java");
    }
}

class thirdclass {
    public static void main(String args[]) {
        //output Hello World
        System.out.println("Hello World");
        System.out.print("Hello World");
    }  
}
// 1st line - we've used println function instead of print function to print the text in a new line after execution
// 2nd line - if we'd used print function it would have printed the next output in the same line

class fourthclass {
    public static void main(String args[]) {
        //output Welcome to Java
        System.out.print("Welcome to Java\n");
        System.out.print("Welcome to Java");
        //we've used \n escape sequence to print the next output in a new line
    }  
}
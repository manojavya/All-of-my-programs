import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        String input = "";
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        System.out.println("V.1.5.0"); // Change only when major changes are made
        String OS = System.getProperty("os.name").toLowerCase();
        System.out.println("You are using: " + OS);
        System.out.println("Type 'help' for information about this app or type 'exit' to close the app or type 'c' to continue and enter a command");
        
        input = myscanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.exit(1);
            } 
            
            else if (input.equalsIgnoreCase("help")) { 
                System.out.println("");
                System.out.println(YELLOW + "This is a simple app that can calculate the perimeter, area, and volume of a shape.");
                System.out.println("The shapes that are supported are square, rectangle, triangle, and sphere.");
                System.out.println("To use this app, type 'c' to continue and enter a command. To exit the app, type 'exit'.");
                System.out.println("To find area type 'area', to find perimeter type 'perimeter', and to find volume type 'volume'.");
                System.out.println("We have added support for Circle on March 19th");
                System.out.println("Cases do not matter as this app uses 'equalsIgnoreCase' property :) .");
                System.out.println("");
                System.out.println("Now enter your command:(Perimeter, area or volume, cases will not cause errors.)" + RESET);
                System.out.println("");

                input = myscanner.nextLine();

                if (input.equalsIgnoreCase("area")) {
                    System.out.println("Enter the shape you want to find the area of:(Square, Rectangle, Triangle)");
                    input = myscanner.nextLine();
                    
                    if (input.equalsIgnoreCase("square")) {
                        System.out.println("Enter the length of the square:");
                        double length = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double area = length * length;
                        System.out.println(GREEN + "The area of the square is " + area + RESET);
                    } 

                    else if (input.equalsIgnoreCase("Circle")) {
                        System.out.println("Enter the radius of the circle:");
                        double radius = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double area = Math.PI * Math.pow(radius, 2);
                        System.out.println(GREEN + "The area of the circle is " + area + RESET);
                    }
                    
                    else if (input.equalsIgnoreCase("rectangle")) {
                        System.out.println("Enter the length of the rectangle:");
                        double length = myscanner.nextDouble();
                        System.out.println("Enter the width of the rectangle:");
                        double width = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double area = length * width;
                        System.out.println(GREEN + "The area of the rectangle is " + area + RESET);
                    } 
                    
                    else if (input.equalsIgnoreCase("triangle")) {
                        System.out.println("Enter the base of the triangle:");
                        double base = myscanner.nextDouble();
                        System.out.println("Enter the height of the triangle:");
                        double height = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double area = 0.5 * base * height;
                        System.out.println(GREEN + "The area of the triangle is " + area + RESET);
                    } 

                    else if (input.equalsIgnoreCase("exit")) {
                        System.exit(1);
                    }
                    
                    else {
                        System.out.println(RED + "Invalid shape or shape is not yet supported. The shapes supported are square, rectangle, and triangle. Restart the app." + RESET);
                        System.exit(-1);
    
                    }
                } 
                
                else if (input.equalsIgnoreCase("perimeter")) {
                    System.out.println("Enter the shape you want to find the perimeter of: (Square, Rectangle, Triangle)");
                    input = myscanner.nextLine();
                    
                    if (input.equalsIgnoreCase("square")) {
                        System.out.println("Enter the length of the square:");
                        double length = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double perimeter = 4 * length;
                        System.out.println(GREEN + "The perimeter of the square is " + perimeter + RESET);
                    } 

                    else if (input.equalsIgnoreCase("exit")) {
                        System.exit(1);
                    }

                    else if (input.equalsIgnoreCase("Circle")) {
                        System.out.println("Enter the radius of the circle:");
                        double radius = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double perimeter = 2 * Math.PI * radius;
                        System.out.println(GREEN + "The perimeter of the circle is " + perimeter + RESET);
                    }
                    
                    else if (input.equalsIgnoreCase("rectangle")) {
                        System.out.println("Enter the length of the rectangle:");
                        double length = myscanner.nextDouble();
                        System.out.println("Enter the width of the rectangle:");
                        double width = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double perimeter = 2 * (length + width);
                        System.out.println(GREEN + "The perimeter of the rectangle is " + perimeter + RESET);
                    } 
                    
                    else if (input.equalsIgnoreCase("triangle")) {
                        System.out.println("Enter the length of the first side of the triangle:");
                        double side1 = myscanner.nextDouble();
                        System.out.println("Enter the length of the second side of the triangle:");
                        double side2 = myscanner.nextDouble();
                        System.out.println("Enter the length of the third side of the triangle:");
                        double side3 = myscanner.nextDouble();
                        myscanner.nextLine();
                        double perimeter = side1 + side2 + side3;
                        System.out.println(GREEN + "The perimeter of the triangle is " + perimeter + RESET);
                    } 

                    else if (input.equalsIgnoreCase("exit")) {
                        System.exit(1);
                    }
                    
                    else {
                        System.out.println(RED + "Invalid shape or shape is not yet supported. The shapes supported are square, rectangle, and triangle. Restart the app." + RESET);
                        System.exit(-1);
    
                    }
                } else if (input.equalsIgnoreCase("volume")) {
                    System.out.println("Enter the shape you want to find the volume of: (Cone, Sphere, Pyramid, and Cylinder)");
                    input = myscanner.nextLine();
                    
                    if (input.equalsIgnoreCase("sphere")) {
                        System.out.println("Enter the radius of the sphere:");
                        double radius = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                        System.out.println(GREEN + "The volume of the sphere is " + volume + RESET);
                    } 

                    else if (input.equalsIgnoreCase("exit")) {
                        System.out.println(RED + "Exiting the app..." + RESET);
                        System.exit(1);
                    }

                    else if (input.equalsIgnoreCase("Cylinder")) {
                        System.out.println("Enter the radius of the cylinder:");
                        double radius = myscanner.nextDouble();
                        System.out.println("Enter the height of the cylinder:");
                        double height = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double volume = Math.PI * Math.pow(radius, 2) * height;
                        System.out.println(GREEN + "The volume of the cylinder is " + volume + RESET);
                    }

                    else if (input.equalsIgnoreCase("cone")) {
                        System.out.println("Enter the radius of the cone:");
                        double radius = myscanner.nextDouble();
                        System.out.println("Enter the height of the cone:");
                        double height = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
                        System.out.println(GREEN + "The volume of the cone is " + volume + RESET);
                    }

                    else if (input.equalsIgnoreCase("pyramid")) {
                        System.out.println("Enter the base of the pyramid:");
                        double base = myscanner.nextDouble();
                        System.out.println("Enter the height of the pyramid:");
                        double height = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double volume = (1.0 / 3.0) * base * height;
                        System.out.println(GREEN + "The volume of the pyramid is " + volume + RESET);
                    }
                    
                    else {
                        System.out.println(RED + "Invalid shape or shape is not yet supported. The shapes supported are sphere and Cylinder. Restart the app."+ RESET);
                        System.exit(-1);
                    }
                } 
                
                else {
                    System.out.println(RED + "Invalid input. Type 'help' for information about this app. Restart the app." + RESET);
                    System.exit(-1);
                }
            } 
            
            else if (input.equalsIgnoreCase("c")) 
            {
                System.out.println("Operation(Area, Perimeter or Volume): ");
                input = myscanner.nextLine();

                if (input.equalsIgnoreCase("area")) {
                    System.out.println("Enter the shape you want to find the area of:(Square, Rectangle, Triangle)");
                    input = myscanner.nextLine();
                    
                    if (input.equalsIgnoreCase("square")) {
                        System.out.println("Enter the length of the square:");
                        double length = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double area = length * length;
                        System.out.println(GREEN + "The area of the square is " + area + RESET);
                    } 

                    else if (input.equalsIgnoreCase("exit")) {
                        System.exit(1);
                    }

                    else if (input.equalsIgnoreCase("Circle")) {
                        System.out.println("Enter the radius of the circle:");
                        double radius = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double area = Math.PI * Math.pow(radius, 2);
                        System.out.println(GREEN + "The area of the circle is " + area + RESET);
                    }
                    
                    else if (input.equalsIgnoreCase("rectangle")) {
                        System.out.println("Enter the length of the rectangle:");
                        double length = myscanner.nextDouble();
                        System.out.println("Enter the width of the rectangle:");
                        double width = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double area = length * width;
                        System.out.println(GREEN + "The area of the rectangle is " + area + RESET);
                    } 
                    
                    else if (input.equalsIgnoreCase("triangle")) {
                        System.out.println("Enter the base of the triangle:");
                        double base = myscanner.nextDouble();
                        System.out.println("Enter the height of the triangle:");
                        double height = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double area = 0.5 * base * height;
                        System.out.println(GREEN + "The area of the triangle is " + area + RESET);
                    } 
                    
                    else {
                        System.out.println(RED + "Invalid shape or shape is not yet supported. The shapes supported are square, rectangle, and triangle. Restart the app." + RESET);
                        System.exit(-1);
    
                    }
                } 
                
                else if (input.equalsIgnoreCase("perimeter")) {
                    System.out.println("Enter the shape you want to find the perimeter of: (Square, Rectangle, Triangle)");
                    input = myscanner.nextLine();
                    
                    if (input.equalsIgnoreCase("square")) {
                        System.out.println("Enter the length of the square:");
                        double length = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double perimeter = 4 * length;
                        System.out.println(GREEN + "The perimeter of the square is " + perimeter + RESET);
                    } 

                    else if (input.equalsIgnoreCase("exit")) {
                        System.exit(1);
                    }

                    else if (input.equalsIgnoreCase("Circle")) {
                        System.out.println("Enter the radius of the circle:");
                        double radius = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double perimeter = 2 * Math.PI * radius;
                        System.out.println(GREEN + "The perimeter of the circle is " + perimeter + RESET);
                    }
                    
                    else if (input.equalsIgnoreCase("rectangle")) {
                        System.out.println("Enter the length of the rectangle:");
                        double length = myscanner.nextDouble();
                        System.out.println("Enter the width of the rectangle:");
                        double width = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double perimeter = 2 * (length + width);
                        System.out.println(GREEN + "The perimeter of the rectangle is " + perimeter + RESET);
                    } 
                    
                    else if (input.equalsIgnoreCase("triangle")) {
                        System.out.println("Enter the length of the first side of the triangle:");
                        double side1 = myscanner.nextDouble();
                        System.out.println("Enter the length of the second side of the triangle:");
                        double side2 = myscanner.nextDouble();
                        System.out.println("Enter the length of the third side of the triangle:");
                        double side3 = myscanner.nextDouble();
                        myscanner.nextLine();
                        double perimeter = side1 + side2 + side3;
                        System.out.println(GREEN + "The perimeter of the triangle is " + perimeter + RESET);
                    } 
                    
                    else {
                        System.out.println(RED + "Invalid shape or shape is not yet supported. The shapes supported are square, rectangle, and triangle. Restart the app." + RESET);
                        System.exit(-1);
    
                    }
                } else if (input.equalsIgnoreCase("volume")) {
                    System.out.println("Enter the shape you want to find the volume of: (Cone, Sphere, Pyramid, and Cylinder)");
                    input = myscanner.nextLine();
                    
                    if (input.equalsIgnoreCase("sphere")) {
                        System.out.println("Enter the radius of the sphere:");
                        double radius = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                        System.out.println(GREEN + "The volume of the sphere is " + volume + RESET);
                    } 

                    else if (input.equalsIgnoreCase("exit")) {
                        System.exit(1);
                    }

                    else if (input.equalsIgnoreCase("Cylinder")) {
                        System.out.println("Enter the radius of the cylinder:");
                        double radius = myscanner.nextDouble();
                        System.out.println("Enter the height of the cylinder:");
                        double height = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double volume = Math.PI * Math.pow(radius, 2) * height;
                        System.out.println(GREEN + "The volume of the cylinder is " + volume + RESET);
                    }

                    else if (input.equalsIgnoreCase("cone")) {
                        System.out.println("Enter the radius of the cone:");
                        double radius = myscanner.nextDouble();
                        System.out.println("Enter the height of the cone:");
                        double height = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
                        System.out.println(GREEN + "The volume of the cone is " + volume + RESET);
                    }

                    else if (input.equalsIgnoreCase("pyramid")) {
                        System.out.println("Enter the base of the pyramid:");
                        double base = myscanner.nextDouble();
                        System.out.println("Enter the height of the pyramid:");
                        double height = myscanner.nextDouble();
                        myscanner.nextLine(); 
                        double volume = (1.0 / 3.0) * base * height;
                        System.out.println(GREEN + "The volume of the pyramid is " + volume + RESET);
                    }
                    
                    else {
                        System.out.println(RED + "Invalid shape or shape is not yet supported. The shapes supported are sphere and Cylinder. Restart the app."+ RESET);
                        System.exit(-1);
                    }
                } 
                
                else {
                    System.out.println(RED + "Invalid input. Type 'help' for information about this app. Restart the app." + RESET);
                    System.exit(-1);
                }
        }        
    }
}

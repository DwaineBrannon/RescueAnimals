import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        //get scanner for user input
        Scanner input = new Scanner(System.in);
        char option;

        //menu and user input loop
        do
        {
            displayMenu();
            option = input.next().charAt(0);

            // If user input is 1, intakeNewDog
            if(option=='1') {
                intakeNewDog(input);
            }

            // If the option is 2, intakeNewMonkey
            else if(option=='2') {
                intakeNewMonkey(input);
            }

            // If the option is 3 reserveAnimal
            else if(option=='3') {
                reserveAnimal(input);
            }

            // If the option is 4 printAnimals for dog
            else if(option=='4') {
                printAnimals(option);
            }

            // If the option is 5 printAnimals for monkey
            else if(option=='5') {
                printAnimals(option);
            }

            // If the option is 6, the printAnimals for all animals not reserved
        else if(option=='6') {
            printAnimals(option);
        }

        // To quit the loop
        else if(option=='q') {
            System.out.print("You have exited the application.");
            break;
        }
        else {
            System.out.print("You have entered an invalid input.");
        }
        }while (option != 'q');
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Aipom", "Capuchin", "Non-Binary", "69", "35", "4/20/96", "United States" , "intake" , false , "United States" , "asdf", "y", "z");
        Monkey monkey2 = new Monkey("Cutie", "random", "random", "6", "420", "here", "no", "in service", false, "in service", "a", "asd", "x");
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);


    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
    	scanner.nextLine(); //there will be whitespace from the int value so I must store it here
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        
        System.out.println("When was this dog acquired?");
        String acquisitionDate = scanner.nextLine();
        
        System.out.println("What country was the dog acquired?");
        String acquisitionCountry = scanner.nextLine();
        
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is the dog reserved? true or false"); 
        boolean reserved = false;
        boolean invalid = false; //variable to control validity of input mismatch
		do { 
			try {
			//get user data to make sure it is boolean
			reserved = scanner.nextBoolean();
			invalid = false; //if invalid is false, the code can continue
        } 
			catch (InputMismatchException e) {
        		System.out.println("Sorry, Please enter 'true or false'");
        		invalid = true; //if invalid is true, code cannot continue, must get boolean 
        		scanner.nextLine(); //clear scanner
        	
		}
		}while (invalid); //do while invalid == true 
		scanner.nextLine(); //clear scanner
			
        System.out.println("What is the dog's service country?");
        String serviceCountry = scanner.nextLine();
        
        Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, 
        		trainingStatus, reserved, serviceCountry );
        
        dogList.add(dog);
        System.out.println("\nYour dog has been added to the dog list\n");
       
}


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
        	scanner.nextLine(); //there will be whitespace from the integer value so I need to store it here
            System.out.println("What is the Monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu

                }
            }
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();
            
            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();
            
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            
            System.out.println("When was this monkey acquired?");
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("Which country was this monkey acquired?");
            String acquisitionCountry = scanner.nextLine();
            
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();
            
            System.out.println("Is this monkey reserved?");
            boolean reserved = false;
            boolean invalid = false; //variable to handle input validation
    		do { 
    			try {
    			//get user data to make sure it is boolean 
    			reserved = scanner.nextBoolean(); 
    			invalid = false; //if invalid is false, code can continue
            } 
    			catch (InputMismatchException e) {
            		System.out.println("Sorry, Please enter 'true or false'");
            		invalid = true; //code cannot continue if invalid is true
            		scanner.nextLine(); //clear scanner
            	
    		}
    		}while (invalid); //while invalid is true, run thie do while loop
    		scanner.nextLine(); //clear scanner
            
            System.out.println("Which country is the monkey in service?");
            String inServiceCountry = scanner.nextLine();
            
            System.out.println("How long is the monkey's tail?");
            String tailLength = scanner.nextLine();
            
            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();
            
            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();


            Monkey monkey3 = new Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionCountry,
                    trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength);
            monkeyList.add(monkey3);
            System.out.print("\nYour Monkey has been added to the monkey list.\n");
        }



        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
           scanner.nextLine();
           System.out.println("Please enter your desired animal type");
           String animalType = scanner.nextLine(); //Variable for the user's animal type
           if (animalType.equalsIgnoreCase("Monkey")) { //if they choose monkey
        	   System.out.println("Please enter the monkey's country of origin");
        	   String country = scanner.nextLine();
        	   for(Monkey obj: monkeyList) {
        		   if (obj.getAcquisitionLocation().equalsIgnoreCase(country)) {
        			   obj.setReserved(true); //update the matching monkey to reserved: true
        			   System.out.println("You have successfully reserved a Monkey. Thank you");
        			   return; //returns 
        		
        		   }
        	   }
        	   System.out.println("Sorry, this animal is not in our system");
           }
           if (animalType.equalsIgnoreCase("Dog")) { //if the user chooses Dog
        	   System.out.println("Please enter the Dog's country of origin");
        	   String country = scanner.nextLine();
        	   for(Dog obj: dogList) {
        		   if (obj.getAcquisitionLocation().equalsIgnoreCase(country)) {
        			   obj.setReserved(true); //update the matching dog to reserved: true
        			   System.out.println("You have successfully reserved a Dog. Thank you");
        			   return; //returns 
        		   }
           }
        	   System.out.println("Sorry, this animal is not in our system.");
           }
          
        }
           
           
           
           

        

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(char option) {
        	if (option == '4') { 
        		System.out.println(dogList.toString()); //Print's dog list at option 4
        	}
        	else if (option == '5') { 
        		System.out.println(monkeyList.toString()); //Prints monkeyList at option 5
        	}
        	else if (option == '6') {
        		for (int i = 0; i < dogList.size(); i++) { //Searching dogList
        			if (dogList.get(i).getTrainingStatus().equalsIgnoreCase("in service") && 
        			        dogList.get(i).getReserved()==false) {  //if dog is in service and not reserved
        					System.out.println(dogList.get(i).toString());
        				
        			}
        		}
        		for (int i = 0; i < monkeyList.size(); i++) { //searching monkeyList
        			if (monkeyList.get(i).getTrainingStatus().equalsIgnoreCase("in service") &&
        					monkeyList.get(i).getReserved()==false) { //if monkey is in service and not reserved
        						System.out.println(monkeyList.get(i).toString());
        					}
        		}
        	}
        	
            

        }
}


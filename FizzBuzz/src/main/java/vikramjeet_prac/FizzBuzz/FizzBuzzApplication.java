package vikramjeet_prac.FizzBuzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzBuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}


	@Bean 
	public CommandLineRunner run(){
		return args -> {
			if (args.length == 0) {
				System.err.println("Usage: java -jar your-app.jar <number>");
                System.err.println("Please provide an upper limit for FizzBuzz.");
                return;
			}
			int x;


			try {
                x = Integer.parseInt(args[0]); // Parse the first command-line argument as x
            } catch (NumberFormatException e) {
                System.err.println("Invalid argument: '" + args[0] + "'. Please provide a valid integer for the upper limit.");
                return; // Exit if argument is not a valid number
            }

			 if (x < 1) {
                System.err.println("Please provide a positive integer for the upper limit (x >= 1).");
                return;
            }
			for(int i = 1 ; i <= x; i++){
				if( (i % 3 == 0) && (i % 5 == 0) ){
					System.out.println("FizzBuzz");
				}
				else if(i % 3 == 0){
					System.out.println("Fizz");
				}
				else if(i % 5 == 0){
					System.out.println("Buzz");
				}
				else{
					System.out.println(i);
				}
			}
		};
	}

}

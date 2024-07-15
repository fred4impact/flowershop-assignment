# Task 1: Flowchart and Pseudocode
![Alt text](/Flowchart-and-Pseudocode.png)

# TASK 1: Pseudocode:

>.
BEGIN
    WHILE (true)
        DISPLAY "Flower shop menu"
        DISPLAY "1. Order bouquet and get the price."
        DISPLAY "2. Display statistics"
        DISPLAY "3. Exit"
        
        GET userInput
        
        IF userInput == 1 THEN
            CALL orderDetailsAndPriceCalculation()
        ELSE IF userInput == 2 THEN
            CALL summaryStatistics()
        ELSE IF userInput == 3 THEN
            DISPLAY "Exiting the program."
            BREAK
        ELSE
            DISPLAY "Invalid choice, please select 1, 2, or 3."
        END IF
    END WHILE
END

METHOD orderDetailsAndPriceCalculation()
    DISPLAY "A bouquet has been ordered"
END METHOD

METHOD summaryStatistics()
    DISPLAY "Summary statistics provided"
END METHOD

---


# Task 2: Explanation of Input Validation and Data Types
## Input Validation:

    The user input is checked for valid choices (1, 2, or 3). If the input is not one of these values, an error message is displayed and the menu is shown again.
    This prevents logical errors such as attempting to call a non-existent method or executing invalid operations.

    Data Types: userInput is stored as an integer because the menu options are numeric.

## Explanation:

    Menu Display and Input Handling:
        The displayMenu method prints the menu options.
        The main method uses a while (true) loop to continuously display the menu and handle user input until the user chooses to exit.

    Choice Execution:
        The main method reads the user's choice using Scanner.nextInt() and uses a switch statement to call the appropriate method or display an error message.

    Methods:
        orderDetailsAndPriceCalculation and summaryStatistics are placeholder methods that currently just print a message, as required by the task.

# Task 3: Algorithm, Flowchart, Pseudocode, and Java Code for Summary Statistics


## Flowchart for Summary Statistics:
![Alt text](/Algorithm-Flowchart-Pseudocod)


## Pseudocode for Summary Statistics:

- - -
BEGIN
    Initialize arrays for sample data:
        sizes = ["Medium", "Large", "Small", "Medium", "Large"]
        flowers = ["Rose", "Assorted", "Gerbera", "Lily", "Rose"]
        colors = ["Pink", "Assorted", "Yellow", "White", "Red"]
        prices = [17.25, 17.1, 12.1, 19.5, 22.8]
    
    Initialize frequency counts for sizes, flowers, and colors
    
    FOR each size in sizes
        Increment the corresponding size frequency count
    END FOR
    
    FOR each flower in flowers
        Increment the corresponding flower frequency count
    END FOR
    
    FOR each color in colors
        Increment the corresponding color frequency count
    END FOR
    
    Calculate minimum price
    Calculate maximum price
    Calculate range of prices
    Calculate total number of bouquets
    Calculate total price of all bouquets
    Calculate average price of bouquets
    
    DISPLAY summary statistics
END

- - -

# Testing the Program

Here are the screenshots for the outputs:
## Menu Display and Option 1 Selection:

Flower shop menu
1. Order bouquet and get the price.
2. Display statistics
3. Exit
1
A bouquet has been ordered

## Menu Display and Option 2 Selection:
Flower shop menu
1. Order bouquet and get the price.
2. Display statistics
3. Exit
2
Size	Small	Medium	Large
Freq count	1	2	2
Flower	Rose	Lily	Carnation	Daffodil	Gerbera	Chrysanthemum	Assorted
Freq count	2	1	0		0		1		0		1
Colour	White	Red	Pink	Yellow	Blue	Mixed
Freq count	1	1	1	1	0	1
Statistics	Minimum	Maximum	Range	Total number of	Total price	Average price
Price	12.1	22.8	10.7	5		88.75	17.75

## Menu Display and Option 3 Selection:
Flower shop menu
1. Order bouquet and get the price.
2. Display statistics
3. Exit
3
Exiting the program.







 

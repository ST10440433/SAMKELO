Start SplashScreen Activity
    Display logo on screen
    Display text:
        "App Name: SUNNYSHINE"
        "Name: Your Name"
        "Student Number: ST10440433"
    
    If "Main" button is clicked:
        Navigate to MainActivity

    If "Exit" button is clicked:
        Close the SplashScreen Activity and exit the app
End SplashScreen Activity

Start MainActivity
    Declare a button: btnDetails
    
    Set OnClickListener for btnDetails
        If btnDetails is clicked:
            Navigate to DetailActivity
End MainActivity


Start DetailActivity
    Declare daily expenses array: dailyExpenses (store daily values for 7 days)
    Declare days array: days (store days of the week)
    Declare variables for highest expense and total expense
    Declare button to navigate back to MainActivity
    
    Loop through each day:
        For each day in dailyExpenses:
            Display the day and the amount spent
        
        Calculate the total expense for the week
        Calculate the average daily expense
        Find the highest expense and the corresponding day
    
    Display the highest expense day and the average daily expense

    If "Back" button is clicked:
        Navigate back to MainActivity
End DetailActivity


Start the app
    Show SplashScreen (Display app name, student name, student number, and logo)
    After splash screen finishes:
        Navigate to MainActivity
        In MainActivity, the user can click the button to navigate to DetailActivity
        In DetailActivity, the user can see detailed daily spending, the highest expense, and average spending
        If the user clicks "Back", navigate back to MainActivity
End the app

 
 

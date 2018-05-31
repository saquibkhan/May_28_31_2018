* Start with a web application that has the following
* A textbox to enter a stock symbol(say GOOG or APPL or FB or INFY)
* A submit button
* Clicking the submit button will connect to a service **A** 
* Service **A** returns a random number as the stock price
* Service **A** also passes the stock symbol and stock price to a service **B**
* Service **B** stores the values in a table with columns(stock,price,timestamp)

* The Web application has a link to view the list of all the stock prices requested. Clicking on the link will connect to Service **B** and get the values and display in the page.

* Have a proper idea about how to name applications and what port they run on.
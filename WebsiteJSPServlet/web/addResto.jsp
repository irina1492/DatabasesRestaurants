<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <!--link href="css/bootstrap.min.css" rel="stylesheet"-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <nav class="navbar navbar-dark bg-dark fixed-top">
      <a class="navbar-brand" href="#">Salty Spitoon</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample01" aria-controls="navbarsExample01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExample01">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="Index.html">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="restaraunts.html">Browse Restaraunts</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="raters.html">Browse Raters</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="SignIn.html">Sign in</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="register.html">Register</a>
          </li>
        </ul>
      </div>
    </nav>
    <!--Carousell-->
    <main role="main">
      <p><br><br><br><br><br></p>
    <div class="container">
       <div class="row">
        
        <div class="col-md-8 order-md-1">
          <h4 class="mb-3">Add Restaraunt</h4>
          <form class="needs-validation" novalidate>
            
              <div class="mb-3">
                <label for="firstName">Name</label> 
                <input type="text" class="form-control" id="firstName" placeholder="" value="" required>
                
              </div>
            

            

            <div class="mb-3">
              <label for="email">Web Page </label>
              <input  class="form-control" id="email" >
              
            </div>

            <div class="mb-3">
              <label for="address">Address</label>
              <input type="text" class="form-control" id="address" placeholder="1234 Main St" required>
              <div class="invalid-feedback">
                Please enter your shipping address.
              </div>
            </div>

            <div class="mb-3">
              <label for="address2">Manager </label>
              <input type="text" class="form-control" id="address2">
            </div>
            <div class="mb-3">
              <label for="address2">Phone NUmber </label>
              <input type="text" class="form-control" id="address2">
            </div>
            <div class="row">
              <div class="col-md-6 mb-3">
                <label for="firstName">Hour Opens</label> 
                <input type="text" class="form-control" id="firstName" placeholder="" value="" required>
                
              </div>
              <div class="col-md-6 mb-3">
                <label for="firstName">Hour Close</label> 
                <input type="text" class="form-control" id="firstName" placeholder="" value="" required>
                
              </div>
            </div>

            
           
           

            
           
            
            <hr class="mb-4">
            <button class="btn btn-primary btn-lg btn-block" type="submit">Add Restaraunt</button>
          </form>
        </div>
      </div>
    </div>



      
      </main>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) >
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    < Include all compiled plugins (below), or include individual files as needed >
    <script src="js/bootstrap.min.js"></script-->


    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>OdontoClinica</title>

    <!-- Bootstrap core CSS -->
    <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="container" style="background-color: #FFFFFF; border-color: #4682B4;">

      <form class="form-signin" action="efetuaLogin" method="post">
        <div class="form-group col-md-4 col-md-offset-4">
	        <h2 class="form-signin-heading">Login</h2>
	        <label for="inputEmail" class="sr-only">Email </label>
	        <input type="text" id="nome" name="nome" class="form-control" placeholder="Nome Completo" required autofocus>
	        <label for="inputPassword" class="sr-only">Senha</label>
	        <input type="password" id="senha" name="senha" class="form-control" placeholder="Senha" required>
	        <div class="checkbox">
	          <label>
	            <input type="checkbox" value="remember-me"> Lembrar-se de mim
	          </label>
	        </div>
	        <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
      	</div>
      </form>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
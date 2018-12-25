<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>Odonto Cascadura</title>
		<!-- Tell the browser to be responsive to screen width -->
		<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<!-- jQuery library -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<!-- Latest compiled JavaScript -->
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<!-- Google Font -->
		<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
	</head>
	<body>
		<div class="container-fluid">
			<header>
				<nav class="navbar navbar-default" style="background-color: #4682B4; border-color: #4682B4;">
					<ul class="nav navbar-nav">
						<li><a href="#" style="color: #FFFFFF">Painel</a></li>
						<li><a href="#" style="color: #FFFFFF">Agenda</a></li>
						<li><a href="#" style="color: #FFFFFF">Pacientes</a></li>
						<li><a href="#" style="color: #FFFFFF">Profissionais</a></li>
						<li><a href="#" style="color: #FFFFFF">Financeiro</a></li>
						<li><a href="#" style="color: #FFFFFF">Relatórios</a></li>
						<li><a href="#" style="color: #FFFFFF">Configurações</a></li>
					</ul>
				</nav>
			</header>
			<div class="content-wrapper">	
				<section class="content">
					<form role="form" action="alterarProfissional" method="post" id="form1">
								<div class="box-header with-border">
									<h3 class="box-title col-md-12">Alterar Profissional</h3>
								</div>
								<!-- /.box-header -->
								<div class="form-row">
									<div class="form-group col-md-2">
									  <label>Id</label>
									  <input type="number" class="form-control" required="true" placeholder="Id" name="idProfissional" value="${profissional.idProfissional}" readonly>
									</div>
									<div class="form-group col-md-6">
									  <label>Nome do Profissional</label>
									  <input type="text" class="form-control" placeholder="Nome" required="true" name="nome" value="${profissional.nome}">
									</div>
									<div class="form-group col-md-2">
									  <label>CRO(Número do Conselho)</label>
									  <input type="number" class="form-control" required="true" placeholder="CRO" name="cro" value="${profissional.cro}">
									</div>
									<div class="form-group col-md-2">
									  <label>Função</label>
									  <input type="text" class="form-control" required="true" placeholder="Função" name="funcao" value="${profissional.funcao}">
									</div>
									
									<input type="submit" class="btn btn-success pull-right" value="Alterar"/>
									<a href="listarProfissionais" role="button" class="btn btn-danger pull-right">Cancelar</a>
					</form>
					<!-- /.form1 -->
				</section>
				<!-- /.content -->
			</div>
			<!-- /.content-wrapper -->
		</div>
		<!-- /.container-fluid -->
		<div class="container">
	        <div class="row">
	            <div class="col-xs-12">
	                <div class="navbar navbar-fixed-bottom" style="padding: 10px 0 60px 21px; background-color: #fff;">
	                    <a href="alterarSenha" role="button" class="btn btn-primary">Alterar Senha</a>
	                </div>
	            </div>
	        </div>
   		</div>
		<footer class="navbar navbar-inverse navbar-fixed-bottom" style="background-color: #4682B4; border-color: #4682B4;">
		  <div class="container-fluid">
			<p class="text-muted"><font color="#FFFFFF"> Odontologia</font></p>
		  </div>
		</footer>
		 <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="../../../../assets/js/vendor/popper.min.js"></script>
    <script src="../../../../dist/js/bootstrap.min.js"></script>
	</body>
</html>
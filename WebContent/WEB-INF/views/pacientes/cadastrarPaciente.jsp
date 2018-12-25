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
					<form role="form" action="adicionaPaciente" method="post" id="form1">
						<main class="tab-content">
							<ul class="nav nav-tabs" role="tablist">
								<li><a href="#aba1" role="tab" data-toggle="tab">Dados Pessoais</a></li>
								<li><a href="#aba2" role="tab" data-toggle="tab">Dados Médicos</a></li>
								<li><a href="#aba3" role="tab" data-toggle="tab">Histórico de Procedimentos</a></li>
							</ul>
							<div role="tabpanel" class="tab-pane active" id="aba1">
								<div class="box-header with-border">
									<h3 class="box-title col-md-12">Dados Pessoais</h3>
								</div>
								<!-- /.box-header -->
								<div class="form-row">
									<div class="form-group col-md-6">
									  <label>Nome do Paciente</label>
									  <input type="text" class="form-control" placeholder="Nome" required="true" name="nome_paciente">
									</div>
									<div class="form-group col-md-2">
									  <label>CPF</label>
									  <input type="text" class="form-control" required="true" placeholder="CPF" name="cpf">
									</div>
									<div class="form-group col-md-2">
									  <label>RG</label>
									  <input type="text" class="form-control" required="true" placeholder="RG" name="rg">
									</div>
								</div>
								<div class="form-row">
									<div class="form-group col-md-2">
									  <label>Data de Nascimento</label>
									  <input type="date" class="form-control" required="true" placeholder="Data de Nascimento" name="data_nasc">
									</div>
									<div class="form-group col-md-3">
									  <label>Email</label>
									  <input type="email" class="form-control" placeholder="Email" required="true" name="email">
									</div>
									<div class="form-group col-md-2">
									  <label>Sexo</label>
									  <select class="form-control" name="sexo">
										<option value="masculino">Masculino </option>
										<option value="feminino">Feminino</option>
									  </select>
									</div>
									<div class="form-group col-md-2">
									  <label>Estado Civil</label>
									  <select class="form-control" name="estado_civil">
										<option value="solteiro(a)">Solteiro(a)</option>
										<option value="casado(a)">Casado(a)</option>
										<option value="divorciado(a)">Divorciado(a)</option>
										<option value="viuvo(a)">Viúvo(a)</option>
									  </select>
									</div>
									<div class="form-group col-md-5">
									  <label>Nome do Cônjuge</label>
									  <input type="text" class="form-control" placeholder="Nome do Cônjuge" name="nome_conjuge">
									</div>
								</div>
								<div class="form-row">
									<div class="form-group col-md-4">
									  <label>Endereço</label>
									  <input type="text" class="form-control" required="true" placeholder="Endereço" name="endereco">
									</div>
									<div class="form-group col-md-3">
									  <label>Bairro</label>
									  <input type="text" class="form-control" required="true" placeholder="Bairro" name="bairro">
									</div>
									<div class="form-group col-md-3">
									  <label>Cidade</label>
									  <input type="text" class="form-control" required="true" placeholder="Cidade" name="cidade">
									</div>
									<div class="form-group col-md-2">
									  <label>CEP</label>
									  <input type="text" class="form-control" required="true" placeholder="CEP" name="cep">
									</div>
								</div>
							</div>
							<!-- /.tabpanel 1 -->
							<div role="tabpanel" class="tab-pane" id="aba2">
								<div class="box-header with-border">
									<h3 class="box-title col-md-12">Dados Médicos</h3>
								</div>
								<!-- /.box-header -->
								<div class="form-row">
									<div class="form-group col-md-3">
									  <label>Estado de Saúde</label>
									  <input type="text" class="form-control" required="true" placeholder="Estado de saúde" name="estado_saude">
									</div>
									<div class="form-group col-md-2">
									  <label>Alergias</label>
									  <select class="form-control" name="tem_alergias">
										<option value="0">Não</option>
										<option value="1">Sim</option>
									  </select>
									</div>
									<div class="form-group col-md-3">
									  <label>Quais Alergias?</label>
									  <input type="text" class="form-control" placeholder="Alergias" name="alergias">
									</div>
									<div class="form-group col-md-2">
									  <label>Diabetes?</label>
									  <select class="form-control" name="tem_diabetes">
										<option value="0">Não</option>
										<option value="1">Sim</option>
									  </select>
									</div>
									<div class="form-group col-md-2">
									  <label>Bebe?</label>
									  <select class="form-control" name="bebe">
										<option value="0">Não</option>
										<option value="1">Sim</option>
									  </select>
									</div>
								</div>
								<div class="form-row">
									<div class="form-group col-md-3">
									  <label>Problemas Respiratórios?</label>
									  <select class="form-control" name="tem_prob_resp">
										<option value="0">Não</option>
										<option value="1">Sim</option>
									  </select>
									</div>
									<div class="form-group col-md-3">
									  <label>Quais Problemas?</label>
									  <input type="text" class="form-control" placeholder="Problemas" name="prob_resp">
									</div>
									<div class="form-group col-md-2">
									  <label>Cirurgia Prévia?</label>
									  <select class="form-control" name="cirurgia_previa">
										<option value="0">Não</option>
										<option value="1">Sim</option>
									  </select>
									</div>
									<div class="form-group col-md-2">
									  <label>Quais Cirurgias?</label>
									  <input type="text" class="form-control" placeholder="Cirurgias" name="cirurgias">
									</div>
									<div class="form-group col-md-2">
									  <label>Fuma?</label>
									  <select class="form-control" name="fuma">
										<option value="0">Não</option>
										<option value="1">Sim</option>
									  </select>
									</div>
								</div>
								<div class="form-row">
									<div class="form-group col-md-3">
									  <label>Problemas Circulatórios?</label>
									  <select class="form-control" name="tem_prob_circ">
										<option value="0">Não</option>
										<option value="1">Sim</option>
									  </select>
									</div>
									<div class="form-group col-md-3">
									  <label>Quais Problemas?</label>
									  <input type="text" class="form-control" placeholder="Problemas" name="prob_circ">
									</div>
									<div class="form-group col-md-3">
									  <label>Faz uso de algum medicamento?</label>
									  <select class="form-control" name="usa_medicamento">
										<option value="0">Não</option>
										<option value="1">Sim</option>
									  </select>
									</div>
									<div class="form-group col-md-3">
									  <label>Quais Medicamentos?</label>
									  <input type="text" class="form-control" placeholder="Medicamentos" name="medicamentos">
									</div>
								</div>
							</div>
							<!-- /.tabpanel 2 -->
							<nav aria-label="Page navigation">
							  <ul class="pagination">
								<li>
								  <a href="#" aria-label="Previous" id="previous">
									<span aria-hidden="true">&laquo;</span>
								  </a>
								</li>
								<li><a href="#aba1" role="tab" data-toggle="tab">1</a></li>
								<li><a href="#aba2" role="tab" data-toggle="tab">2</a></li>
								<li>
								  <a href="#" aria-label="Next">
									<span aria-hidden="true">&raquo;</span>
								  </a>
								</li>
							  </ul>
							</nav>
							<input type="submit"  class="btn btn-success pull-right" value="Cadastrar"/>
							<a href="listarPacientes" role="button" class="btn btn-danger pull-right">Cancelar</a>
						</main>
						<!-- /.tab-content -->
					</form>
					<!-- /.form1 -->
				</section>
				<!-- /.content -->
			</div>
			<!-- /.content-wrapper -->
		</div>
		<!-- /.container-fluid -->
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
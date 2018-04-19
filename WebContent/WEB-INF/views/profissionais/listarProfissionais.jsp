<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="org.joda.time.LocalDate" %>
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
		<!-- Custom styles for this template -->
    	<link href="sticky-footer.css" rel="stylesheet">
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
						<main>
							<div class="box-header with-border">
							  <h3 class="box-title col-md-12">Profissionais</h3>
							</div>
							<!-- /.box-header -->
							<table class="table table-hover" overflow="scroll">
								<thead> 
									<tr>
										<th> </th>
										<th>Id</th> 
										<th>Nome</th> 
										<th>Função</th>
										<th>CRO</th>
									</tr> 
								</thead> 
								<tbody>
									<c:forEach var="profissional" items="${profissionais}">
										<tr data-href="detalharProfissional?idProfissional=${profissional.idProfissional}"> 
											<td><a class="btn btn-primary" href="removerProfissional?idProfissional=${profissional.idProfissional}">Remover</a></td> <td>${profissional.idProfissional}</td> <td>${profissional.nome}</td> <td>${profissional.funcao}</td> <td>${profissional.cro}</td>
										</tr> 
									</c:forEach>
								</tbody>
							</table>
							<script>
								$(function(){
								    $('.table tr[data-href]').each(function(){
								        $(this).css('cursor','pointer').hover(
								            function(){ 
								                $(this).addClass('active'); 
								            },  
								            function(){ 
								                $(this).removeClass('active'); 
								            }).click( function(){ 
								                document.location = $(this).attr('data-href'); 
								            }
								        );
								    });
								});
							</script>
							
							<!-- /.tabpanel 3 -->
							<!-- <nav aria-label="Page navigation">
							   <ul class="pagination">
								<li><a href="#aba1" role="tab" data-toggle="tab">1</a></li>
								<li><a href="#aba2" role="tab" data-toggle="tab">2</a></li>
								<li><a href="#aba3" role="tab" data-toggle="tab">3</a></li>
							  </ul> 
							</nav> 
							<script>
								submitForms = function(){
									document.getElementById("form1").submit();
								}
							</script> -->					
						</main>
				</section>
				<!-- /.content -->
			</div>
			<!-- /.content-wrapper -->
		</div>
		<!-- /.container-fluid -->
		
		  <style type="text/css">
		    .table {
			    width: 100%;
			    max-width: 100%;
			    margin-bottom: 120px;
			}
		  </style>

		<div class="container">
	        <div class="row">
	            <div class="col-xs-12">
	                <div class="navbar navbar-fixed-bottom" style="padding: 10px 0 60px 21px; background-color: #fff;">
	                    <a href="novoProfissional" role="button" class="btn btn-primary">Novo Paciente</a>
	                </div>
	            </div>
	        </div>
   		</div>
		<footer class="navbar navbar-inverse navbar-fixed-bottom" style="background-color: #4682B4; border-color: #4682B4;">
		  <div class="container-fluid">
			<p class="text-muted"><font color="#FFFFFF"> Odontologia</font></p>
		  </div>
		</footer>
	</body>
</html>
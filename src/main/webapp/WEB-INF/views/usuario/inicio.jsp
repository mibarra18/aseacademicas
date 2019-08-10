<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="row cabecera">
            <div class="col-md-4">
                <img src="resources/imagenes/ut.jpeg" class="img-fluid" alt="Responsive image">
            </div>
            <div class="col-md-8">
                <h1>Asesorias Academicas UTNG</h1>
            </div>
        </div>


 
	 <div class="row">
            <div class="col-md-3" >
                <section class="ingresar">

                    <h3 class="ini">Iniciar sesion</h3>

                 

                   <form:form method="post" modelAttribute="usuario" action="/usuario/login"> 
                        
                        <label >Nombre de Usuario:</label>
                        <form:input path="username" cssClass="form-control" />
                                            
                        <label >Contrasena:</label>
                        <form:input path="contrasena" cssClass="form-control" />
                    
                    <input type="submit" value="Ingresar"/>
                    </form:form>
                    <br>
                    <br>
                    <a href="${pageContext.request.contextPath}/usuario/registro" >Registrate</a>
                    <br>
                    <br>
                	<a href="${pageContext.request.contextPath}/usuario/recuperar" >¿Olvidaste tu usuario o contraseña?</a>
                	
                </section>

            </div>
            <div class="col-md-9">
                <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="resources/imagenes/carreras.jpg" class="d-block w-100" alt="" height="350px">
                        </div>
                        <div class="carousel-item">
                            <img src="resources/imagenes/carreras2.jpg" class="d-block w-100" alt="200px" height="350px">
                        </div>
                        <div class="carousel-item">
                            <img src="resources/imagenes/carrera3.png" class="d-block w-100" alt="200px" height="350px">
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>

        </div>
<div class="row">
            <div class="col-md-12">
                <section class="politica">
                    <article>
                        <h2>Mision</h2>
                        <p>Somos una institución de educación superior tecnológica que forma profesionistas competitivos
                            a través de programas de calidad para contribuir al desarrollo del estado.</p>
                    </article>
                    <article>
                        <h2>Vision</h2>
                        <p>En el 2020 seremos reconocidos por nuestros egresados formados integral y globalmente, con
                            empleabilidad
                            acorde a +su perfil superior a la media estatal; por nuestros programas de grado acreditados
                            o evaluados al
                            100% y por contar con un postgrado; 15% de nuestros profesores participarán en programas de
                            movilidad y
                            50% de los cuerpos académicos estarán consolidados.

                            Nos distinguiremos por un ambiente de equidad y sustentabilidad reconocidas y participaremos
                            en 3 programas
                            de investigación aplicada orientados a la innovación y transferencia tecnológica en
                            proyectos sociales y
                            productivos.</p>
                    </article>

                    <article>
                        <h2>Valores</h2>
                        <p>Para la UTNG los valores son el marco del comportamiento que deben tener sus integrantes,
                            estos se
                            determinaron en
                            base a la razón de ser; al propósito de creación.</p>
                    </article>
                </section>
            </div>
        </div>

        
	


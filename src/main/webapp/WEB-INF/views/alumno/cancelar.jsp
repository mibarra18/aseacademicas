<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
          


        <div class="row contenido">
            <div class="col-md-12">
                <h2>Cancelar asesoría</h2>
                    <br></br>

                <select class="custom-select">
                    <option selected>Asesorías agendadas</option>
                    <option value="1">Formación Sociocultural III - Anzo Vázquez David Mokhtar - Lunes 4:00p.m. a 6:00p.m.</option>
                    <option value="2">Sistemas Operativos - Rubio Hernández J.Refigio - Martes 5:00p.m. a 6:00p.m.</option>
                    <option value="3">Conmutación de Redes de Datos - Parra Rodríguez Gerardo - Miércoles 4:00p.m. a 5:00p.m.</option>
                    <option value="4">Aplicaciones Web - Barrón Rodrguez Gabriel - Jueves 4:00p.m. a 6:00p.m.</option>
                    <option value="5">Integradora I - Barrón Rodrguez Gabriel - Viernes 4:00p.m. a 5:00p.m.</option>
                    <option value="6">Cálculo Diferencial - Hernández Sandoval Juana Martha - Sábado 8:00a.m. a 10:00a.m.</option>
                    <option value="7">Inglés III - Torres Rivera Jaime - Lunes 4:00p.m. a 6:00p.m.</option>
                    <option value="8">Infraestructura de Redes de Datos - Villanueva Gaytán Pamela - Martes 5:00p.m. a 6:00p.m.</option>
                </select>
               
            </div>
        
        <div class="col-md-12">

            <div class="modal" tabindex="-1" role="dialog">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">Modal title</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <p>Modal body text goes here.</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Save changes</button>
                        </div>
                    </div>
                </div>
            </div>

            <div class="tema">
                    <label for="exampleFormControlTextarea1" >Motivos de cancelación:</label>
                    <textarea class="form-control" id="exampleFormControlTextarea1" rows="5" placeholder="Agregar un comentario"></textarea>

            </br>
           
                    <button type="button" class="btn btn-red" data-toggle="" data-target="">
                            <a href="#">Guardar cambios</a>
                        </button>
                              
            </div>
            <!--<div class="tema"> 
                <input class="form-control" type="text" placeholder="Tema a tratar">  
            </div>-->
            
 
            <div class="col-md-12 ">
                
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
                        Cancelar Cita
                    </button>

                    <!-- Modal -->
                    <div class="modal fade" id="exampleModalCenter" tabindex="0" role="dialog"
                        aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                        <div class="modal-dialog modal-dialog-centered" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalCenterTitle">Aviso</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    La cita a sido exitosamente cancelada
                                </div>
                                <div class="modal-footer">
                                        
                                    <button data-dismiss="modal" type="button" class="btn btn-primary">Aceptar</button>
                                </div>

                            </div>
                        </div>
                    </div>
                
            </div>

        </div>





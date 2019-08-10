<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



        <div class="row contenido">
        <div class="col-md-12">
            <h2>Cancelar asesoría</h2>
        </div>
        <div class="col-md-12">
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                <label class="form-check-label" for="inlineCheckbox1">Grupo Obligatorio</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
                <label class="form-check-label" for="inlineCheckbox2">Clase Extra</label>
            </div>
        </div>
            <div class="col-md-12">
                    <br></br>
                <select class="custom-select">
                    <option selected>Asesorías agendadas</option>
                    <option value="1">Formación Sociocultural III - GIR0131 - Lunes 4:00p.m. a 6:00p.m.</option>
                    <option value="2">Sistemas Operativos - GIR0132 - Martes 5:00p.m. a 6:00p.m.</option>
                    <option value="3">Conmutación de Redes de Datos - GDS0131 - Miércoles 4:00p.m. a 5:00p.m.</option>
                    <option value="4">Aplicaciones Web - GDS0132 - Jueves 4:00p.m. a 6:00p.m.</option>
                    <option value="5">Integradora I - GDS0133 - Viernes 4:00p.m. a 5:00p.m.</option>
                    <option value="6">Cálculo Diferencial - GDS0134 - Sábado 8:00a.m. a 10:00a.m.</option>
                    <option value="7">Inglés III - GIR0133 - Lunes 4:00p.m. a 6:00p.m.</option>
                    <option value="8">Infraestructura de Redes de Datos - GIR0134 - Martes 5:00p.m. a 6:00p.m.</option>
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
                    <textarea class="form-control" id="exampleFormControlTextarea1" rows="5" placeholder="Describe el tema a tratar en asesorías"></textarea>
            </div>
            
 
            <div class="col-md-12 ">
                
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
                        Cancelar asesoria
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
                                    La asesoria a sido exitosamente cancelada.
                                    Se le informara de esta modificación al tutor de grupo y a dichos alumnos de este.
                                </div>
                                <div class="modal-footer">
                                        
                                    <button data-dismiss="modal" type="button" class="btn btn-primary">Aceptar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                
            </div>

        </div>

    </div>



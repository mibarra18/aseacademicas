<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



   


        <div class="row contenido">
            <div class="col-md-12">
                <h2>Agendar asesoría</h2>
            </div>
            <div class="col-md-6">
                <br></br>

                <select class="custom-select">
                    <option selected>Materia</option>
                    <option value="1">Formación Sociocultural III</option>
                    <option value="2">Sistemas Operativos</option>
                    <option value="3">Conmutación de Redes de Datos</option>
                    <option value="4">Aplicaciones Web</option>
                    <option value="5">Integradora I</option>
                    <option value="6">Cálculo Diferencial</option>
                    <option value="7">Inglés III</option>
                    <option value="8">Infraestructura de Redes de Datos</option>
                </select>

            </div>

            <div class="col-md-6">
                <br></br>

                <select class="custom-select">
                    <option selected>Profesor</option>
                    <option value="1">Anzo Vázquez David Mokhtar</option>
                    <option value="2">Rubio Hernández J.Refigio</option>
                    <option value="3">Parra Rodríguez Gerardo</option>
                    <option value="4">Barrón Rodrguez Gabriel</option>
                    <option value="5">Hernández Sandoval Juana Martha</option>
                    <option value="6">Torres Rivera Jaime</option>
                    <option value="7">Villanueva Gaytán Pamela</option>
                </select>

            </div>


            <div class="col-md-12">
                <table>

                    <style>
                        table {
                            font-family: arial, sans-serif;
                            border-collapse: collapse;
                            width: 100%;
                        }

                        td,
                        th {
                            border: 1px solid #dddddd;
                            text-align: left;
                            padding: 8px;
                        }

                        tr:nth-child(even) {
                            background-color: #dddddd;
                        }
                    </style>

                    <br>
                    <br>

                    <tr>

                        <th>Lunes</th>
                        <th>Martes</th>
                        <th>Miercoles</th>
                        <th>Jueves</th>
                        <th>Viernes</th>

                    </tr>
                    <tr>

                        <td></td>
                        <td>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" name="exampleRadios" id="exampleRadios1"
                                    value="option1" checked>
                                <label class="form-check-label" for="exampleRadios1">
                                    16:00-16:30
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" name="exampleRadios" id="exampleRadios1"
                                    value="option1" checked>
                                <label class="form-check-label" for="exampleRadios1">
                                    16:30-17:00
                                </label>
                            </div>
                        </td>
                        <td>

                        </td>
                        <td>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" name="exampleRadios" id="exampleRadios1"
                                    value="option1" checked>
                                <label class="form-check-label" for="exampleRadios1">
                                    17:00-17:30
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" name="exampleRadios" id="exampleRadios1"
                                    value="option1" checked>
                                <label class="form-check-label" for="exampleRadios1">
                                    17:30-18:00
                                </label>
                            </div>

                        </td>
                        <td></td>
                    </tr>


                </table>

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
                        <label for="exampleFormControlTextarea1">Tema a tratar:</label>
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="5"
                            placeholder="Describe el tema a tratar en asesorías"></textarea>
                    </div>
                    <!--<div class="tema"> 
                <input class="form-control" type="text" placeholder="Tema a tratar">  
            </div>-->

                    <div class="col-md-12 ">
                        
                            <!-- Button trigger modal -->
                            <button type="button" class="btn btn-primary" data-toggle="modal"
                                data-target="#exampleModalCenter">
                                Agendar Cita
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
                                            La cita a sido exitosamente agendada
                                        </div>
                                        <div class="modal-footer">

                                            <button data-dismiss="modal" type="button"
                                                class="btn btn-primary">Aceptar</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        
                    </div>

                </div>

            </div>
        </div>





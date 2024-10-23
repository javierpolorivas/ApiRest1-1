package com.vedruna.apiRest1_1.dto;

import com.vedruna.apiRest1_1.persistance.models.Alumno;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTO {
    private int alumnoId;
    private String nombre;
    private String apellido;
    private ContactoDTO contactodto;


    public AlumnoDTO(Alumno alumno) {
        this.alumnoId = alumno.getAlumnoId();
        this.nombre = alumno.getNombre();
        this.apellido = alumno.getApellido();
        this.contactodto= new ContactoDTO(alumno.getContacto());
    }
}
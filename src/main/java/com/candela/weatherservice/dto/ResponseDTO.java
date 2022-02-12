package com.candela.weatherservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {//clase poara enviar una respuesta con un mensj y con el httpstatus(200/400.etc)
//tanto de error como de exito
    private int status;
    private String message;

}

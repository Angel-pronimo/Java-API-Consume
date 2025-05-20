package com.alura.screenmatch.excepcion;

public class ErrorEnConversionDeDuracionException extends RuntimeException{
    private String mensaje;

    public ErrorEnConversionDeDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
            // TODO Auto-generated method stub
            return this.mensaje;
    }
}

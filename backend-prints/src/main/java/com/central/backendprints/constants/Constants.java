package com.central.backendprints.constants;

public class Constants {
    private Constants(){}
    public static final String API_VERSION = "v1";
    // ERRORS
    public static final String PREFIX_SERVER_ERROR = "SRV";
    public static final String PREFIX_CLIENT_ERROR = "CLI";
    // CLIENT ERRORS
    public static final String UNPROCESSABLE_ENTITY =  "003";
    public static final String BAD_REQUEST = "001";
    public static final String UNAUTHORIZED = "002";
    public static final String NOT_FOUND = "004";
    public static final String CONFLICT = "009";

    // SERVER ERRORS
    public static final String INTERNAL_SERVER_ERROR = "001";
    public static final String RESOURCE_ROLES = "/roles";
    public static final String RESOURCE_INDICADORES = "/indicadores";
    public static final String RESOURCE_INDICADOR = "/indicador";
    public static final String RESOURCE_PERIODOS= "/periodos";
    public static final String RESOURCE_INDICADOR_DATA= "/data";
    public static final Boolean RESOURCE_ACTIVE= Boolean.TRUE;
    public static final Boolean RESOURCE_DISABLED= Boolean.FALSE;
    
    public static final String REQ_HEADER_AUTHORIZATE = "Authorization";
    public static final String RESOURCE_ELIMINAR = "/eliminar";
    public static final String RESOURCE_REPORTE = "/reporte";

    public static final String RESOURCE_ACTUALIZAR = "/actualizar";
    
    //Usuario
    public static final String RESOURCE_USUARIO = "/usuario";
    public static final String RESOURCE_VALID_CODIGO_USUARIO = "/validarCodigoUsuario";
    
    public static final String RESOURCE_USUARIO_LOGIN ="/login";
    public static final String RESOURCE_USUARIO_GUARDAR ="/guardar";
    
    //Datos
    public static final String RESOURCE_DATOS = "/datoIndicadores";
    public static final String RESOURCE_DATO = "/datoIndicador";
    public static final String RESOURCE_TABLERO = "/tablero";
    
    //Areas
    public static final String RESOURCE_AREAS = "/areas";
    public static final String RESOURCE_AREA = "/area";
    
}

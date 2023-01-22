package co.com.certification.models.transversal;

import java.util.Map;

public class Peticiones {

    private Peticiones() {
    }

    private static Map<String, String> hedersRequest;
    private static String bodyRequest;
    private static String endPoint;
    private static String mensaje;
    private static String infoEmpleado;

    private static String RsEstadoCodigo;

    private static String estado;

    private static String id;


    public static Map<String, String> getHedersRequest() {
        return hedersRequest;
    }

    public static void setHedersRequest(Map<String, String> hedersRequest) {
        Peticiones.hedersRequest = hedersRequest;
    }

    public static String getBodyRequest() {
        return bodyRequest;
    }

    public static void setBodyRequest(String bodyRequest) {
        Peticiones.bodyRequest = bodyRequest;
    }

    public static String getEndPoint() {
        return endPoint;
    }

    public static void setEndPoint(String endPoint) {
        Peticiones.endPoint = endPoint;
    }

    public static String getMensaje() {
        return mensaje;
    }
    public static void setMensaje(String mensaje) {
        Peticiones.mensaje = mensaje;
    }

    public static String getRsEstadoCodigo() {
        return RsEstadoCodigo;
    }

    public static void setRsEstadoCodigo(String rsEstadoCodigo) {
        RsEstadoCodigo = rsEstadoCodigo;
    }

    public static String getInfoEmpleado() {
        return infoEmpleado;
    }

    public static void setInfoEmpleado(String infoEmpleado) {
        Peticiones.infoEmpleado = infoEmpleado;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        Peticiones.estado = estado;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Peticiones.id = id;
    }
}
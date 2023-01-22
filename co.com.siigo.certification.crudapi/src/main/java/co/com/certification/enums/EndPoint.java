package co.com.certification.enums;

public enum EndPoint {
    ENDPOINT_USUARIO("https://reqres.in/api/users/"),
    ENDPOINT_ERROR("http://dummy.restapiexample.com/api/v1/employeeE/"),
    ENDPOINT_CREAR("https://reqres.in/api/users"),
    ENDPOINT_DELETE("https://reqres.in/api/users/"),
    ENDPOINT_UPDATE("https://reqres.in/api/users/");
    private final String toString;

    EndPoint(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}

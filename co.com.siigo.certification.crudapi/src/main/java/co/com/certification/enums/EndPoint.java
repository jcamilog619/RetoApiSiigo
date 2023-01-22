package co.com.certification.enums;

public enum EndPoint {
    ENDPOINT_USUARIO("https://reqres.in/api/users/"),
    ENDPOINT_ERROR("http://dummy.restapiexample.com/api/v1/employeeE/");
    private final String toString;

    EndPoint(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}

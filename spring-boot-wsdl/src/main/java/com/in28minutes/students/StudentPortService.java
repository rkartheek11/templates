
package com.in28minutes.students;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StudentPortService", targetNamespace = "http://localhost:8080/students", wsdlLocation = "file:/Users/krachagundla/Phoenix/SpringBootWS/spring-boot-wsdl/src/main/resources/students.wsdl")
public class StudentPortService
    extends Service
{

    private final static URL STUDENTPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException STUDENTPORTSERVICE_EXCEPTION;
    private final static QName STUDENTPORTSERVICE_QNAME = new QName("http://localhost:8080/students", "StudentPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/krachagundla/Phoenix/SpringBootWS/spring-boot-wsdl/src/main/resources/students.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTPORTSERVICE_WSDL_LOCATION = url;
        STUDENTPORTSERVICE_EXCEPTION = e;
    }

    public StudentPortService() {
        super(__getWsdlLocation(), STUDENTPORTSERVICE_QNAME);
    }

    public StudentPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTPORTSERVICE_QNAME, features);
    }

    public StudentPortService(URL wsdlLocation) {
        super(wsdlLocation, STUDENTPORTSERVICE_QNAME);
    }

    public StudentPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTPORTSERVICE_QNAME, features);
    }

    public StudentPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentPort
     */
    @WebEndpoint(name = "StudentPortSoap11")
    public StudentPort getStudentPortSoap11() {
        return super.getPort(new QName("http://localhost:8080/students", "StudentPortSoap11"), StudentPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentPort
     */
    @WebEndpoint(name = "StudentPortSoap11")
    public StudentPort getStudentPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost:8080/students", "StudentPortSoap11"), StudentPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTPORTSERVICE_EXCEPTION!= null) {
            throw STUDENTPORTSERVICE_EXCEPTION;
        }
        return STUDENTPORTSERVICE_WSDL_LOCATION;
    }

}

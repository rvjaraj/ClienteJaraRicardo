package ec.edu.ups.exm.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2020-08-03T22:41:05.009-05:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "ServicesSOAPService", 
                  wsdlLocation = "file:/C:/Users/Vinicio/AppData/Local/Temp/tempdir390272937132689221.tmp/ServicesSOAP_1.wsdl",
                  targetNamespace = "http://services.exm.ups.edu.ec/") 
public class ServicesSOAPService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.exm.ups.edu.ec/", "ServicesSOAPService");
    public final static QName ServicesSOAPPort = new QName("http://services.exm.ups.edu.ec/", "ServicesSOAPPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Vinicio/AppData/Local/Temp/tempdir390272937132689221.tmp/ServicesSOAP_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServicesSOAPService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Vinicio/AppData/Local/Temp/tempdir390272937132689221.tmp/ServicesSOAP_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServicesSOAPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServicesSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicesSOAPService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServicesSOAPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServicesSOAPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServicesSOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ServicesSOAP
     */
    @WebEndpoint(name = "ServicesSOAPPort")
    public ServicesSOAP getServicesSOAPPort() {
        return super.getPort(ServicesSOAPPort, ServicesSOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicesSOAP
     */
    @WebEndpoint(name = "ServicesSOAPPort")
    public ServicesSOAP getServicesSOAPPort(WebServiceFeature... features) {
        return super.getPort(ServicesSOAPPort, ServicesSOAP.class, features);
    }

}

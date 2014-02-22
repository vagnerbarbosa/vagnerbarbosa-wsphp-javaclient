package br.edu.ifpb.clientjava;

import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.encoding.XMLType;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class ClientApp {

    public String check(String number) throws Exception {
        Service service = new Service();
        Call call = (Call) service.createCall();
        call.setTargetEndpointAddress(new java.net.URL("http://localhost/ifpb-pos-wsphp/webservice.php"));
        call.setOperationName("check");
        call.addParameter("check", XMLType.SOAP_STRING, ParameterMode.IN);
        call.setReturnType(XMLType.SOAP_STRING);
        String numberResult = (String) call.invoke(new Object[]{number});
        return numberResult;

    }
}

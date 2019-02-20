
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Authentication_QNAME = new QName("http://tempuri.org/", "Authentication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStakeholderInfo }
     * 
     */
    public GetStakeholderInfo createGetStakeholderInfo() {
        return new GetStakeholderInfo();
    }

    /**
     * Create an instance of {@link GetStakeholderInfoResponse }
     * 
     */
    public GetStakeholderInfoResponse createGetStakeholderInfoResponse() {
        return new GetStakeholderInfoResponse();
    }

    /**
     * Create an instance of {@link StakeholderInfo }
     * 
     */
    public StakeholderInfo createStakeholderInfo() {
        return new StakeholderInfo();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link ArrayOfStakeholder }
     * 
     */
    public ArrayOfStakeholder createArrayOfStakeholder() {
        return new ArrayOfStakeholder();
    }

    /**
     * Create an instance of {@link Stakeholder }
     * 
     */
    public Stakeholder createStakeholder() {
        return new Stakeholder();
    }

    /**
     * Create an instance of {@link ArrayOfLicense }
     * 
     */
    public ArrayOfLicense createArrayOfLicense() {
        return new ArrayOfLicense();
    }

    /**
     * Create an instance of {@link License }
     * 
     */
    public License createLicense() {
        return new License();
    }

    /**
     * Create an instance of {@link ErrorTable }
     * 
     */
    public ErrorTable createErrorTable() {
        return new ErrorTable();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

}

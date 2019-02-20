
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLicense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLicense"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="License" type="{http://tempuri.org/}License" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicense", propOrder = {
    "license"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
public class ArrayOfLicense {

    @XmlElement(name = "License", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected List<License> license=new ArrayList<License>();

    /**
     * Gets the value of the license property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the license property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link License }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public List<License> getLicense() {
        if (license == null) {
            license = new ArrayList<License>();
        }
        return this.license;
    }

}

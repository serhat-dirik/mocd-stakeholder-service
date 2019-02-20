
package org.tempuri;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StakeholderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StakeholderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stakeholders" type="{http://tempuri.org/}ArrayOfStakeholder" minOccurs="0"/&gt;
 *         &lt;element name="ErrorTable" type="{http://tempuri.org/}ErrorTable" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StakeholderInfo", propOrder = {
    "stakeholders",
    "errorTable"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
public class StakeholderInfo {

    @XmlElement(name = "Stakeholders")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected ArrayOfStakeholder stakeholders;
    @XmlElement(name = "ErrorTable")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected ErrorTable errorTable;

    /**
     * Gets the value of the stakeholders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStakeholder }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public ArrayOfStakeholder getStakeholders() {
        return stakeholders;
    }

    /**
     * Sets the value of the stakeholders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStakeholder }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setStakeholders(ArrayOfStakeholder value) {
        this.stakeholders = value;
    }

    /**
     * Gets the value of the errorTable property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public ErrorTable getErrorTable() {
        return errorTable;
    }

    /**
     * Sets the value of the errorTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setErrorTable(ErrorTable value) {
        this.errorTable = value;
    }

}


package org.tempuri;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetStakeholderInfoResult" type="{http://tempuri.org/}StakeholderInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStakeholderInfoResult"
})
@XmlRootElement(name = "GetStakeholderInfoResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
public class GetStakeholderInfoResponse {

    @XmlElement(name = "GetStakeholderInfoResult")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected StakeholderInfo getStakeholderInfoResult;

    /**
     * Gets the value of the getStakeholderInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link StakeholderInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public StakeholderInfo getGetStakeholderInfoResult() {
        return getStakeholderInfoResult;
    }

    /**
     * Sets the value of the getStakeholderInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StakeholderInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setGetStakeholderInfoResult(StakeholderInfo value) {
        this.getStakeholderInfoResult = value;
    }

}

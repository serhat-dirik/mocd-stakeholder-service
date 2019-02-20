
package org.tempuri;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.concurrent.ThreadLocalRandom;

/**
 * <p>Java class for Stakeholder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stakeholder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NameAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BanningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BanningReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Licenses" type="{http://tempuri.org/}ArrayOfLicense" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stakeholder", propOrder = {
    "id",
    "nameAR",
    "nameEN",
    "identityNumber",
    "dateOfBirth",
    "phoneNumber",
    "mobileNumber",
    "banningStatus",
    "banningReason",
    "gender",
    "nationality",
    "licenses"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
public class Stakeholder {

    @XmlElement(name = "Id")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected String id;
    @XmlElement(name = "NameAR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected String nameAR;
    @XmlElement(name = "NameEN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected String nameEN;
    @XmlElement(name = "IdentityNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected String identityNumber;
    @XmlElement(name = "DateOfBirth")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected String dateOfBirth;
    @XmlElement(name = "PhoneNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected String phoneNumber;
    @XmlElement(name = "MobileNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected String mobileNumber;
    @XmlElement(name = "BanningStatus")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected String banningStatus;
    @XmlElement(name = "BanningReason")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected String banningReason;
    @XmlElement(name = "Gender")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected String gender;
    @XmlElement(name = "Nationality")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected String nationality;
    @XmlElement(name = "Licenses")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    protected ArrayOfLicense licenses;

    public Stakeholder() {
		// TODO Auto-generated constructor stub
	}
    
    static Stakeholder randomGen() {
		Stakeholder sh = new Stakeholder();
		sh.setBanningStatus("false");
		sh.setBanningReason("");
		sh.setDateOfBirth(assignFromList("07/06/1974","15/03/1980","09/08/1990"));
		sh.setGender(assignFromList("Male","Female"));
		sh.setId(assignFromList("1","2","3","4","5","6","7","8","9","10"));
		sh.setIdentityNumber(assignFromList("1234512","1212312","3281678","238789327","824836287"));
		
		ArrayOfLicense licences = new ArrayOfLicense();
		licences.getLicense().add(License.genLicence());
		sh.setLicenses(licences);
		sh.setMobileNumber(assignFromList("232424","23423432","2678462786","76767867"));
        sh.setNameAR(assignFromList("ARName1","ARName2","ARName3"));
        sh.setNameEN(assignFromList("ENName1","ENName2","ENName3","ENName4"));
        sh.setNationality(assignFromList("TR","UE","US","UK"));
        sh.setPhoneNumber(assignFromList("232424","23423432","2678462786","76767867"));
		return sh;
	}
     static String assignFromList(String ... args) {
    	
    	int randomNum = ThreadLocalRandom.current().nextInt(0, args.length);
    	return args[randomNum];

    }
    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the nameAR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public String getNameAR() {
        return nameAR;
    }

    /**
     * Sets the value of the nameAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setNameAR(String value) {
        this.nameAR = value;
    }

    /**
     * Gets the value of the nameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public String getNameEN() {
        return nameEN;
    }

    /**
     * Sets the value of the nameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setNameEN(String value) {
        this.nameEN = value;
    }

    /**
     * Gets the value of the identityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public String getIdentityNumber() {
        return identityNumber;
    }

    /**
     * Sets the value of the identityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setIdentityNumber(String value) {
        this.identityNumber = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the banningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public String getBanningStatus() {
        return banningStatus;
    }

    /**
     * Sets the value of the banningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setBanningStatus(String value) {
        this.banningStatus = value;
    }

    /**
     * Gets the value of the banningReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public String getBanningReason() {
        return banningReason;
    }

    /**
     * Sets the value of the banningReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setBanningReason(String value) {
        this.banningReason = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the licenses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLicense }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public ArrayOfLicense getLicenses() {
        return licenses;
    }

    /**
     * Sets the value of the licenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLicense }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-02-21T12:59:07+04:00", comments = "JAXB RI v2.2.11")
    public void setLicenses(ArrayOfLicense value) {
        this.licenses = value;
    }

}

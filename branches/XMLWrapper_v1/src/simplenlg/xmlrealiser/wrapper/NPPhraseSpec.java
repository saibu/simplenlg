//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.15 at 11:31:42 AM EDT 
//


package simplenlg.xmlrealiser.wrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPPhraseSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPPhraseSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://code.google.com/p/simplenlg/schemas/version1}PhraseElement">
 *       &lt;sequence>
 *         &lt;element name="spec" type="{http://code.google.com/p/simplenlg/schemas/version1}WordElement" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://code.google.com/p/simplenlg/schemas/version1}npPhraseAtts"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPPhraseSpec", propOrder = {
    "spec"
})
public class NPPhraseSpec
    extends PhraseElement
{

    protected WordElement spec;
    @XmlAttribute(name = "ADJECTIVE_ORDERING")
    protected Boolean adjectiveordering;
    @XmlAttribute(name = "ELIDED")
    protected Boolean elided;
    @XmlAttribute(name = "NUMBER")
    protected NumberAgreement number;
    @XmlAttribute(name = "PERSON")
    protected Person person;
    @XmlAttribute(name = "POSSESSIVE")
    protected Boolean possessive;
    @XmlAttribute(name = "PRONOMINAL")
    protected Boolean pronominal;

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link WordElement }
     *     
     */
    public WordElement getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WordElement }
     *     
     */
    public void setSpec(WordElement value) {
        this.spec = value;
    }

    /**
     * Gets the value of the adjectiveordering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isADJECTIVEORDERING() {
        return adjectiveordering;
    }

    /**
     * Sets the value of the adjectiveordering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setADJECTIVEORDERING(Boolean value) {
        this.adjectiveordering = value;
    }

    /**
     * Gets the value of the elided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isELIDED() {
        return elided;
    }

    /**
     * Sets the value of the elided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setELIDED(Boolean value) {
        this.elided = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAgreement }
     *     
     */
    public NumberAgreement getNUMBER() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAgreement }
     *     
     */
    public void setNUMBER(NumberAgreement value) {
        this.number = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPERSON() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPERSON(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the possessive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOSSESSIVE() {
        return possessive;
    }

    /**
     * Sets the value of the possessive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOSSESSIVE(Boolean value) {
        this.possessive = value;
    }

    /**
     * Gets the value of the pronominal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPRONOMINAL() {
        return pronominal;
    }

    /**
     * Sets the value of the pronominal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPRONOMINAL(Boolean value) {
        this.pronominal = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.15 at 11:31:42 AM EDT 
//


package simplenlg.xmlrealiser.wrapper;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numberAgreement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="numberAgreement">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOTH"/>
 *     &lt;enumeration value="PLURAL"/>
 *     &lt;enumeration value="SINGULAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "numberAgreement")
@XmlEnum
public enum NumberAgreement {

    BOTH,
    PLURAL,
    SINGULAR;

    public String value() {
        return name();
    }

    public static NumberAgreement fromValue(String v) {
        return valueOf(v);
    }

}

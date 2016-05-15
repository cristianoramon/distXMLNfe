//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.09.21 at 02:41:30 PM GMT-03:00 
//


package ptc;


/**
 * Java content class for SignatureType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/c:/WebPhp5/web/Nfs/schemas/xmldsig-core-schema_v1.00.xsd line 21)
 * <p>
 * <pre>
 * &lt;complexType name="SignatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignedInfo" type="{http://www.w3.org/2000/09/xmldsig#}SignedInfoType"/>
 *         &lt;element name="SignatureValue" type="{http://www.w3.org/2000/09/xmldsig#}SignatureValueType"/>
 *         &lt;element name="KeyInfo" type="{http://www.w3.org/2000/09/xmldsig#}KeyInfoType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SignatureType {


    /**
     * Gets the value of the signedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ptc.SignedInfoType}
     */
    ptc.SignedInfoType getSignedInfo();

    /**
     * Sets the value of the signedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ptc.SignedInfoType}
     */
    void setSignedInfo(ptc.SignedInfoType value);

    /**
     * Gets the value of the keyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ptc.KeyInfoType}
     */
    ptc.KeyInfoType getKeyInfo();

    /**
     * Sets the value of the keyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ptc.KeyInfoType}
     */
    void setKeyInfo(ptc.KeyInfoType value);

    /**
     * Gets the value of the signatureValue property.
     * 
     * @return
     *     possible object is
     *     {@link ptc.SignatureValueType}
     */
    ptc.SignatureValueType getSignatureValue();

    /**
     * Sets the value of the signatureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ptc.SignatureValueType}
     */
    void setSignatureValue(ptc.SignatureValueType value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

}

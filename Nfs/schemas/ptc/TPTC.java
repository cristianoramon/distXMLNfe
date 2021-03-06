//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.09.21 at 02:41:30 PM GMT-03:00 
//


package ptc;


/**
 * Tipo Dados do PTC - Protocolo de Transferencia de Carga do Compartilhamento L�gico
 * Java content class for TPTC complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/c:/WebPhp5/web/Nfs/schemas/dadosPTC.xsd line 4)
 * <p>
 * <pre>
 * &lt;complexType name="TPTC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chPTC" minOccurs="0">
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{30}"/>
 *           &lt;/restriction>
 *         &lt;/element>
 *         &lt;element name="dEmi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="hEmi" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="dadosFisco" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
 *                   &lt;element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
 *                   &lt;element name="repEmi">
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;whiteSpace value="collapse"/>
 *                       &lt;maxLength value="60"/>
 *                     &lt;/restriction>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CFOP" type="{http://www.portalfiscal.inf.br/nfe}TCfop"/>
 *         &lt;element name="transp">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transporta" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice minOccurs="0">
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
 *                             &lt;/choice>
 *                             &lt;element name="xNome" minOccurs="0">
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;maxLength value="60"/>
 *                                 &lt;minLength value="1"/>
 *                                 &lt;whiteSpace value="collapse"/>
 *                               &lt;/restriction>
 *                             &lt;/element>
 *                             &lt;element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="condutor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
 *                             &lt;element name="xNome" minOccurs="0">
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;maxLength value="60"/>
 *                                 &lt;minLength value="1"/>
 *                                 &lt;whiteSpace value="collapse"/>
 *                               &lt;/restriction>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="tpTransp">
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                       &lt;enumeration value="3"/>
 *                       &lt;enumeration value="4"/>
 *                     &lt;/restriction>
 *                   &lt;/element>
 *                   &lt;element name="veicTransp" type="{http://www.portalfiscal.inf.br/nfe}TVeiculo"/>
 *                   &lt;element name="reboque" type="{http://www.portalfiscal.inf.br/nfe}TVeiculo" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="reboqueSec" type="{http://www.portalfiscal.inf.br/nfe}TVeiculo" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="obs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="TLayout" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="versao" use="required" fixed="1.01">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="4"/>
 *             &lt;fractionDigits value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface TPTC {


    /**
     * Identifica��o do Fisco Emitente
     * 
     * @return
     *     possible object is
     *     {@link ptc.TPTC.DadosFiscoType}
     */
    ptc.TPTC.DadosFiscoType getDadosFisco();

    /**
     * Identifica��o do Fisco Emitente
     * 
     * @param value
     *     allowed object is
     *     {@link ptc.TPTC.DadosFiscoType}
     */
    void setDadosFisco(ptc.TPTC.DadosFiscoType value);

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal}
     *     {@link java.math.BigDecimal}
     */
    java.math.BigDecimal getVersao();

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal}
     *     {@link java.math.BigDecimal}
     */
    void setVersao(java.math.BigDecimal value);

    /**
     * Hora de emiss�o do PTC (HH:MM:SS)
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getHEmi();

    /**
     * Hora de emiss�o do PTC (HH:MM:SS)
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setHEmi(java.util.Calendar value);

    /**
     * Dados dos transportes da NF-e
     * 
     * @return
     *     possible object is
     *     {@link ptc.TPTC.TranspType}
     */
    ptc.TPTC.TranspType getTransp();

    /**
     * Dados dos transportes da NF-e
     * 
     * @param value
     *     allowed object is
     *     {@link ptc.TPTC.TranspType}
     */
    void setTransp(ptc.TPTC.TranspType value);

    /**
     * Gets the value of the tLayout property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getTLayout();

    /**
     * Sets the value of the tLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setTLayout(java.lang.String value);

    /**
     * C�digo Fiscal de Opera��es e Presta��es
     * 
     */
    int getCFOP();

    /**
     * C�digo Fiscal de Opera��es e Presta��es
     * 
     */
    void setCFOP(int value);

    /**
     * Data de emiss�o do PTC (AAAA-MM-DD)
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getDEmi();

    /**
     * Data de emiss�o do PTC (AAAA-MM-DD)
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setDEmi(java.util.Calendar value);

    /**
     * Tipo Chave do PTC
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getChPTC();

    /**
     * Tipo Chave do PTC
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setChPTC(java.lang.String value);


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/c:/WebPhp5/web/Nfs/schemas/dadosPTC.xsd line 33)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
     *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
     *         &lt;element name="repEmi">
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;whiteSpace value="collapse"/>
     *             &lt;maxLength value="60"/>
     *           &lt;/restriction>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface DadosFiscoType {


        /**
         * CPF do agente
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getCPF();

        /**
         * CPF do agente
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setCPF(java.lang.String value);

        /**
         * Sigla da Unidade da Federa��o
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getUF();

        /**
         * Sigla da Unidade da Federa��o
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setUF(java.lang.String value);

        /**
         * Reparti��o Fiscal emitente
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getRepEmi();

        /**
         * Reparti��o Fiscal emitente
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setRepEmi(java.lang.String value);

    }


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/c:/WebPhp5/web/Nfs/schemas/dadosPTC.xsd line 69)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="transporta" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice minOccurs="0">
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
     *                   &lt;/choice>
     *                   &lt;element name="xNome" minOccurs="0">
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;maxLength value="60"/>
     *                       &lt;minLength value="1"/>
     *                       &lt;whiteSpace value="collapse"/>
     *                     &lt;/restriction>
     *                   &lt;/element>
     *                   &lt;element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="condutor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
     *                   &lt;element name="xNome" minOccurs="0">
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;maxLength value="60"/>
     *                       &lt;minLength value="1"/>
     *                       &lt;whiteSpace value="collapse"/>
     *                     &lt;/restriction>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="tpTransp">
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *             &lt;enumeration value="3"/>
     *             &lt;enumeration value="4"/>
     *           &lt;/restriction>
     *         &lt;/element>
     *         &lt;element name="veicTransp" type="{http://www.portalfiscal.inf.br/nfe}TVeiculo"/>
     *         &lt;element name="reboque" type="{http://www.portalfiscal.inf.br/nfe}TVeiculo" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="reboqueSec" type="{http://www.portalfiscal.inf.br/nfe}TVeiculo" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="obs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface TranspType {


        /**
         * Dados do segundo reboqueGets the value of the ReboqueSec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ReboqueSec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReboqueSec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ptc.TVeiculo}
         * 
         */
        java.util.List getReboqueSec();

        /**
         * Dados do reboqueGets the value of the Reboque property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Reboque property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReboque().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ptc.TVeiculo}
         * 
         */
        java.util.List getReboque();

        /**
         * Dados do ve�culo
         * 
         * @return
         *     possible object is
         *     {@link ptc.TVeiculo}
         */
        ptc.TVeiculo getVeicTransp();

        /**
         * Dados do ve�culo
         * 
         * @param value
         *     allowed object is
         *     {@link ptc.TVeiculo}
         */
        void setVeicTransp(ptc.TVeiculo value);

        /**
         * Dados do condutor do ve�culo
         * 
         * @return
         *     possible object is
         *     {@link ptc.TPTC.TranspType.CondutorType}
         */
        ptc.TPTC.TranspType.CondutorType getCondutor();

        /**
         * Dados do condutor do ve�culo
         * 
         * @param value
         *     allowed object is
         *     {@link ptc.TPTC.TranspType.CondutorType}
         */
        void setCondutor(ptc.TPTC.TranspType.CondutorType value);

        /**
         * Tipo do transporte(1 - terrestre; 2 - avi�o; 3 - aqu�tico; 4 - ferrovi�rio)
         * 
         */
        short getTpTransp();

        /**
         * Tipo do transporte(1 - terrestre; 2 - avi�o; 3 - aqu�tico; 4 - ferrovi�rio)
         * 
         */
        void setTpTransp(short value);

        /**
         * Para ser utilizado no caso de transportes n�o terrestres
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getObs();

        /**
         * Para ser utilizado no caso de transportes n�o terrestres
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setObs(java.lang.String value);

        /**
         * Dados do transportador
         * 
         * @return
         *     possible object is
         *     {@link ptc.TPTC.TranspType.TransportaType}
         */
        ptc.TPTC.TranspType.TransportaType getTransporta();

        /**
         * Dados do transportador
         * 
         * @param value
         *     allowed object is
         *     {@link ptc.TPTC.TranspType.TransportaType}
         */
        void setTransporta(ptc.TPTC.TranspType.TransportaType value);


        /**
         * Java content class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/c:/WebPhp5/web/Nfs/schemas/dadosPTC.xsd line 113)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
         *         &lt;element name="xNome" minOccurs="0">
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;maxLength value="60"/>
         *             &lt;minLength value="1"/>
         *             &lt;whiteSpace value="collapse"/>
         *           &lt;/restriction>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface CondutorType {


            /**
             * CPF do transportador
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getCPF();

            /**
             * CPF do transportador
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setCPF(java.lang.String value);

            /**
             * Nome
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getXNome();

            /**
             * Nome
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setXNome(java.lang.String value);

        }


        /**
         * Java content class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/c:/WebPhp5/web/Nfs/schemas/dadosPTC.xsd line 75)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice minOccurs="0">
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
         *         &lt;/choice>
         *         &lt;element name="xNome" minOccurs="0">
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;maxLength value="60"/>
         *             &lt;minLength value="1"/>
         *             &lt;whiteSpace value="collapse"/>
         *           &lt;/restriction>
         *         &lt;/element>
         *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface TransportaType {


            /**
             * CPF do transportador
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getCPF();

            /**
             * CPF do transportador
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setCPF(java.lang.String value);

            /**
             * Sigla da UF
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getUF();

            /**
             * Sigla da UF
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setUF(java.lang.String value);

            /**
             * Raz�o Social ou nome
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getXNome();

            /**
             * Raz�o Social ou nome
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setXNome(java.lang.String value);

            /**
             * CNPJ do transportador
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getCNPJ();

            /**
             * CNPJ do transportador
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setCNPJ(java.lang.String value);

        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.09.21 at 02:41:30 PM GMT-03:00 
//


package ptc.impl;

public class KeyValueTypeImpl implements ptc.KeyValueType, com.sun.xml.bind.JAXBObject, ptc.impl.runtime.UnmarshallableObject, ptc.impl.runtime.XMLSerializable, ptc.impl.runtime.ValidatableObject
{

    protected ptc.KeyValueType.RSAKeyValueType _RSAKeyValue;
    public final static java.lang.Class version = (ptc.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (ptc.KeyValueType.class);
    }

    public ptc.KeyValueType.RSAKeyValueType getRSAKeyValue() {
        return _RSAKeyValue;
    }

    public void setRSAKeyValue(ptc.KeyValueType.RSAKeyValueType value) {
        _RSAKeyValue = value;
    }

    public ptc.impl.runtime.UnmarshallingEventHandler createUnmarshaller(ptc.impl.runtime.UnmarshallingContext context) {
        return new ptc.impl.KeyValueTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(ptc.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _RSAKeyValue), "RSAKeyValue");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _RSAKeyValue), "RSAKeyValue");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _RSAKeyValue), "RSAKeyValue");
        context.endElement();
    }

    public void serializeAttributes(ptc.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(ptc.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (ptc.KeyValueType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0000pp\u0000sr\u0000\u001dcom."
+"sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.sun.msv."
+"grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.Unary"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee"
+"\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0011psr\u00002com.sun.msv.gr"
+"ammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0010\u0001"
+"q\u0000~\u0000\u0015sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom."
+"sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gramma"
+"r.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0016q\u0000~\u0000\u001bsr\u0000"
+"#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet"
+"\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001dxq\u0000~\u0000\u0018t\u0000 ptc.KeyValu"
+"eType.RSAKeyValueTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-e"
+"lementssq\u0000~\u0000\u000bppsq\u0000~\u0000\u0012q\u0000~\u0000\u0011psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~"
+"\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun"
+".msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.dataty"
+"pe.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype."
+"xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDa"
+"tatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001dL\u0000\btypeNameq\u0000~\u0000\u001dL\u0000\n"
+"whiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;x"
+"pt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv."
+"datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com."
+"sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com"
+".sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
+"\u0000\u0004ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000"
+"~\u0000\u001dL\u0000\fnamespaceURIq\u0000~\u0000\u001dxpq\u0000~\u0000.q\u0000~\u0000-sq\u0000~\u0000\u001ct\u0000\u0004typet\u0000)http://ww"
+"w.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000\u000bRSAKeyValuet\u0000\""
+"http://www.w3.org/2000/09/xmldsig#sr\u0000\"com.sun.msv.grammar.Ex"
+"pressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Ex"
+"pressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expression"
+"Pool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt"
+"\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0004\u0001pq\u0000~\u0000\u000fq\u0000~\u0000\fq\u0000~\u0000"
+"\tq\u0000~\u0000!x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public static class RSAKeyValueTypeImpl implements ptc.KeyValueType.RSAKeyValueType, com.sun.xml.bind.JAXBObject, ptc.impl.runtime.UnmarshallableObject, ptc.impl.runtime.XMLSerializable, ptc.impl.runtime.ValidatableObject
    {

        protected byte[] _Exponent;
        protected byte[] _Modulus;
        public final static java.lang.Class version = (ptc.impl.JAXBVersion.class);
        private static com.sun.msv.grammar.Grammar schemaFragment;

        private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
            return (ptc.KeyValueType.RSAKeyValueType.class);
        }

        public byte[] getExponent() {
            return _Exponent;
        }

        public void setExponent(byte[] value) {
            _Exponent = value;
        }

        public byte[] getModulus() {
            return _Modulus;
        }

        public void setModulus(byte[] value) {
            _Modulus = value;
        }

        public ptc.impl.runtime.UnmarshallingEventHandler createUnmarshaller(ptc.impl.runtime.UnmarshallingContext context) {
            return new ptc.impl.KeyValueTypeImpl.RSAKeyValueTypeImpl.Unmarshaller(context);
        }

        public void serializeBody(ptc.impl.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
            context.startElement("http://www.w3.org/2000/09/xmldsig#", "Modulus");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(com.sun.msv.datatype.xsd.Base64BinaryType.save(((byte[]) _Modulus)), "Modulus");
            } catch (java.lang.Exception e) {
                ptc.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
            context.startElement("http://www.w3.org/2000/09/xmldsig#", "Exponent");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(com.sun.msv.datatype.xsd.Base64BinaryType.save(((byte[]) _Exponent)), "Exponent");
            } catch (java.lang.Exception e) {
                ptc.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }

        public void serializeAttributes(ptc.impl.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
        }

        public void serializeURIs(ptc.impl.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
        }

        public java.lang.Class getPrimaryInterface() {
            return (ptc.KeyValueType.RSAKeyValueType.class);
        }

        public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
            if (schemaFragment == null) {
                schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsr\u0000\'com.sun.msv.grammar.trex.ElementPatt"
+"ern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;"
+"xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndecl"
+"aredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0000ppsr\u0000\u001bcom.s"
+"un.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/dataty"
+"pe/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/String"
+"Pair;xq\u0000~\u0000\u0003ppsr\u0000\'com.sun.msv.datatype.xsd.FinalComponent\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\nfinalValuexr\u0000\u001ecom.sun.msv.datatype.xsd.Proxy\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;"
+"xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnam"
+"espaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0013L\u0000\nwhiteSpacet"
+"\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000\"http://"
+"www.w3.org/2000/09/xmldsig#t\u0000\fCryptoBinarysr\u00005com.sun.msv.da"
+"tatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.su"
+"n.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u0000)com.s"
+"un.msv.datatype.xsd.Base64BinaryType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.m"
+"sv.datatype.xsd.BinaryBaseType\u00a7\u00ce\u000e\u0097^\u00afW\u0011\u0002\u0000\u0000xr\u0000*com.sun.msv.dat"
+"atype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.dataty"
+"pe.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0012t\u0000 http://www.w3.org/200"
+"1/XMLSchemat\u0000\fbase64Binaryq\u0000~\u0000\u001a\u0000\u0000\u0000\u0000sr\u00000com.sun.msv.grammar.E"
+"xpression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.ms"
+"v.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0013L\u0000\fnamespaceURI"
+"q\u0000~\u0000\u0013xpq\u0000~\u0000!q\u0000~\u0000\u0016sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003e"
+"xpq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0007xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002"
+"\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u000bppsr\u0000\"com.sun.msv.datatype.xsd.QnameType"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001dq\u0000~\u0000 t\u0000\u0005QNameq\u0000~\u0000\u001aq\u0000~\u0000#sq\u0000~\u0000$q\u0000~\u0000/q\u0000~\u0000 sr\u0000#"
+"com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000"
+"~\u0000\u0013L\u0000\fnamespaceURIq\u0000~\u0000\u0013xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instance"
+"sr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000*\u0001q\u0000~\u00007sq\u0000~\u00001t\u0000\u0007Modulusq\u0000~\u0000\u0016sq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\u0000ppq"
+"\u0000~\u0000\u000esq\u0000~\u0000&ppsq\u0000~\u0000(q\u0000~\u0000+pq\u0000~\u0000,q\u0000~\u00003q\u0000~\u00007sq\u0000~\u00001t\u0000\bExponentq\u0000~\u0000"
+"\u0016sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTabl"
+"et\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com"
+".sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005coun"
+"tB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Expression"
+"Pool;xp\u0000\u0000\u0000\u0005\u0001pq\u0000~\u0000\u0005q\u0000~\u0000\nq\u0000~\u0000<q\u0000~\u0000\'q\u0000~\u0000=x"));
            }
            return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
        }

        public class Unmarshaller
            extends ptc.impl.runtime.AbstractUnmarshallingEventHandlerImpl
        {


            public Unmarshaller(ptc.impl.runtime.UnmarshallingContext context) {
                super(context, "-------");
            }

            protected Unmarshaller(ptc.impl.runtime.UnmarshallingContext context, int startState) {
                this(context);
                state = startState;
            }

            public java.lang.Object owner() {
                return ptc.impl.KeyValueTypeImpl.RSAKeyValueTypeImpl.this;
            }

            public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  3 :
                            if (("Exponent" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                                context.pushAttributes(__atts, true);
                                state = 4;
                                return ;
                            }
                            break;
                        case  0 :
                            if (("Modulus" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                                context.pushAttributes(__atts, true);
                                state = 1;
                                return ;
                            }
                            break;
                        case  6 :
                            revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                            return ;
                    }
                    super.enterElement(___uri, ___local, ___qname, __atts);
                    break;
                }
            }

            public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  2 :
                            if (("Modulus" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                                context.popAttributes();
                                state = 3;
                                return ;
                            }
                            break;
                        case  6 :
                            revertToParentFromLeaveElement(___uri, ___local, ___qname);
                            return ;
                        case  5 :
                            if (("Exponent" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                                context.popAttributes();
                                state = 6;
                                return ;
                            }
                            break;
                    }
                    super.leaveElement(___uri, ___local, ___qname);
                    break;
                }
            }

            public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  6 :
                            revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                            return ;
                    }
                    super.enterAttribute(___uri, ___local, ___qname);
                    break;
                }
            }

            public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  6 :
                            revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                            return ;
                    }
                    super.leaveAttribute(___uri, ___local, ___qname);
                    break;
                }
            }

            public void handleText(final java.lang.String value)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    try {
                        switch (state) {
                            case  1 :
                                state = 2;
                                eatText1(value);
                                return ;
                            case  6 :
                                revertToParentFromText(value);
                                return ;
                            case  4 :
                                state = 5;
                                eatText2(value);
                                return ;
                        }
                    } catch (java.lang.RuntimeException e) {
                        handleUnexpectedTextException(value, e);
                    }
                    break;
                }
            }

            private void eatText1(final java.lang.String value)
                throws org.xml.sax.SAXException
            {
                try {
                    _Modulus = com.sun.msv.datatype.xsd.Base64BinaryType.load(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                } catch (java.lang.Exception e) {
                    handleParseConversionException(e);
                }
            }

            private void eatText2(final java.lang.String value)
                throws org.xml.sax.SAXException
            {
                try {
                    _Exponent = com.sun.msv.datatype.xsd.Base64BinaryType.load(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                } catch (java.lang.Exception e) {
                    handleParseConversionException(e);
                }
            }

        }

    }

    public class Unmarshaller
        extends ptc.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(ptc.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(ptc.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return ptc.impl.KeyValueTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("Modulus" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _RSAKeyValue = ((ptc.impl.KeyValueTypeImpl.RSAKeyValueTypeImpl) spawnChildFromEnterElement((ptc.impl.KeyValueTypeImpl.RSAKeyValueTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  0 :
                        if (("RSAKeyValue" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("RSAKeyValue" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
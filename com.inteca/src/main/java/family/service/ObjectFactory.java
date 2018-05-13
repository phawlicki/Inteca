
package family.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the family.service package. 
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

    private final static QName _CreateChild_QNAME = new QName("http://service.family/", "createChild");
    private final static QName _CreateChildResponse_QNAME = new QName("http://service.family/", "createChildResponse");
    private final static QName _CreateFather_QNAME = new QName("http://service.family/", "createFather");
    private final static QName _CreateFatherResponse_QNAME = new QName("http://service.family/", "createFatherResponse");
    private final static QName _CreateMother_QNAME = new QName("http://service.family/", "createMother");
    private final static QName _CreateMotherResponse_QNAME = new QName("http://service.family/", "createMotherResponse");
    private final static QName _ReadChild_QNAME = new QName("http://service.family/", "readChild");
    private final static QName _ReadChildResponse_QNAME = new QName("http://service.family/", "readChildResponse");
    private final static QName _ReadFather_QNAME = new QName("http://service.family/", "readFather");
    private final static QName _ReadFatherResponse_QNAME = new QName("http://service.family/", "readFatherResponse");
    private final static QName _ReadMother_QNAME = new QName("http://service.family/", "readMother");
    private final static QName _ReadMotherResponse_QNAME = new QName("http://service.family/", "readMotherResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: family.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateChild }
     * 
     */
    public CreateChild createCreateChild() {
        return new CreateChild();
    }

    /**
     * Create an instance of {@link CreateChildResponse }
     * 
     */
    public CreateChildResponse createCreateChildResponse() {
        return new CreateChildResponse();
    }

    /**
     * Create an instance of {@link CreateFather }
     * 
     */
    public CreateFather createCreateFather() {
        return new CreateFather();
    }

    /**
     * Create an instance of {@link CreateFatherResponse }
     * 
     */
    public CreateFatherResponse createCreateFatherResponse() {
        return new CreateFatherResponse();
    }

    /**
     * Create an instance of {@link CreateMother }
     * 
     */
    public CreateMother createCreateMother() {
        return new CreateMother();
    }

    /**
     * Create an instance of {@link CreateMotherResponse }
     * 
     */
    public CreateMotherResponse createCreateMotherResponse() {
        return new CreateMotherResponse();
    }

    /**
     * Create an instance of {@link ReadChild }
     * 
     */
    public ReadChild createReadChild() {
        return new ReadChild();
    }

    /**
     * Create an instance of {@link ReadChildResponse }
     * 
     */
    public ReadChildResponse createReadChildResponse() {
        return new ReadChildResponse();
    }

    /**
     * Create an instance of {@link ReadFather }
     * 
     */
    public ReadFather createReadFather() {
        return new ReadFather();
    }

    /**
     * Create an instance of {@link ReadFatherResponse }
     * 
     */
    public ReadFatherResponse createReadFatherResponse() {
        return new ReadFatherResponse();
    }

    /**
     * Create an instance of {@link ReadMother }
     * 
     */
    public ReadMother createReadMother() {
        return new ReadMother();
    }

    /**
     * Create an instance of {@link ReadMotherResponse }
     * 
     */
    public ReadMotherResponse createReadMotherResponse() {
        return new ReadMotherResponse();
    }

    /**
     * Create an instance of {@link FamilyMember }
     * 
     */
    public FamilyMember createFamilyMember() {
        return new FamilyMember();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateChild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "createChild")
    public JAXBElement<CreateChild> createCreateChild(CreateChild value) {
        return new JAXBElement<CreateChild>(_CreateChild_QNAME, CreateChild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateChildResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "createChildResponse")
    public JAXBElement<CreateChildResponse> createCreateChildResponse(CreateChildResponse value) {
        return new JAXBElement<CreateChildResponse>(_CreateChildResponse_QNAME, CreateChildResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "createFather")
    public JAXBElement<CreateFather> createCreateFather(CreateFather value) {
        return new JAXBElement<CreateFather>(_CreateFather_QNAME, CreateFather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "createFatherResponse")
    public JAXBElement<CreateFatherResponse> createCreateFatherResponse(CreateFatherResponse value) {
        return new JAXBElement<CreateFatherResponse>(_CreateFatherResponse_QNAME, CreateFatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMother }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "createMother")
    public JAXBElement<CreateMother> createCreateMother(CreateMother value) {
        return new JAXBElement<CreateMother>(_CreateMother_QNAME, CreateMother.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMotherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "createMotherResponse")
    public JAXBElement<CreateMotherResponse> createCreateMotherResponse(CreateMotherResponse value) {
        return new JAXBElement<CreateMotherResponse>(_CreateMotherResponse_QNAME, CreateMotherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadChild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "readChild")
    public JAXBElement<ReadChild> createReadChild(ReadChild value) {
        return new JAXBElement<ReadChild>(_ReadChild_QNAME, ReadChild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadChildResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "readChildResponse")
    public JAXBElement<ReadChildResponse> createReadChildResponse(ReadChildResponse value) {
        return new JAXBElement<ReadChildResponse>(_ReadChildResponse_QNAME, ReadChildResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "readFather")
    public JAXBElement<ReadFather> createReadFather(ReadFather value) {
        return new JAXBElement<ReadFather>(_ReadFather_QNAME, ReadFather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "readFatherResponse")
    public JAXBElement<ReadFatherResponse> createReadFatherResponse(ReadFatherResponse value) {
        return new JAXBElement<ReadFatherResponse>(_ReadFatherResponse_QNAME, ReadFatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMother }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "readMother")
    public JAXBElement<ReadMother> createReadMother(ReadMother value) {
        return new JAXBElement<ReadMother>(_ReadMother_QNAME, ReadMother.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMotherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.family/", name = "readMotherResponse")
    public JAXBElement<ReadMotherResponse> createReadMotherResponse(ReadMotherResponse value) {
        return new JAXBElement<ReadMotherResponse>(_ReadMotherResponse_QNAME, ReadMotherResponse.class, null, value);
    }

}

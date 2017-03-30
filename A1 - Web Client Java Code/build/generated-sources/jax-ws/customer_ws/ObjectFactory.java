
package customer_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the customer_ws package. 
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

    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://customer_ws/", "delete_CustomerResponse");
    private final static QName _EditCustomerResponse_QNAME = new QName("http://customer_ws/", "edit_CustomerResponse");
    private final static QName _ShowCustomers_QNAME = new QName("http://customer_ws/", "show_Customers");
    private final static QName _AddCustomerResponse_QNAME = new QName("http://customer_ws/", "add_CustomerResponse");
    private final static QName _AddCustomer_QNAME = new QName("http://customer_ws/", "add_Customer");
    private final static QName _EditCustomer_QNAME = new QName("http://customer_ws/", "edit_Customer");
    private final static QName _ShowCustomersResponse_QNAME = new QName("http://customer_ws/", "show_CustomersResponse");
    private final static QName _DeleteCustomer_QNAME = new QName("http://customer_ws/", "delete_Customer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: customer_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowCustomers }
     * 
     */
    public ShowCustomers createShowCustomers() {
        return new ShowCustomers();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link EditCustomerResponse }
     * 
     */
    public EditCustomerResponse createEditCustomerResponse() {
        return new EditCustomerResponse();
    }

    /**
     * Create an instance of {@link EditCustomer }
     * 
     */
    public EditCustomer createEditCustomer() {
        return new EditCustomer();
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link ShowCustomersResponse }
     * 
     */
    public ShowCustomersResponse createShowCustomersResponse() {
        return new ShowCustomersResponse();
    }

    /**
     * Create an instance of {@link Customers }
     * 
     */
    public Customers createCustomers() {
        return new Customers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_ws/", name = "delete_CustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_ws/", name = "edit_CustomerResponse")
    public JAXBElement<EditCustomerResponse> createEditCustomerResponse(EditCustomerResponse value) {
        return new JAXBElement<EditCustomerResponse>(_EditCustomerResponse_QNAME, EditCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCustomers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_ws/", name = "show_Customers")
    public JAXBElement<ShowCustomers> createShowCustomers(ShowCustomers value) {
        return new JAXBElement<ShowCustomers>(_ShowCustomers_QNAME, ShowCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_ws/", name = "add_CustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<AddCustomerResponse>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_ws/", name = "add_Customer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<AddCustomer>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_ws/", name = "edit_Customer")
    public JAXBElement<EditCustomer> createEditCustomer(EditCustomer value) {
        return new JAXBElement<EditCustomer>(_EditCustomer_QNAME, EditCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCustomersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_ws/", name = "show_CustomersResponse")
    public JAXBElement<ShowCustomersResponse> createShowCustomersResponse(ShowCustomersResponse value) {
        return new JAXBElement<ShowCustomersResponse>(_ShowCustomersResponse_QNAME, ShowCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_ws/", name = "delete_Customer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

}

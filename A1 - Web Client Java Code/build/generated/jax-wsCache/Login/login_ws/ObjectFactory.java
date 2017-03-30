
package login_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the login_ws package. 
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

    private final static QName _UpdateEmployeeResponse_QNAME = new QName("http://login_ws/", "update_employeeResponse");
    private final static QName _LoginEmployee_QNAME = new QName("http://login_ws/", "login_employee");
    private final static QName _AddEmployees_QNAME = new QName("http://login_ws/", "add_employees");
    private final static QName _AddEmployeesResponse_QNAME = new QName("http://login_ws/", "add_employeesResponse");
    private final static QName _ShowEmployees_QNAME = new QName("http://login_ws/", "show_employees");
    private final static QName _DeleteEmployeeResponse_QNAME = new QName("http://login_ws/", "delete_employeeResponse");
    private final static QName _LoginEmployeeResponse_QNAME = new QName("http://login_ws/", "login_employeeResponse");
    private final static QName _UpdateEmployee_QNAME = new QName("http://login_ws/", "update_employee");
    private final static QName _ShowEmployeesResponse_QNAME = new QName("http://login_ws/", "show_employeesResponse");
    private final static QName _DeleteEmployee_QNAME = new QName("http://login_ws/", "delete_employee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: login_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link LoginEmployeeResponse }
     * 
     */
    public LoginEmployeeResponse createLoginEmployeeResponse() {
        return new LoginEmployeeResponse();
    }

    /**
     * Create an instance of {@link UpdateEmployee }
     * 
     */
    public UpdateEmployee createUpdateEmployee() {
        return new UpdateEmployee();
    }

    /**
     * Create an instance of {@link ShowEmployeesResponse }
     * 
     */
    public ShowEmployeesResponse createShowEmployeesResponse() {
        return new ShowEmployeesResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link UpdateEmployeeResponse }
     * 
     */
    public UpdateEmployeeResponse createUpdateEmployeeResponse() {
        return new UpdateEmployeeResponse();
    }

    /**
     * Create an instance of {@link LoginEmployee }
     * 
     */
    public LoginEmployee createLoginEmployee() {
        return new LoginEmployee();
    }

    /**
     * Create an instance of {@link AddEmployees }
     * 
     */
    public AddEmployees createAddEmployees() {
        return new AddEmployees();
    }

    /**
     * Create an instance of {@link AddEmployeesResponse }
     * 
     */
    public AddEmployeesResponse createAddEmployeesResponse() {
        return new AddEmployeesResponse();
    }

    /**
     * Create an instance of {@link ShowEmployees }
     * 
     */
    public ShowEmployees createShowEmployees() {
        return new ShowEmployees();
    }

    /**
     * Create an instance of {@link Employees }
     * 
     */
    public Employees createEmployees() {
        return new Employees();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://login_ws/", name = "update_employeeResponse")
    public JAXBElement<UpdateEmployeeResponse> createUpdateEmployeeResponse(UpdateEmployeeResponse value) {
        return new JAXBElement<UpdateEmployeeResponse>(_UpdateEmployeeResponse_QNAME, UpdateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://login_ws/", name = "login_employee")
    public JAXBElement<LoginEmployee> createLoginEmployee(LoginEmployee value) {
        return new JAXBElement<LoginEmployee>(_LoginEmployee_QNAME, LoginEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://login_ws/", name = "add_employees")
    public JAXBElement<AddEmployees> createAddEmployees(AddEmployees value) {
        return new JAXBElement<AddEmployees>(_AddEmployees_QNAME, AddEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://login_ws/", name = "add_employeesResponse")
    public JAXBElement<AddEmployeesResponse> createAddEmployeesResponse(AddEmployeesResponse value) {
        return new JAXBElement<AddEmployeesResponse>(_AddEmployeesResponse_QNAME, AddEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://login_ws/", name = "show_employees")
    public JAXBElement<ShowEmployees> createShowEmployees(ShowEmployees value) {
        return new JAXBElement<ShowEmployees>(_ShowEmployees_QNAME, ShowEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://login_ws/", name = "delete_employeeResponse")
    public JAXBElement<DeleteEmployeeResponse> createDeleteEmployeeResponse(DeleteEmployeeResponse value) {
        return new JAXBElement<DeleteEmployeeResponse>(_DeleteEmployeeResponse_QNAME, DeleteEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://login_ws/", name = "login_employeeResponse")
    public JAXBElement<LoginEmployeeResponse> createLoginEmployeeResponse(LoginEmployeeResponse value) {
        return new JAXBElement<LoginEmployeeResponse>(_LoginEmployeeResponse_QNAME, LoginEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://login_ws/", name = "update_employee")
    public JAXBElement<UpdateEmployee> createUpdateEmployee(UpdateEmployee value) {
        return new JAXBElement<UpdateEmployee>(_UpdateEmployee_QNAME, UpdateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://login_ws/", name = "show_employeesResponse")
    public JAXBElement<ShowEmployeesResponse> createShowEmployeesResponse(ShowEmployeesResponse value) {
        return new JAXBElement<ShowEmployeesResponse>(_ShowEmployeesResponse_QNAME, ShowEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://login_ws/", name = "delete_employee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

}

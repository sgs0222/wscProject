
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mypackage package.
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

    private final static QName _JobSearch_QNAME = new QName("", "job-search");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JobSearchType }
     *
     */
    public JobSearchType createJobSearchType() {
        return new JobSearchType();
    }

    /**
     * Create an instance of {@link JobType }
     *
     */
    public JobType createJobType() {
        return new JobType();
    }

    /**
     * Create an instance of {@link SalaryType }
     *
     */
    public SalaryType createSalaryType() {
        return new SalaryType();
    }

    /**
     * Create an instance of {@link JobsType }
     *
     */
    public JobsType createJobsType() {
        return new JobsType();
    }

    /**
     * Create an instance of {@link CloseTypeType }
     *
     */
    public CloseTypeType createCloseTypeType() {
        return new CloseTypeType();
    }

    /**
     * Create an instance of {@link NameType }
     *
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link IndustryType }
     *
     */
    public IndustryType createIndustryType() {
        return new IndustryType();
    }

    /**
     * Create an instance of {@link JobCategoryType }
     *
     */
    public JobCategoryType createJobCategoryType() {
        return new JobCategoryType();
    }

    /**
     * Create an instance of {@link JobTypeType }
     *
     */
    public JobTypeType createJobTypeType() {
        return new JobTypeType();
    }

    /**
     * Create an instance of {@link ExperienceLevelType }
     *
     */
    public ExperienceLevelType createExperienceLevelType() {
        return new ExperienceLevelType();
    }

    /**
     * Create an instance of {@link RequiredEducationLevelType }
     *
     */
    public RequiredEducationLevelType createRequiredEducationLevelType() {
        return new RequiredEducationLevelType();
    }

    /**
     * Create an instance of {@link LocationType }
     *
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link PositionType }
     *
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link CompanyType }
     *
     */
    public CompanyType createCompanyType() {
        return new CompanyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobSearchType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "job-search")
    public JAXBElement<JobSearchType> createJobSearch(JobSearchType value) {
        return new JAXBElement<JobSearchType>(_JobSearch_QNAME, JobSearchType.class, null, value);
    }

}

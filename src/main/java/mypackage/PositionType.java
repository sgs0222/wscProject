
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="PHP��������(����Ʈ����)����"/>
 *               &lt;enumeration value="���� ȸ��, �˻ѿ��� ���ۺ��Ÿ� ��ʴϴ�. "/>
 *               &lt;enumeration value="�Ż翪 �¶��θ�����ȸ�翡�� �Բ��� ������ ä���մϴ�."/>
 *               &lt;enumeration value="[��� ����/�����] �������� ���� �������̳� ä��"/>
 *               &lt;enumeration value="���ۺ��� ����� ����"/>
 *               &lt;enumeration value="��������� ä�� ���� (��/�� ����, ��/�� ������)"/>
 *               &lt;enumeration value="��(�����)���� ��ȹ �� � "/>
 *               &lt;enumeration value="�ۺ��̰����� �������̳�"/>
 *               &lt;enumeration value="���� ������ű���� UI,UX���� ��� ä��"/>
 *               &lt;enumeration value="[��5��/���ǵ�] �������̳� / �������� ���� "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="location" type="{}locationType"/>
 *         &lt;element name="job-type" type="{}job-typeType"/>
 *         &lt;element name="industry" type="{}industryType"/>
 *         &lt;element name="job-category" type="{}job-categoryType"/>
 *         &lt;element name="open-quantity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="00"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="��"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="experience-level" type="{}experience-levelType"/>
 *         &lt;element name="required-education-level" type="{}required-education-levelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionType", propOrder = {
    "title",
    "location",
    "jobType",
    "industry",
    "jobCategory",
    "openQuantity",
    "experienceLevel",
    "requiredEducationLevel"
})
public class PositionType {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected LocationType location;
    @XmlElement(name = "job-type", required = true)
    protected JobTypeType jobType;
    @XmlElement(required = true)
    protected IndustryType industry;
    @XmlElement(name = "job-category", required = true)
    protected JobCategoryType jobCategory;
    @XmlElement(name = "open-quantity", required = true)
    protected String openQuantity;
    @XmlElement(name = "experience-level", required = true)
    protected ExperienceLevelType experienceLevel;
    @XmlElement(name = "required-education-level", required = true)
    protected RequiredEducationLevelType requiredEducationLevel;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link JobTypeType }
     *     
     */
    public JobTypeType getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTypeType }
     *     
     */
    public void setJobType(JobTypeType value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryType }
     *     
     */
    public IndustryType getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryType }
     *     
     */
    public void setIndustry(IndustryType value) {
        this.industry = value;
    }

    /**
     * Gets the value of the jobCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JobCategoryType }
     *     
     */
    public JobCategoryType getJobCategory() {
        return jobCategory;
    }

    /**
     * Sets the value of the jobCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobCategoryType }
     *     
     */
    public void setJobCategory(JobCategoryType value) {
        this.jobCategory = value;
    }

    /**
     * Gets the value of the openQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenQuantity() {
        return openQuantity;
    }

    /**
     * Sets the value of the openQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenQuantity(String value) {
        this.openQuantity = value;
    }

    /**
     * Gets the value of the experienceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ExperienceLevelType }
     *     
     */
    public ExperienceLevelType getExperienceLevel() {
        return experienceLevel;
    }

    /**
     * Sets the value of the experienceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperienceLevelType }
     *     
     */
    public void setExperienceLevel(ExperienceLevelType value) {
        this.experienceLevel = value;
    }

    /**
     * Gets the value of the requiredEducationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredEducationLevelType }
     *     
     */
    public RequiredEducationLevelType getRequiredEducationLevel() {
        return requiredEducationLevel;
    }

    /**
     * Sets the value of the requiredEducationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredEducationLevelType }
     *     
     */
    public void setRequiredEducationLevel(RequiredEducationLevelType value) {
        this.requiredEducationLevel = value;
    }

}


package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="25424328"/>
 *               &lt;enumeration value="25416759"/>
 *               &lt;enumeration value="25411696"/>
 *               &lt;enumeration value="25406627"/>
 *               &lt;enumeration value="25406618"/>
 *               &lt;enumeration value="25406613"/>
 *               &lt;enumeration value="25400835"/>
 *               &lt;enumeration value="25396670"/>
 *               &lt;enumeration value="25389426"/>
 *               &lt;enumeration value="25385729"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="url">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25424328#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25416759#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25411696#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25406627#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25406618#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25406613#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25400835#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25396670#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25389426#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25385729#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posting-timestamp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1448411801"/>
 *               &lt;enumeration value="1448343922"/>
 *               &lt;enumeration value="1448325923"/>
 *               &lt;enumeration value="1448286531"/>
 *               &lt;enumeration value="1448286442"/>
 *               &lt;enumeration value="1448286368"/>
 *               &lt;enumeration value="1448268946"/>
 *               &lt;enumeration value="1448259980"/>
 *               &lt;enumeration value="1448242002"/>
 *               &lt;enumeration value="1448185191"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="modification-timestamp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1448411801"/>
 *               &lt;enumeration value="1448343922"/>
 *               &lt;enumeration value="1448325999"/>
 *               &lt;enumeration value="1448412533"/>
 *               &lt;enumeration value="1448412548"/>
 *               &lt;enumeration value="1448412515"/>
 *               &lt;enumeration value="1448346658"/>
 *               &lt;enumeration value="1448259980"/>
 *               &lt;enumeration value="1448323573"/>
 *               &lt;enumeration value="1448359695"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="opening-timestamp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1448409600"/>
 *               &lt;enumeration value="1448341200"/>
 *               &lt;enumeration value="1448323200"/>
 *               &lt;enumeration value="1448283600"/>
 *               &lt;enumeration value="1448265600"/>
 *               &lt;enumeration value="1448258400"/>
 *               &lt;enumeration value="1448240400"/>
 *               &lt;enumeration value="1448182800"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="expiration-timestamp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1448442000"/>
 *               &lt;enumeration value="1448521200"/>
 *               &lt;enumeration value="1448424000"/>
 *               &lt;enumeration value="1448434800"/>
 *               &lt;enumeration value="1448449200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="close-type" type="{}close-typeType"/>
 *         &lt;element name="company" type="{}companyType"/>
 *         &lt;element name="position" type="{}positionType"/>
 *         &lt;element name="keyword">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ASP,OA,�����Է¡�����,�繫����,����ġ������͸�,���躸��,���,����,Hardware,ǰ�������Ͼ�,�׽�Ʈ�����Ͼ�,��������,Linux�迭,�������Ͼ�,QA���׽���,����,��Ʈ��ũ����,����,��Ʈ��ũ�����Ͼ�,���Ȱ���,���ȱ��,HW���ϵ����,SW������Ʈ����,��������,AS,SWǰ���׽���"/>
 *               &lt;enumeration value="�м�,��Ʈ��ũ����,��Ʈ��ũ�����Ͼ�,Windows2000,HW���ϵ����,SW������Ʈ����,��������,AS"/>
 *               &lt;enumeration value="��Ʈ������,�������衤IA"/>
 *               &lt;enumeration value="��Ʈ������,���,���̺��,���ͳ���ȭ,�������,�繫����,�Խ��ǰ���,�ιٿ��,���ͳݡ����,�ݼ��ͻ��,��ȭ�ֹ�,CS,�����,������,ȸ������,���ռ���(��Ƽ����),SV(���۹�����),QAA����ȭǰ��,CS���硤����,�ݼ��͸Ŵ���,��Ʈ�塤�����,���,�̵����,��������,LAN�����̺�,�������"/>
 *               &lt;enumeration value="���,�ڷ���,�����,����ϰ���,���ͳ���ȭ,�����Է¡�����,�ƿ��ٿ��,TM,���ͳݡ����,Ȩ���Ρ����θ�,���ǡ����衤ī��,�ιٿ��,�ݼ��ͻ��,CS,�����,������,������,ȸ������,���,��ų�Ʈ��ũ"/>
 *               &lt;enumeration value="��Ʈ������,���,�����,��������,��Ʈ��ũ����,����,��������,���Ȱ���,HW���ϵ����,SW������Ʈ����,��������,SWǰ���׽���,�����ͺ��̽�,DBA,����,ǰ������"/>
 *               &lt;enumeration value="����������,��������,��Ʈ��ũ����,����,�ý��ۿ"/>
 *               &lt;enumeration value="SI���ý�������,Excel����ǥ,PowerPoint,OA,�繫����,����ġ������͸�,�ιٿ��,�ݼ��ͻ��,CS,�����,������,������,��ȭ��ȯ,PDA������Ʈ��,�÷���APP"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="salary" type="{}salaryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobType", propOrder = {
    "id",
    "url",
    "active",
    "postingTimestamp",
    "modificationTimestamp",
    "openingTimestamp",
    "expirationTimestamp",
    "closeType",
    "company",
    "position",
    "keyword",
    "salary"
})
public class JobType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String active;
    @XmlElement(name = "posting-timestamp", required = true)
    protected String postingTimestamp;
    @XmlElement(name = "modification-timestamp", required = true)
    protected String modificationTimestamp;
    @XmlElement(name = "opening-timestamp", required = true)
    protected String openingTimestamp;
    @XmlElement(name = "expiration-timestamp", required = true)
    protected String expirationTimestamp;
    @XmlElement(name = "close-type", required = true)
    protected CloseTypeType closeType;
    @XmlElement(required = true)
    protected CompanyType company;
    @XmlElement(required = true)
    protected PositionType position;
    @XmlElement(required = true)
    protected String keyword;
    @XmlElement(required = true)
    protected SalaryType salary;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the postingTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingTimestamp() {
        return postingTimestamp;
    }

    /**
     * Sets the value of the postingTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingTimestamp(String value) {
        this.postingTimestamp = value;
    }

    /**
     * Gets the value of the modificationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationTimestamp() {
        return modificationTimestamp;
    }

    /**
     * Sets the value of the modificationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationTimestamp(String value) {
        this.modificationTimestamp = value;
    }

    /**
     * Gets the value of the openingTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningTimestamp() {
        return openingTimestamp;
    }

    /**
     * Sets the value of the openingTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningTimestamp(String value) {
        this.openingTimestamp = value;
    }

    /**
     * Gets the value of the expirationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationTimestamp() {
        return expirationTimestamp;
    }

    /**
     * Sets the value of the expirationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationTimestamp(String value) {
        this.expirationTimestamp = value;
    }

    /**
     * Gets the value of the closeType property.
     * 
     * @return
     *     possible object is
     *     {@link CloseTypeType }
     *     
     */
    public CloseTypeType getCloseType() {
        return closeType;
    }

    /**
     * Sets the value of the closeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseTypeType }
     *     
     */
    public void setCloseType(CloseTypeType value) {
        this.closeType = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setCompany(CompanyType value) {
        this.company = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setPosition(PositionType value) {
        this.position = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link SalaryType }
     *     
     */
    public SalaryType getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryType }
     *     
     */
    public void setSalary(SalaryType value) {
        this.salary = value;
    }

}


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
 *               &lt;enumeration value="25494076"/>
 *               &lt;enumeration value="25493153"/>
 *               &lt;enumeration value="25492575"/>
 *               &lt;enumeration value="25491812"/>
 *               &lt;enumeration value="25489800"/>
 *               &lt;enumeration value="25489125"/>
 *               &lt;enumeration value="25488120"/>
 *               &lt;enumeration value="25487887"/>
 *               &lt;enumeration value="25487008"/>
 *               &lt;enumeration value="25486608"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="url">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25494076#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25493153#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25492575#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25491812#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25489800#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25489125#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25488120#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25487887#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25487008#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *               &lt;enumeration value="http://www.saramin.co.kr/zf_user/recruit/recruit-view/idx/25486608#utm_source=job-search-api&amp;utm_medium=api&amp;utm_campaign=saramin-job-search-api"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posting-timestamp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1449024250"/>
 *               &lt;enumeration value="1449021253"/>
 *               &lt;enumeration value="1449019247"/>
 *               &lt;enumeration value="1449017305"/>
 *               &lt;enumeration value="1448973014"/>
 *               &lt;enumeration value="1448968945"/>
 *               &lt;enumeration value="1448964384"/>
 *               &lt;enumeration value="1448962957"/>
 *               &lt;enumeration value="1448960751"/>
 *               &lt;enumeration value="1448959487"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="modification-timestamp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1449024250"/>
 *               &lt;enumeration value="1449021332"/>
 *               &lt;enumeration value="1449019247"/>
 *               &lt;enumeration value="1449017305"/>
 *               &lt;enumeration value="1448973251"/>
 *               &lt;enumeration value="1448968945"/>
 *               &lt;enumeration value="1448964384"/>
 *               &lt;enumeration value="1448962957"/>
 *               &lt;enumeration value="1448960868"/>
 *               &lt;enumeration value="1448959487"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="opening-timestamp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1449021600"/>
 *               &lt;enumeration value="1449018000"/>
 *               &lt;enumeration value="1449014400"/>
 *               &lt;enumeration value="1448971200"/>
 *               &lt;enumeration value="1448967600"/>
 *               &lt;enumeration value="1448964000"/>
 *               &lt;enumeration value="1448960400"/>
 *               &lt;enumeration value="1448956800"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="expiration-timestamp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1449500399"/>
 *               &lt;enumeration value="1451573999"/>
 *               &lt;enumeration value="1988118000"/>
 *               &lt;enumeration value="1449727200"/>
 *               &lt;enumeration value="2019567600"/>
 *               &lt;enumeration value="1449046800"/>
 *               &lt;enumeration value="1454144400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="close-type" type="{}close-typeType"/>
 *         &lt;element name="company" type="{}companyType"/>
 *         &lt;element name="position" type="{}positionType"/>
 *         &lt;element name="keyword">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="전자상거래,쇼핑몰,php,Mysql,APM,Ajax,HTML코딩,퍼블리셔,웹표준·웹접근성,HTML5,CSS·스타일가이드"/>
 *               &lt;enumeration value="종합포털,컨텐츠제공,커뮤니티,CSS"/>
 *               &lt;enumeration value="성형외과,피부과,웹기획,웹마케팅,온라인마케팅,웹디자인,포토샵"/>
 *               &lt;enumeration value="아웃소싱,웹디자인,포토샵,드림위버,일러스트레이터,HTML코딩,퍼블리셔,웹표준·웹접근성,HTML5"/>
 *               &lt;enumeration value="웹에이전시,CSS,HTML코딩,퍼블리셔,웹표준·웹접근성"/>
 *               &lt;enumeration value="청소·방역,아웃소싱,파견대행,웹프로그래머,Java,html,Ajax,SW·소프트웨어,웹디자인,UI·UX디자인,HTML코딩,퍼블리셔,CSS·스타일가이드"/>
 *               &lt;enumeration value="비금융지주회사,웹마스터,Linux계열,웹프로듀서,QA·테스터,검증,웹기획,스토리보드,UI기획,모바일기획,웹서비스기획,웹프로그래머,ASP,Java,xml,Mysql,전산전공,MS-SQL,HTML코딩,퍼블리셔,웹표준·웹접근성,HTML5,CSS·스타일가이드"/>
 *               &lt;enumeration value="산업디자인,컨텐츠운영,웹디자인,포토샵,드림위버,CSS,HTML  ,HTML코딩,퍼블리셔,웹표준·웹접근성"/>
 *               &lt;enumeration value="통신,UI·UX디자인,HTML코딩,퍼블리셔"/>
 *               &lt;enumeration value="SI·시스템통합,ERP,시스템관리,소프트웨어개발,사이트운영,헬프데스크,컨텐츠운영,e-러닝운영,카페·블로그관리,웹디자인,포토샵,플래쉬,드림위버,자바스크립트,HTML코딩,단순웹작업,퍼블리셔,웹표준·웹접근성,웹디자인강의,프로그래밍,웹마스터,그래픽디자인,3D,코렐드로우,기업이미지"/>
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

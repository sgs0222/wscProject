
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
 *               &lt;enumeration value="ASP,OA,전산입력·편집,사무보조,리서치·모니터링,실험보조,통신,전자,Hardware,품질엔지니어,테스트엔지니어,웹마스터,Linux계열,웹엔지니어,QA·테스터,검증,네트워크관리,보안,네트워크엔지니어,보안관제,보안기술,HW·하드웨어,SW·소프트웨어,유지보수,AS,SW품질테스터"/>
 *               &lt;enumeration value="패션,네트워크관리,네트워크엔지니어,Windows2000,HW·하드웨어,SW·소프트웨어,유지보수,AS"/>
 *               &lt;enumeration value="네트웍구축,정보설계·IA"/>
 *               &lt;enumeration value="네트웍구축,통신,와이브로,인터넷전화,무선통신,사무보조,게시판관리,인바운드,인터넷·통신,콜센터상담,전화주문,CS,고객상담,고객응대,회원관리,통합센터(멀티센터),SV(슈퍼바이저),QAA·통화품질,CS강사·교육,콜센터매니저,파트장·운영보조,통신,이동통신,모바일통신,LAN·케이블,무선통신"/>
 *               &lt;enumeration value="통신,텔레콤,모바일,모바일게임,인터넷전화,전산입력·편집,아웃바운드,TM,인터넷·통신,홈쇼핑·쇼핑몰,증권·보험·카드,인바운드,콜센터상담,CS,고객상담,고객지원,고객응대,회원관리,통신,통신네트워크"/>
 *               &lt;enumeration value="네트웍구축,통신,모바일,서버관리,네트워크관리,보안,서버구축,보안관제,HW·하드웨어,SW·소프트웨어,유지보수,SW품질테스터,데이터베이스,DBA,안전,품질관리"/>
 *               &lt;enumeration value="서적·음반,서버관리,네트워크관리,보안,시스템운영"/>
 *               &lt;enumeration value="SI·시스템통합,Excel·도표,PowerPoint,OA,사무보조,리서치·모니터링,인바운드,콜센터상담,CS,고객상담,고객지원,고객응대,전화교환,PDA·스마트폰,플래시APP"/>
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

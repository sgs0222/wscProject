
package NaverAPI;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemCount" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="articles">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="article" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="articleid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="menuid" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nickname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="writedate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="newArticle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="readCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="commentCount" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemCount",
    "articles"
})
@XmlRootElement(name = "result")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Result {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected byte itemCount;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Result.Articles articles;

    /**
     * itemCount 속성의 값을 가져옵니다.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public byte getItemCount() {
        return itemCount;
    }

    /**
     * itemCount 속성의 값을 설정합니다.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setItemCount(byte value) {
        this.itemCount = value;
    }

    /**
     * articles 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Result.Articles }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Result.Articles getArticles() {
        return articles;
    }

    /**
     * articles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Result.Articles }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setArticles(Result.Articles value) {
        this.articles = value;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="article" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="articleid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="menuid" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nickname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="writedate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="newArticle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="readCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="commentCount" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "article"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Articles {

        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Result.Articles.Article> article;

        /**
         * Gets the value of the article property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the article property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArticle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Result.Articles.Article }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Result.Articles.Article> getArticle() {
            if (article == null) {
                article = new ArrayList<Result.Articles.Article>();
            }
            return this.article;
        }


        /**
         * <p>anonymous complex type에 대한 Java 클래스입니다.
         * 
         * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="articleid" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="menuid" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nickname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="writedate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="newArticle" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="readCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="commentCount" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "articleid",
            "menuid",
            "subject",
            "nickname",
            "writedate",
            "newArticle",
            "readCount",
            "commentCount"
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Article {

            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected int articleid;
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected short menuid;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String subject;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String nickname;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String writedate;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String newArticle;
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected short readCount;
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected byte commentCount;

            /**
             * articleid 속성의 값을 가져옵니다.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public int getArticleid() {
                return articleid;
            }

            /**
             * articleid 속성의 값을 설정합니다.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setArticleid(int value) {
                this.articleid = value;
            }

            /**
             * menuid 속성의 값을 가져옵니다.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public short getMenuid() {
                return menuid;
            }

            /**
             * menuid 속성의 값을 설정합니다.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMenuid(short value) {
                this.menuid = value;
            }

            /**
             * subject 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getSubject() {
                return subject;
            }

            /**
             * subject 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * nickname 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getNickname() {
                return nickname;
            }

            /**
             * nickname 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setNickname(String value) {
                this.nickname = value;
            }

            /**
             * writedate 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getWritedate() {
                return writedate;
            }

            /**
             * writedate 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setWritedate(String value) {
                this.writedate = value;
            }

            /**
             * newArticle 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getNewArticle() {
                return newArticle;
            }

            /**
             * newArticle 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setNewArticle(String value) {
                this.newArticle = value;
            }

            /**
             * readCount 속성의 값을 가져옵니다.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public short getReadCount() {
                return readCount;
            }

            /**
             * readCount 속성의 값을 설정합니다.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setReadCount(short value) {
                this.readCount = value;
            }

            /**
             * commentCount 속성의 값을 가져옵니다.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public byte getCommentCount() {
                return commentCount;
            }

            /**
             * commentCount 속성의 값을 설정합니다.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setCommentCount(byte value) {
                this.commentCount = value;
            }

        }

    }

}

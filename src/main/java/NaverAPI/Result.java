
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
 * <p>anonymous complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
     * itemCount �Ӽ��� ���� �����ɴϴ�.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public byte getItemCount() {
        return itemCount;
    }

    /**
     * itemCount �Ӽ��� ���� �����մϴ�.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setItemCount(byte value) {
        this.itemCount = value;
    }

    /**
     * articles �Ӽ��� ���� �����ɴϴ�.
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
     * articles �Ӽ��� ���� �����մϴ�.
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
     * <p>anonymous complex type�� ���� Java Ŭ�����Դϴ�.
     * 
     * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
         * <p>anonymous complex type�� ���� Java Ŭ�����Դϴ�.
         * 
         * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
             * articleid �Ӽ��� ���� �����ɴϴ�.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public int getArticleid() {
                return articleid;
            }

            /**
             * articleid �Ӽ��� ���� �����մϴ�.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setArticleid(int value) {
                this.articleid = value;
            }

            /**
             * menuid �Ӽ��� ���� �����ɴϴ�.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public short getMenuid() {
                return menuid;
            }

            /**
             * menuid �Ӽ��� ���� �����մϴ�.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMenuid(short value) {
                this.menuid = value;
            }

            /**
             * subject �Ӽ��� ���� �����ɴϴ�.
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
             * subject �Ӽ��� ���� �����մϴ�.
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
             * nickname �Ӽ��� ���� �����ɴϴ�.
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
             * nickname �Ӽ��� ���� �����մϴ�.
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
             * writedate �Ӽ��� ���� �����ɴϴ�.
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
             * writedate �Ӽ��� ���� �����մϴ�.
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
             * newArticle �Ӽ��� ���� �����ɴϴ�.
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
             * newArticle �Ӽ��� ���� �����մϴ�.
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
             * readCount �Ӽ��� ���� �����ɴϴ�.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public short getReadCount() {
                return readCount;
            }

            /**
             * readCount �Ӽ��� ���� �����մϴ�.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setReadCount(short value) {
                this.readCount = value;
            }

            /**
             * commentCount �Ӽ��� ���� �����ɴϴ�.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public byte getCommentCount() {
                return commentCount;
            }

            /**
             * commentCount �Ӽ��� ���� �����մϴ�.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-12-06T05:54:46+09:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setCommentCount(byte value) {
                this.commentCount = value;
            }

        }

    }

}

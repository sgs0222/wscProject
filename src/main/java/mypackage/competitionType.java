package mypackage;

/**
 * Created by hyemi on 2015-12-07.
 */
public class competitionType {
    String articleId;
    String subjectId;
    String writedata;

    public String getArticleId() {
        return articleId;
    }

    public competitionType(String articleId, String subjectId, String writedata) {
        this.articleId = articleId;
        this.subjectId = subjectId;
        this.writedata = writedata;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getWritedata() {
        return writedata;
    }

    public void setWritedata(String writedata) {
        this.writedata = writedata;
    }
}

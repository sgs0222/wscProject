package koreatech.cse.repository;


import koreatech.cse.domain.Searchable;
import koreatech.cse.repository.provider.UserSqlProvider;
import mypackage.competitionType;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface naverMapper {
    @Insert("INSERT INTO competition (subjectId, writedata) VALUES (#{subjectId}, #{writedata}")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "articleId", before = false, resultType = int.class)
    void insert(competitionType user);

    @Select("<script>"
            + "SELECT * FROM USERS"
            + "</script>")
    List<competitionType> findByScript(Searchable searchable);

    @Select("SELECT count(*) FROM USERS")
    int count();
}

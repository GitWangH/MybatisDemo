import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtil;


import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void queryCount() {
         Integer count= 0;
        SqlSession sqlSession = null;
        try{
            sqlSession = MybatisUtil.createSqlSession();
            count = sqlSession.getMapper(UserMapper.class).queryCount();
            System.out.print("============================");
            System.out.print(count);
        }catch (Exception e){
              e.printStackTrace();
        }finally {
              MybatisUtil.closeSqlSession(sqlSession);
        }



    }

    @Test
    public void queryAll() {
    }
}
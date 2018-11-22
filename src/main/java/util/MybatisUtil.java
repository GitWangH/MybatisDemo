package util;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private  static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            //通过Resources获取mybatis的配置信息并读入io流中
            InputStream in=Resources.getResourceAsStream("mybatis-config.xml");
            //通过sqlSessionFactory创建SqlSessionFactoryBuilder()
            //通过build(in)把输入流中的in添加进来

            sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
            System.out.print("sqlSessionFactory: "+sqlSessionFactory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession createSqlSession(){
        System.out.print("===========================");
        System.out.print(sqlSessionFactory.openSession());
        return  sqlSessionFactory.openSession();
    }
    public static void closeSqlSession(SqlSession sqlSession){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }


}

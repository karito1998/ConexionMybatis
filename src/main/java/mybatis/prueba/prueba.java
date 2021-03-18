package mybatis.prueba;

import mybatis.interfaz.virtualAliasesInterface;
import mybatis.model.virtualAliasesModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

public class prueba {
    public static void main (String[] a) {
        SqlSessionFactory sqlSessionFactory = null;
        SqlSession sqlSession = null;
        virtualAliasesInterface aliasesInterface;
        List<virtualAliasesModel> lista;
        try{
            String resource = "mybatisConfig.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlMapper.openSession();
            System.out.println("Select One");
            virtualAliasesModel vam = sqlSession.selectOne ("mybatis.interfaz.virtualAliasesInterface.getAliasById", 8L);
            System.out.println("id: "+vam.getId()+ " source: "+vam.getSource()+" destination: "+ vam.getDestination()+" status: "+ vam.getCurrentState());

            System.out.println("Select");
            List<virtualAliasesModel> vam1 = sqlSession.selectList ("mybatis.interfaz.virtualAliasesInterface.getAliases");
            for (int i =0; i<vam1.size();i++) {
                System.out.println("id: " + vam1.get(i).getId() + " source: " + vam1.get(i).getSource() + " destination: " + vam1.get(i).getDestination() + " status: " + vam1.get(i).getCurrentState());
            }
            System.out.println("Update One");
            virtualAliasesModel updateModel = new virtualAliasesModel();
            updateModel.setDateUpdate(ZonedDateTime.now(ZoneId.of("UTC")));
            updateModel.setCurrentState("INACTIVE");
            updateModel.setId(8L);
            Integer updated = sqlSession.update ("mybatis.interfaz.virtualAliasesInterface.updateAliasStatus", updateModel);
            sqlSession.commit();
            System.out.println(updateModel.getId());

            System.out.println("Insert One");
            virtualAliasesModel insertModel = new virtualAliasesModel();
            insertModel.setDomain_id(24717L);
            insertModel.setSource("gisselle@karolmicomco.com.co");
            insertModel.setDestination("mybatis@karolmicomco.com.co");
            insertModel.setCurrentState("ACTIVE");
            insertModel.setAliasforward(1L);
            Integer inserted = sqlSession.insert("mybatis.interfaz.virtualAliasesInterface.insertAlias", insertModel);
            sqlSession.commit();
            System.out.println(insertModel.getId());

            System.out.println("Delete One");
            Integer deleted = sqlSession.delete("mybatis.interfaz.virtualAliasesInterface.deleteAliasById", 148816);
            sqlSession.commit();
            System.out.println(deleted);

        }catch (IOException e){
                e.printStackTrace();
            }finally {
            try {
                if(sqlSession != null) sqlSession.close();
            } catch (Exception e){

            }
        }

    }
}

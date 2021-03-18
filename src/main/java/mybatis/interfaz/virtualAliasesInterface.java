package mybatis.interfaz;

import mybatis.model.virtualAliasesModel;

import java.util.List;

public interface virtualAliasesInterface {
    List<virtualAliasesModel> getAliases();
    virtualAliasesModel getAliasById(Long id);
    Long updateAliasStatus (virtualAliasesModel virtualAliases);
    Long insertAlias (virtualAliasesModel virtualAliases);
    Long deleteAliasById (Long id);
}

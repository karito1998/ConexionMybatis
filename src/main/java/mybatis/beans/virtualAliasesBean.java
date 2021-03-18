package mybatis.beans;

import mybatis.model.virtualAliasesModel;

public class virtualAliasesBean {
    private virtualAliasesModel aliasesModel;

    public virtualAliasesBean() {
        aliasesModel =  new virtualAliasesModel();
    }

    public virtualAliasesModel getAliasesModel() {
        return aliasesModel;
    }

    public void setAliasesModel(virtualAliasesModel aliasesModel) {
        this.aliasesModel = aliasesModel;
    }
}

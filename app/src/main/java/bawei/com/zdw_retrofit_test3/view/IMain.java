package bawei.com.zdw_retrofit_test3.view;


import java.util.List;

import bawei.com.zdw_retrofit_test3.model.ListGoodsBean;

public interface IMain {

    void showGoods(List<ListGoodsBean.DataBean> data);

    int pscid();
}

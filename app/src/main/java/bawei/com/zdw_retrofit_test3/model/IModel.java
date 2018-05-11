package bawei.com.zdw_retrofit_test3.model;

import java.util.Map;

public interface IModel {

    void getGoods(String url, Map<String, String> map, GoodsListener goodsListener);
}

package bawei.com.zdw_retrofit_test3.model;

import java.util.Map;

import bawei.com.zdw_retrofit_test3.util.HttpUtils;


public class GoodsModel implements IModel {
    @Override
    public void getGoods(String url, Map<String, String> map, final GoodsListener goodsListener) {

        HttpUtils httpUtils = HttpUtils.getHttpUtils();
        httpUtils.okPost(url,map);
        httpUtils.setOkLoadListener(new HttpUtils.OkLoadListener() {
            @Override
            public void okLoadSuccess(String json) {
                goodsListener.goodsSuccess(json);
            }

            @Override
            public void okLoadError(String error) {
                goodsListener.goodsError(error);
            }
        });
    }
}

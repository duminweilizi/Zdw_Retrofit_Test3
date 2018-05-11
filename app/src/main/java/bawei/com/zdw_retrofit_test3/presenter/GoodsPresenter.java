package bawei.com.zdw_retrofit_test3.presenter;

import com.google.gson.Gson;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import bawei.com.zdw_retrofit_test3.model.GoodsListener;
import bawei.com.zdw_retrofit_test3.model.IModel;
import bawei.com.zdw_retrofit_test3.model.ListGoodsBean;
import bawei.com.zdw_retrofit_test3.util.ApiUtil;
import bawei.com.zdw_retrofit_test3.view.IMain;


public class GoodsPresenter implements IPresenter {
    @Override
    public void showtoView(IModel iModel, final IMain iMain) {

        Map<String, String> gmap = new HashMap<>();
        gmap.put("pscid",String.valueOf(iMain.pscid()));

        iModel.getGoods(ApiUtil.goods_url, gmap, new GoodsListener() {
            @Override
            public void goodsSuccess(String json) {

                ListGoodsBean listGoodsBean = new Gson().fromJson(json, ListGoodsBean.class);
                List<ListGoodsBean.DataBean> data = listGoodsBean.getData();

                iMain.showGoods(data);
            }

            @Override
            public void goodsError(String error) {

            }
        });
    }
}

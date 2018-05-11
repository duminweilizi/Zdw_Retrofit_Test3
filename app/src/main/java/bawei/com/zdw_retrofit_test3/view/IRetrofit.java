package bawei.com.zdw_retrofit_test3.view;


import bawei.com.zdw_retrofit_test3.model.ListGoodsBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IRetrofit {

    @GET("product/getProducts")
    Call<ListGoodsBean> getlistgoods(@Query("pscid") int pscid);
}

package bawei.com.zdw_retrofit_test3.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

import bawei.com.zdw_retrofit_test3.R;
import butterknife.BindView;
import butterknife.ButterKnife;



public class MyHolderone extends RecyclerView.ViewHolder {

    @BindView(R.id.one_img)
    SimpleDraweeView oneImg;
    @BindView(R.id.one_text)
    TextView oneText;

    public MyHolderone(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);

    }
}

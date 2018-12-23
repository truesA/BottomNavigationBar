package com.lhm.view.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import com.lhm.view.R;


/**
 * Created on 2018/12/22 18:44
 * <p>
 * author lhm
 * <p>
 * Description:
 * <p>
 * Remarks:  field 加强  无放大缩小动画  可以修改 图片大小 文字大小  图片文字间隔  图片距离顶部高度  文字距离底部高度
 * 覆盖对应dimens属性  可看 BottomNavigationBar fixed_ex
 */
public class FixedExBottomNavigationTab extends BottomNavigationTab {


    public FixedExBottomNavigationTab(Context context) {
        super(context);
    }

    public FixedExBottomNavigationTab(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FixedExBottomNavigationTab(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public FixedExBottomNavigationTab(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }

    @Override
    void init() {
        paddingTopActive = (int) getResources().getDimension(R.dimen.fixed_ex_height_top_padding_active);
        paddingTopInActive = (int) getResources().getDimension(R.dimen.fixed_ex_height_top_padding_inactive);

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.fixed_ex_bottom_navigation_item, this, true);
        containerView = view.findViewById(R.id.fixed_ex_bottom_navigation_container);
        labelView = view.findViewById(R.id.fixed_ex_bottom_navigation_title);
        iconView = view.findViewById(R.id.fixed_ex_bottom_navigation_icon);
        iconContainerView = view.findViewById(R.id.fixed_ex_bottom_navigation_icon_container);
        badgeView = view.findViewById(R.id.fixed_ex_bottom_navigation_badge);

        super.init();
    }

    @Override
    protected void setNoTitleIconContainerParams(LayoutParams layoutParams) {
        layoutParams.height = getContext().getResources().getDimensionPixelSize(R.dimen.fixed_no_title_icon_container_height);
        layoutParams.width = getContext().getResources().getDimensionPixelSize(R.dimen.fixed_no_title_icon_container_width);
    }

    @Override
    protected void setNoTitleIconParams(LayoutParams layoutParams) {
        layoutParams.height = getContext().getResources().getDimensionPixelSize(R.dimen.fixed_no_title_icon_height);
        layoutParams.width = getContext().getResources().getDimensionPixelSize(R.dimen.fixed_no_title_icon_width);
    }
}

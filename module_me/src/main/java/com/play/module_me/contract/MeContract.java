package com.play.module_me.contract;

import com.play.library_mvp.base.common.BasePresenter;
import com.play.library_mvp.base.common.BaseViewImp;

public interface MeContract {

    interface View extends BaseViewImp {


    }

    abstract class Presenter extends BasePresenter<View> {

    }

}

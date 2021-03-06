package com.github.piasy.yamvp.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.github.piasy.yamvp.YaPresenter;
import com.github.piasy.yamvp.YaView;

/**
 * Created by Piasy{github.com/Piasy} on 17/09/2016.
 */

public abstract class YaMvpDiActivity<V extends YaView, P extends YaPresenter<V>, C extends
        BaseComponent<V, P>>
        extends AppCompatActivity implements HasComponent<C> {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initializeDi();
        super.onCreate(savedInstanceState);
    }

    protected abstract void initializeDi();
}

package app.compassites.com.loginsampleusingmvvm;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import app.compassites.com.loginsampleusingmvvm.databinding.ActivityMainBinding;
import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements LoginCallBack {

    private ActivityMainBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        dataBinding.setViewModel(ViewModelProviders
                .of(this, new LoginViewModelFactory(this))
                .get(LoginViewModel.class));
    }

    @Override
    public void onSuccess(String s) {
        Toasty.success(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String s) {
        Toasty.error(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }
}

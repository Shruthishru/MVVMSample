package app.compassites.com.loginsampleusingmvvm;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

/**
 * Created by shruthi on 2/8/18.
 */

public class LoginViewModelFactory implements ViewModelProvider.Factory {

    private LoginCallBack loginCallBack;
    public LoginViewModelFactory(LoginCallBack callBack) {
        this.loginCallBack=callBack;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(loginCallBack);
    }
}

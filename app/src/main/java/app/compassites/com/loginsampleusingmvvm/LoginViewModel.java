package app.compassites.com.loginsampleusingmvvm;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;

/**
 * Created by shruthi on 2/8/18.
 */

public class LoginViewModel extends ViewModel {

    private User user;

    private LoginCallBack dataListener;

    public LoginViewModel(LoginCallBack listener) {
        dataListener = listener;
        User user = new User("", "");
    }

    public TextWatcher getEmailTextWatcher() {

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setEmail(editable.toString());
            }
        };
    }

    public TextWatcher getPasswordTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setPassword(editable.toString());
            }
        };
    }

    public void onLoginClicked() {
        checkUserValidation();
    }

    private void checkUserValidation() {
        if (user.isInputDataValid())
            dataListener.onSuccess("Login successful");
        else
            dataListener.onFailure("Unsuccessful login");
    }
}

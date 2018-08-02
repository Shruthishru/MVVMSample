package app.compassites.com.loginsampleusingmvvm;

import android.databinding.BaseObservable;
import android.text.TextUtils;
import android.util.Patterns;


/**
 * Created by shruthi on 2/8/18.
 */

public class User extends BaseObservable {

    private String email;

    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyChange();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyChange();
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getEmail())
                && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
                && getPassword().length() > 5;
    }
}

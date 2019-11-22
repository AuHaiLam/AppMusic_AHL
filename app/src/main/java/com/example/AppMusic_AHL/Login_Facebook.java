package com.example.AppMusic_AHL;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;

public class Login_Facebook extends AppCompatActivity {
    private ProfilePictureView profilePictureView;
    private TextView mTvInfo, edtLink;
    private LoginButton mBtnLoginFacebook;
    private Button btnChiaseLink;
    private CallbackManager mCallbackManager;
    private ShareDialog shareDialog;
    private ShareLinkContent shareLinkContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__facebook);

        FacebookSdk.sdkInitialize(getApplicationContext());


        mCallbackManager = CallbackManager.Factory.create();
        mTvInfo = findViewById(R.id.tv_info);

        mBtnLoginFacebook = findViewById(R.id.login_button);
        profilePictureView = findViewById(R.id.ProfilePicture);


        mBtnLoginFacebook.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                mTvInfo.setText("User ID: " + loginResult.getAccessToken().getUserId());

                profilePictureView.setProfileId(Profile.getCurrentProfile().getId());
            }

            @Override
            public void onCancel() {
                mTvInfo.setText("Login canceled.");
            }

            @Override
            public void onError(FacebookException e) {
                mTvInfo.setText("Login failed.");
            }
        });

        shareDialog = new ShareDialog(Login_Facebook.this);
        btnChiaseLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ShareDialog.canShow(ShareLinkContent.class)) {
                    shareLinkContent = new ShareLinkContent.Builder()
                            .setContentUrl(Uri.parse(edtLink.getText().toString()))
                            .build();
                }
                shareDialog.show(shareLinkContent);
            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
    }


}


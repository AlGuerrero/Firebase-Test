package com.a13x.retrofit_proof;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.juancrg90.retrofit_proof.api.GithubClient;
import me.juancrg90.retrofit_proof.api.GithubService;
import me.juancrg90.retrofit_proof.api.Repository;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.buttonFetch)
    Button buttonFetch;
    @Bind(R.id.txtResult)
    TextView txtResult;

    GithubClient githubClient = new GithubClient();
    GithubService githubService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        githubService = githubClient.getGithubService();
    }

    @OnClick(R.id.buttonFetch)
    public void handleFetchClick() {
        Call<List<Repository>> call = githubService.listRepo("ShadowAlec");

        call.enqueue(new Callback<List<Repository>>() {
            @Override
            public void onResponse(Call<List<Repository>> call, Response<List<Repository>> response) {
                txtResult.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<List<Repository>> call, Throwable t) {
                txtResult.setText("Something went wrong: " + t.getMessage());

            }
        });

    }
}

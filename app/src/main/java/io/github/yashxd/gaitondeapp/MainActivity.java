package io.github.yashxd.gaitondeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String names[] = {"isa", "trivedi", "katekar", "badari", "bunty"};
    String types[] = {"accident", "NA", "raped", "shot", "shot twice"};

    private List<GModel> dummyData() {
        List<GModel> data = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            data.add(new GModel(names[i], types[i]));
        }
        return data;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        List<GModel> guys = dummyData();
        GAdapter adapter = new GAdapter(guys);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}

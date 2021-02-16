package com.denisdavydov.loftmoney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.denisdavydov.loftmoney.cells.MoneyCellAdapter;
import com.denisdavydov.loftmoney.cells.MoneyItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView itemsView;

    private MoneyCellAdapter moneyCellAdapter = new MoneyCellAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: - Here we will work with recycleview
        configureRecyclerView();

        generateMoney();


    }
    private void generateMoney() {
        List<MoneyItem> moneyItems = new ArrayList<>();
        moneyItems.add(new MoneyItem( title:"Sony", value:"1P"))
        moneyItems.add(new MoneyItem(title:"Z/P", value;"100P"));

        moneyCellAdapter.setData(moneyItems);
    }
    private void configureRecyclerView() {
        itemsView = findViewById(R.id.itemsView);
        itemsView.setAdapter(moneyCellAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);

        itemsView.setLayoutManager(layoutManager);

    }
}
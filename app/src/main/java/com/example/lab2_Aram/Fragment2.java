package com.example.lab2_Aram;

import android.os.Bundle;
import android.view.*;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends Fragment {
    Fragment2Adapter adapter;
    List<String> items = new ArrayList<>();

    Fragment2() {
        super(R.layout.fragment2_layout);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2_layout, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);

        items.add("Физика");
        items.add("Химия");
        items.add("Математика");
        items.add("Биология");
        items.add("Физика");
        items.add("Химия");
        items.add("Математика");
        items.add("Биология");
        items.add("Физика");
        items.add("Химия");
        items.add("Математика");
        items.add("Биология");
        items.add("Физика");
        items.add("Химия");
        items.add("Математика");
        items.add("Биология");



        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter = new Fragment2Adapter(this.getContext(), items);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}

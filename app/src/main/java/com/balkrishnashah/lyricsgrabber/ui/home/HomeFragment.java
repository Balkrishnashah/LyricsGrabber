package com.balkrishnashah.lyricsgrabber.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.balkrishnashah.lyricsgrabber.DrawerActivity;
import com.balkrishnashah.lyricsgrabber.MainActivity;
import com.balkrishnashah.lyricsgrabber.R;
import com.balkrishnashah.lyricsgrabber.ui.gallery.GalleryFragment;

public class HomeFragment extends Fragment {

    SearchView searchView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        searchView = root.findViewById(R.id.search_view);
        root.findViewById(R.id.search_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(), MainActivity.class);
                Toast.makeText(getActivity().getApplicationContext(),"msg:"+searchView.getQuery().toString(),Toast.LENGTH_SHORT).show();
                i.putExtra("song_name",searchView.getQuery().toString());
                startActivity(i);
             }
        });
        return root;
    }
}
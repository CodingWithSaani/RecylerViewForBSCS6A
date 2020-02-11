package com.tutorials180.recylerviewforbscs6a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.tutorials180.recylerviewforbscs6a.AdapterClasses.SocialMediaAdapter;
import com.tutorials180.recylerviewforbscs6a.ModelClass.SocialMediaModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<SocialMediaModelClass> objectArrayList;
    private RecyclerView objectRecyclerView;

    private SocialMediaAdapter objectSocialMediaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeObjects();
    }

    private void initializeObjects()
    {
        try
        {
            objectArrayList=new ArrayList<>();
            objectRecyclerView=findViewById(R.id.RV);

            addObjectsToList();
        }
        catch (Exception e)
        {
            Toast.makeText(this, "IO:"+
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void addObjectsToList()
    {
        try
        {
           objectArrayList.add(new SocialMediaModelClass(
                   R.drawable.pic_one
           ));

            objectArrayList.add(new SocialMediaModelClass(
                    R.drawable.pic_two
            ));

            objectArrayList.add(new SocialMediaModelClass(
                    R.drawable.pic_three
            ));

            objectArrayList.add(new SocialMediaModelClass(
                    R.drawable.pic_four
            ));

            objectArrayList.add(new SocialMediaModelClass(
                    R.drawable.pic_five
            ));

            objectArrayList.add(new SocialMediaModelClass(
                    R.drawable.pic_six
            ));

            objectArrayList.add(new SocialMediaModelClass(
                    R.drawable.pic_seven
            ));

            objectArrayList.add(new SocialMediaModelClass(
                    R.drawable.pic_eight
            ));

            objectArrayList.add(new SocialMediaModelClass(
                    R.drawable.pic_nice
            ));

            objectSocialMediaAdapter=new SocialMediaAdapter(
                    this,objectArrayList
            );

            connectRVTOAdapter();
        }
        catch (Exception e)
        {
            Toast.makeText(this, "addObjectsToList:"+
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void connectRVTOAdapter()
    {
        try
        {
            objectRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            objectRecyclerView.setAdapter(objectSocialMediaAdapter);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "connectRVToAdapter:"
                    +
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }












}

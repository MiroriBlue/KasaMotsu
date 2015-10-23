package app.com.example.tomohiro.kasamotsu.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    //ArrayAdapter
    private ArrayAdapter<String> adb;

    public MainActivityFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] data = {
                "test aaa bbb",
                "test ccc DDD",
                "test eee FFF"
        };

        List<String> weekforest = new ArrayList<String>(Arrays.asList(data));
        //Bind adapta
        adb = new ArrayAdapter<String>(
                getActivity(),
                R.layout.weatherdetail,
                R.id.list,
                weekforest);

        View rootView = inflater.inflate(R.layout.fragment_main,container,true);
        ListView displayList = (ListView) rootView.findViewById(R.id.list);
        displayList.setAdapter(adb);

        return rootView;

                }

        //return inflater.inflate(R.layout.fragment_main, container, false);
    }


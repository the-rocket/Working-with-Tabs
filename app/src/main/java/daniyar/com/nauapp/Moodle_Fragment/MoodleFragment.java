package daniyar.com.nauapp.Moodle_Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import daniyar.com.nauapp.R;

/**
 * Created by yernar on 30/09/16.
 */

public class MoodleFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.moodle_fragment, container, false);
        TextView textView = (TextView) view;
        textView.setText("Moodle_Fragment");
        return view;
    }
}
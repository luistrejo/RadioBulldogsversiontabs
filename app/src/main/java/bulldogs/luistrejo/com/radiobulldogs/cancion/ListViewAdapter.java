package bulldogs.luistrejo.com.radiobulldogs.cancion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import bulldogs.luistrejo.com.radiobulldogs.GamesFragment;
import bulldogs.luistrejo.com.radiobulldogs.R;

/**
 * Created by Luis Trejo on 01/01/2015.
 */
public class ListViewAdapter extends BaseAdapter {

    // Declare Variables
    Context context;
    LayoutInflater inflater;
    ArrayList<HashMap<String, String>> data;
    HashMap<String, String> resultp = new HashMap<String, String>();

    public ListViewAdapter(Context context,
                           ArrayList<HashMap<String, String>> arraylist) {
        this.context = context;
        data = arraylist;

    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        // Declare Variables
        TextView songtitle;
        TextView nexttitle;


        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        final View itemView = inflater.inflate(R.layout.list_item2, parent, false);
        // Get the position
        resultp = data.get(position);

        // Locate the TextViews in listview_item.xml
        songtitle = (TextView) itemView.findViewById(R.id.songtitle);
        nexttitle = (TextView) itemView.findViewById(R.id.nexttitle);


        // Capture position and set results to the TextViews
        songtitle.setText(resultp.get(GamesFragment.songtitle));
        nexttitle.setText(resultp.get(GamesFragment.nexttitle));

        // Capture ListView item click
        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


            }
        });
        return itemView;
    }
}


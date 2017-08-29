package app.com.example.android.delhiguide;

import android.content.Context;

import java.util.List;

/**
 * Created by Siddhant on 29-08-2017.
 */

public class Sights {

    public static void initSightsList(List<Location> list, Context context) {
        list.add(new Location(context.getString(R.string.sight_rf_name),
                context.getString(R.string.sight_rf_description),
                null,
                null,
                null,
                null,
                R.drawable.lalquila));

        list.add(new Location(context.getString(R.string.sight_rb_name),
                context.getString(R.string.sight_rb_description),
                null,
                null,
                null,
                null,
                R.drawable.rashtrapatibhavan));

        list.add(new Location(context.getString(R.string.sight_ig_name),
                context.getString(R.string.sight_ig_description),
                null,
                null,
                null,
                null,
                R.drawable.indiagate));

        list.add(new Location(context.getString(R.string.sight_qm_name),
                context.getString(R.string.sight_qm_description),
                null,
                null,
                null,
                null,
                R.drawable.qutabminar));

        list.add(new Location(context.getString(R.string.sight_nd_name),
                context.getString(R.string.sight_nd_description),
                null,
                null,
                null,
                null,
                R.drawable.nizamudindargah));

    }
}

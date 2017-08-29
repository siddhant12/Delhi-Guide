package app.com.example.android.delhiguide;

import android.content.Context;

import java.util.List;

/**
 * Created by Siddhant on 29-08-2017.
 */

public class Info {

    public static void initInfoList(List<Location> list, Context context) {
        list.add(new Location(context.getString(R.string.info_dm_name),
                context.getString(R.string.info_dm_description),
                null,
                null,
                null,
                null,
                -1));

        list.add(new Location(context.getString(R.string.info_cs_name),
                context.getString(R.string.info_cs_description),
                null,
                null,
                null,
                null,
                -1));
    }
}

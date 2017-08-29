package app.com.example.android.delhiguide;

import android.content.Context;

import java.util.List;

/**
 * Created by Siddhant on 27-08-2017.
 */

public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_cafeomg_name),
                context.getString(R.string.food_cafeomg_description),
                context.getString(R.string.food_cafeomg_address),
                context.getString(R.string.food_cafeomg_phone),
                context.getString(R.string.food_cafeomg_schedule),
                context.getString(R.string.food_cafeomg_price),
                R.drawable.cafeomg
        ));

        list.add(new Location(
                context.getString(R.string.food_bqc_name),
                context.getString(R.string.food_bqc_description),
                context.getString(R.string.food_bqc_address),
                context.getString(R.string.food_bqc_phone),
                context.getString(R.string.food_bqc_schedule),
                context.getString(R.string.food_bqc_price),
                R.drawable.bbq
        ));

        list.add(new Location(
                context.getString(R.string.food_gdb_name),
                context.getString(R.string.food_gdb_description),
                context.getString(R.string.food_gdb_address),
                context.getString(R.string.food_gdb_phone),
                context.getString(R.string.food_gdb_schedule),
                context.getString(R.string.food_gdb_price),
                R.drawable.gdb
        ));

        list.add(new Location(
                context.getString(R.string.food_dimcha_name),
                context.getString(R.string.food_dimcha_description),
                context.getString(R.string.food_dimcha_address),
                context.getString(R.string.food_dimcha_phone),
                context.getString(R.string.food_dimcha_schedule),
                context.getString(R.string.food_dimcha_price),
                R.drawable.dhimcha
        ));

        list.add(new Location(
                context.getString(R.string.food_52_name),
                context.getString(R.string.food_52_description),
                context.getString(R.string.food_52_address),
                context.getString(R.string.food_52_phone),
                context.getString(R.string.food_52_schedule),
                context.getString(R.string.food_52_price),
                R.drawable.janpath
        ));

    }
}

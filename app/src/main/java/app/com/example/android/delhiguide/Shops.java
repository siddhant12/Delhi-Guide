package app.com.example.android.delhiguide;

import android.content.Context;

import java.util.List;

/**
 * Created by Siddhant on 29-08-2017.
 */

public class Shops {

    public static void  initShopsList(List<Location> list, Context context)
    {
        list.add(new Location( context.getString(R.string.shop_cp_name),
                context.getString(R.string.shop_cp_description),
                context.getString(R.string.shop_cp_address),
                null,
                context.getString(R.string.shop_cp_schedule),
                null,
                R.drawable.cp));

        list.add(new Location( context.getString(R.string.shop_cc_name),
                context.getString(R.string.shop_cc_description),
                context.getString(R.string.shop_cc_address),
                null,
                context.getString(R.string.shop_cc_schedule),
                null,
                R.drawable.chandnichowk));


        list.add(new Location( context.getString(R.string.shop_se_name),
                context.getString(R.string.shop_se_description),
                context.getString(R.string.shop_se_address),
                null,
                context.getString(R.string.shop_se_schedule),
                null,
                R.drawable.southext));


        list.add(new Location( context.getString(R.string.shop_km_name),
                context.getString(R.string.shop_km_description),
                context.getString(R.string.shop_km_address),
                null,
                context.getString(R.string.shop_km_schedule),
                null,
                R.drawable.khan));

        list.add(new Location( context.getString(R.string.shop_dh_name),
                context.getString(R.string.shop_dh_description),
                context.getString(R.string.shop_dh_address),
                null,
                context.getString(R.string.shop_dh_schedule),
                null,
                R.drawable.delhihaat));
    }
}

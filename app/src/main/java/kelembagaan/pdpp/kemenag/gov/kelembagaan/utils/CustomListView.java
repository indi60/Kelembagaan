package kelembagaan.pdpp.kemenag.gov.kelembagaan.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by Amiral on 7/20/17.
 */

public class CustomListView extends ListView{

    private android.view.ViewGroup.LayoutParams params;
    private int oldCount = 0;

    public CustomListView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        if (getCount() != oldCount)
        {
            int height = getChildAt(0).getHeight() + 1 ;
            oldCount = getCount();
            params = getLayoutParams();
            params.height = getCount() * height;
            setLayoutParams(params);
        }

        super.onDraw(canvas);
    }
}

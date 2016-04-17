package Customized;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by md on 8/25/2015.
 */


/**
 * Created by md on 8/20/2015.
 */
public class CustomAwesomeText extends TextView {

    public CustomAwesomeText(Context context) {
        super(context);

        Typeface font = Typeface.createFromAsset( context.getAssets(), "fonts/fontawesome-webfont.ttf" );

        setTypeface(font);
    }


    public CustomAwesomeText(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/fontawesome-webfont.ttf" );

        setTypeface(font);
    }

    public CustomAwesomeText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface font = Typeface.createFromAsset( context.getAssets(), "fonts/fontawesome-webfont.ttf" );

        setTypeface(font);
    }

}

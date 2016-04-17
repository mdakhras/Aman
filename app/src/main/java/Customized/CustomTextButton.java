package Customized;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;


/**
 * Created by md on 8/5/2015.
 */
public class CustomTextButton extends Button {

    public CustomTextButton(Context context) {
        super(context);

        Typeface font = Typeface.createFromAsset( context.getAssets(), "fonts/DroidSansArabic.ttf" );

        setTypeface(font);
    }


    public CustomTextButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/DroidSansArabic.ttf" );

        setTypeface(font);
    }

    public CustomTextButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface font = Typeface.createFromAsset( context.getAssets(), "fonts/DroidSansArabic.ttf" );

        setTypeface(font);
    }


}

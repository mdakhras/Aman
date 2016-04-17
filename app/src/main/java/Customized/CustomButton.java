package Customized;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;


/**
 * Created by md on 8/5/2015.
 */
public class CustomButton extends Button {

    public CustomButton(Context context) {
        super(context);

        Typeface font = Typeface.createFromAsset( context.getAssets(), "fonts/fontawesome-webfont.ttf" );

        setTypeface(font);
    }


    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/fontawesome-webfont.ttf" );

        setTypeface(font);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface font = Typeface.createFromAsset( context.getAssets(), "fonts/fontawesome-webfont.ttf" );

        setTypeface(font);
    }


}

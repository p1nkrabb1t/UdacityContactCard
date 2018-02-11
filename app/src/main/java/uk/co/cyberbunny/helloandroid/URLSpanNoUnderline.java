package uk.co.cyberbunny.helloandroid;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.URLSpan;

/**
 * Created by Ha3el on 25/11/2017.
 */

public class URLSpanNoUnderline extends URLSpan {
    public URLSpanNoUnderline(String p_Url) {
        super(p_Url);
    }

    public void updateDrawState(TextPaint p_DrawState) {
        super.updateDrawState(p_DrawState);
        p_DrawState.setUnderlineText(false);
    }

    public static void removeUnderlines(Spannable text) {
    }
}

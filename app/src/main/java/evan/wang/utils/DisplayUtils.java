package evan.wang.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.Window;

/**
 * Created by yd_lzk on 2017/4/19.
 */

public class DisplayUtils {

    public static int calculateStatusBarHeight(Activity context){
        Rect rectangle = new Rect();
        Window window = context.getWindow();
        window.getDecorView().getWindowVisibleDisplayFrame(rectangle);
        int statusBarHeight = rectangle.top;
        int contentViewTop =
                window.findViewById(Window.ID_ANDROID_CONTENT).getTop();
        return contentViewTop - statusBarHeight;
    }

    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}

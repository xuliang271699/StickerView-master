package com.example.abner.stickerdemo.view;

import android.content.Context;
import android.util.AttributeSet;

/**这个View起到作用是把在该View范围内的StickerView一起带动移动
 *
 *
 *
 *
 * Created by xuliang on 15/10/13.
 */
public class StickerBigView extends StickerView {

    public StickerBigView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StickerBigView(Context context) {
        super(context);
    }

    public StickerBigView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    //需要一个View集合  记录对象
//    private List<View>  list_include_view=new ArrayList<>();//针对这个需要提供两个方法，添加和删除
//
//
//
//
//    public StickerBigView(Context context) {
//        super(context);
//    }
//
//    public StickerBigView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public StickerBigView(Context context, AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }
//
//    //需要重写的是当移动的时候所发生的事情
//
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
////        return super.onTouchEvent(event);
//        //需要重写一点的是，当移动的时候，把在该View范围内的View一起带动移动
//
//        int action = MotionEventCompat.getActionMasked(event);
//        boolean handled = true;
//        //这里我还需要判断一个双击事件，然后来开启一个接口给外面来调用
//
//        switch (action) {
//
//            //移动前先判断那些View在bigView里面
//            getMoveView();
//            //判断好了后在进行移动
//            putMoveViewInList();
//
//            case MotionEvent.ACTION_DOWN:
//                float x = event.getX(0);
//                float y = event.getY(0);
//                //TODO 移动区域判断 不能超出屏幕
//                matrix.postTranslate(x - lastX, y - lastY);
//                lastX = x;
//                lastY = y;
//                //吧所有的在里面和bigView一起移动
//                getMovewList();
//                //开始移动
//                startMovew();
//                //刷新界面
//                invalidate();
//                break;
//        }
//    }
//
//
//    /**
//     * 添加view到移动列表里面
//     * @param view
//     */
//    public void addView(StickerView view){
//        this.list_include_view.add(view);
//
//    }
//
//    /**
//     * 删除移动列表里面的View
//     * @param view
//     */
//    public void deleView(StickerView view){
//        this.list_include_view.remove(view);
//    }

}

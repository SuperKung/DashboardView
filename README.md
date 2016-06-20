# DashboardView
Android 自定义View 仪表盘

##使用

###gradle中

```Groovy
compile 'com.superkung:dashboard-view:1.0.0'
```
###xml中
```xml
<com.anderson.dashboardview.view.DashboardView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/panView"
        android:text="当前速度"
        app:Unit="m/s"/>
```
    更多可选属性
```xml
  app:startNumber
  app:maxNumber
  app:backgroundColor
  app:progressColor
  app:startProgressColor
  app:endProgressColor
```
###java代码中
```java
setPercent(int percent);//核心方法，percent = 1~100
//以下方法都可有可无，如果在xml中设置了则不必重复设置,适用于需要动态改变状态的情况
setText(String text);
setTextSize(int size);
setTextColor(int mTextColor);
setProgressHeight(int dp);
setUnit(String unit);
setInterpolator(TimeInterpolator interpolator);//设置动画插值器，从而达到不同的动画效果
setStartColor(int startColor);
setEndColor(int endColor);//如果设置了起始颜色和结束颜色，进度条会变成渐变色
setStartNum(float startNum);
setMaxNum(float startNum);
```

[该篇文章相关博客](http://blog.csdn.net/qq_17422503)  
